/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */

/****************************************************************
 * File: loci.h
 *
 * DO NOT EDIT
 *
 * This file is automatically generated
 *
 ****************************************************************/


#if !defined(_LOCI_H_)
#define _LOCI_H_


#include <loci/loci_base.h>
#include <loci/of_message.h>
#include <loci/of_match.h>
#include <loci/of_object.h>
#include <loci/loci_classes.h>
#include <loci/loci_class_metadata.h>

/****************************************************************
 *
 * This file is divided into the following sections.
 *
 * A few object specific macros
 * Class typedefs (no struct definitions)
 * Per-data type accessor function typedefs
 * Per-class new/delete function typedefs
 * Per-class static delete functions
 * Per-class, per-member accessor declarations
 * Per-class structure definitions
 * Generic union (inheritance) definitions
 * Pointer set function declarations
 * Some special case macros
 *
 ****************************************************************/


typedef enum loci_log_level {
    LOCI_LOG_LEVEL_TRACE,
    LOCI_LOG_LEVEL_VERBOSE,
    LOCI_LOG_LEVEL_INFO,
    LOCI_LOG_LEVEL_WARN,
    LOCI_LOG_LEVEL_ERROR,
    LOCI_LOG_LEVEL_MSG
} loci_log_level_t;

/**
 * @brief Output a log message.
 * @param level The log level.
 * @param fname The function name.
 * @param file The file name.
 * @param line The line number.
 * @param format The message format string.
 */
typedef int (*loci_logger_f)(loci_log_level_t level,
                             const char *fname, const char *file, int line,
                             const char *format, ...);

/*
 * This variable should be set by the user of the library to redirect logs to
 * their log infrastructure. The default drops all logs.
 */
extern loci_logger_f loci_logger;

/**
 * Map a generic object to the underlying wire buffer
 *
 * Treat as private
 */
#define OF_OBJECT_TO_MESSAGE(obj) \
    ((of_message_t)(WBUF_BUF((obj)->wbuf)))

/**
 * Macro for the fixed length part of an object
 *
 * @param obj The object whose extended length is being calculated
 * @returns length in bytes of non-variable part of the object
 */
#define OF_OBJECT_FIXED_LENGTH(obj) \
    (of_object_fixed_len[(obj)->version][(obj)->object_id])

/**
 * Return the length of the object beyond its fixed length
 *
 * @param obj The object whose extended length is being calculated
 * @returns length in bytes of non-variable part of the object
 *
 * Most variable length fields are alone at the end of a structure.
 * Their length is a simple calculation, just the total length of
 * the parent minus the length of the non-variable part of the
 * parent's class type.
 */

#define OF_OBJECT_VARIABLE_LENGTH(obj) \
    ((obj)->length - OF_OBJECT_FIXED_LENGTH(obj))

extern int of_wire_buffer_of_match_get(of_object_t *obj, int offset,
                                    of_match_t *match);
extern int of_wire_buffer_of_match_set(of_object_t *obj, int offset,
                                    of_match_t *match, int cur_len);

/****************************************************************
 *
 * Declarations of maps between on-the-wire type values and LOCI identifiers
 *
 ****************************************************************/

int of_object_wire_init(of_object_t *obj, of_object_id_t base_object_id, int max_len);

extern const int *const of_object_fixed_len[OF_VERSION_ARRAY_MAX];
extern const int *const of_object_extra_len[OF_VERSION_ARRAY_MAX];

/****************************************************************
 * Wire type/length functions.
 ****************************************************************/

extern void of_object_message_wire_length_get(of_object_t *obj, int *bytes);
extern void of_object_message_wire_length_set(of_object_t *obj, int bytes);

extern void of_oxm_wire_length_get(of_object_t *obj, int *bytes);

extern void of_tlv16_wire_length_get(of_object_t *obj, int *bytes);
extern void of_tlv16_wire_length_set(of_object_t *obj, int bytes);

/* Wire length is uint16 at front of structure */
extern void of_u16_len_wire_length_get(of_object_t *obj, int *bytes);
extern void of_u16_len_wire_length_set(of_object_t *obj, int bytes);

#define OF_OXM_LENGTH_GET(hdr) (((hdr) & 0xff) + 4)
#define OF_OXM_LENGTH_SET(hdr, val)                         \
    (hdr) = ((hdr) & 0xffffff00) + (((val) - 4) & 0xff)

extern void of_packet_queue_wire_length_get(of_object_t *obj, int *bytes);
extern void of_packet_queue_wire_length_set(of_object_t *obj, int bytes);

extern void of_list_meter_band_stats_wire_length_get(of_object_t *obj,
                                                    int *bytes);
extern void of_meter_stats_wire_length_get(of_object_t *obj, int *bytes);
extern void of_meter_stats_wire_length_set(of_object_t *obj, int bytes);


/*
 * Match serialize/deserialize declarations
 * Wire match conversion function declarations
 */
extern int of_match_serialize(of_version_t version, of_match_t *match,
                              of_octets_t *octets);
extern int of_match_deserialize(of_version_t version, of_match_t *match,
                                of_object_t *parent, int offset, int length);
extern int of_match_v1_to_match(of_match_v1_t *src, of_match_t *dst);
extern int of_match_v2_to_match(of_match_v2_t *src, of_match_t *dst);
extern int of_match_v3_to_match(of_match_v3_t *src, of_match_t *dst);
extern int of_match_to_wire_match_v1(of_match_t *src, of_match_v1_t *dst);
extern int of_match_to_wire_match_v2(of_match_t *src, of_match_v2_t *dst);
extern int of_match_to_wire_match_v3(of_match_t *src, of_match_v3_t *dst);

/**
 * Macro to check consistency of length for top level objects
 *
 * If the object has no parent then its length should match the
 * underlying wire buffer's current bytes.
 */
#define OF_LENGTH_CHECK_ASSERT(obj) \
    LOCI_ASSERT(((obj)->parent != NULL) || \
     ((obj)->wbuf == NULL) || \
     (WBUF_CURRENT_BYTES((obj)->wbuf) == (obj)->length))

#define OF_DEBUG_DUMP
#if defined(OF_DEBUG_DUMP)
extern void dump_match(of_match_t *match);
#endif /* OF_DEBUG_DUMP */

static inline const char *
of_class_name(of_object_t *obj)
{
    return of_object_id_str[obj->object_id];
}

#endif /* Top header file */
