/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_l3_interface_class_id_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x86); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_l3_interface_class_id of_bsn_tlv_l3_interface_class_id
 */

/**
 * Create a new of_bsn_tlv_l3_interface_class_id object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_l3_interface_class_id
 */

of_object_t *
of_bsn_tlv_l3_interface_class_id_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_L3_INTERFACE_CLASS_ID];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_l3_interface_class_id_init(obj, version, bytes, 0);
    of_bsn_tlv_l3_interface_class_id_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_l3_interface_class_id.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_l3_interface_class_id_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_L3_INTERFACE_CLASS_ID] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_L3_INTERFACE_CLASS_ID];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_L3_INTERFACE_CLASS_ID;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_l3_interface_class_id.
 * @param obj Pointer to an object of type of_bsn_tlv_l3_interface_class_id.
 * @param value Pointer to the child object of type
 * uint32_t to be filled out.
 *
 */
void
of_bsn_tlv_l3_interface_class_id_value_get(
    of_bsn_tlv_l3_interface_class_id_t *obj,
    uint32_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_L3_INTERFACE_CLASS_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_l3_interface_class_id.
 * @param obj Pointer to an object of type of_bsn_tlv_l3_interface_class_id.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_l3_interface_class_id_value_set(
    of_bsn_tlv_l3_interface_class_id_t *obj,
    uint32_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_L3_INTERFACE_CLASS_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_l3_src_class_id_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x87); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_l3_src_class_id of_bsn_tlv_l3_src_class_id
 */

/**
 * Create a new of_bsn_tlv_l3_src_class_id object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_l3_src_class_id
 */

of_object_t *
of_bsn_tlv_l3_src_class_id_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_L3_SRC_CLASS_ID];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_l3_src_class_id_init(obj, version, bytes, 0);
    of_bsn_tlv_l3_src_class_id_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_l3_src_class_id.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_l3_src_class_id_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_L3_SRC_CLASS_ID] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_L3_SRC_CLASS_ID];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_L3_SRC_CLASS_ID;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_l3_src_class_id.
 * @param obj Pointer to an object of type of_bsn_tlv_l3_src_class_id.
 * @param value Pointer to the child object of type
 * uint32_t to be filled out.
 *
 */
void
of_bsn_tlv_l3_src_class_id_value_get(
    of_bsn_tlv_l3_src_class_id_t *obj,
    uint32_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_L3_SRC_CLASS_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_l3_src_class_id.
 * @param obj Pointer to an object of type of_bsn_tlv_l3_src_class_id.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_l3_src_class_id_value_set(
    of_bsn_tlv_l3_src_class_id_t *obj,
    uint32_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_L3_SRC_CLASS_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_lag_options_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xa0); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_lag_options of_bsn_tlv_lag_options
 */

/**
 * Create a new of_bsn_tlv_lag_options object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_lag_options
 */

of_object_t *
of_bsn_tlv_lag_options_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LAG_OPTIONS];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_lag_options_init(obj, version, bytes, 0);
    of_bsn_tlv_lag_options_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_lag_options.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_lag_options_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LAG_OPTIONS] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LAG_OPTIONS];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LAG_OPTIONS;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get flags from an object of type of_bsn_tlv_lag_options.
 * @param obj Pointer to an object of type of_bsn_tlv_lag_options.
 * @param flags Pointer to the child object of type
 * uint16_t to be filled out.
 *
 */
void
of_bsn_tlv_lag_options_flags_get(
    of_bsn_tlv_lag_options_t *obj,
    uint16_t *flags)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LAG_OPTIONS);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_get(wbuf, abs_offset, flags);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set flags in an object of type of_bsn_tlv_lag_options.
 * @param obj Pointer to an object of type of_bsn_tlv_lag_options.
 * @param flags The value to write into the object
 */
void
of_bsn_tlv_lag_options_flags_set(
    of_bsn_tlv_lag_options_t *obj,
    uint16_t flags)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LAG_OPTIONS);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_set(wbuf, abs_offset, flags);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_link_up_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xc1); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_link_up of_bsn_tlv_link_up
 */

/**
 * Create a new of_bsn_tlv_link_up object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_link_up
 */

of_object_t *
of_bsn_tlv_link_up_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LINK_UP];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_link_up_init(obj, version, bytes, 0);
    of_bsn_tlv_link_up_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_link_up.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_link_up_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LINK_UP] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LINK_UP];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LINK_UP;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_loopback_mode_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x92); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_loopback_mode of_bsn_tlv_loopback_mode
 */

/**
 * Create a new of_bsn_tlv_loopback_mode object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_loopback_mode
 */

of_object_t *
of_bsn_tlv_loopback_mode_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_MODE];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_loopback_mode_init(obj, version, bytes, 0);
    of_bsn_tlv_loopback_mode_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_loopback_mode.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_loopback_mode_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_MODE] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_MODE];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LOOPBACK_MODE;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_loopback_mode.
 * @param obj Pointer to an object of type of_bsn_tlv_loopback_mode.
 * @param value Pointer to the child object of type
 * uint8_t to be filled out.
 *
 */
void
of_bsn_tlv_loopback_mode_value_get(
    of_bsn_tlv_loopback_mode_t *obj,
    uint8_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LOOPBACK_MODE);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_loopback_mode.
 * @param obj Pointer to an object of type of_bsn_tlv_loopback_mode.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_loopback_mode_value_set(
    of_bsn_tlv_loopback_mode_t *obj,
    uint8_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LOOPBACK_MODE);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_loopback_port_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x6e); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_loopback_port of_bsn_tlv_loopback_port
 */

/**
 * Create a new of_bsn_tlv_loopback_port object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_loopback_port
 */

of_object_t *
of_bsn_tlv_loopback_port_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_PORT];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_loopback_port_init(obj, version, bytes, 0);
    of_bsn_tlv_loopback_port_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_loopback_port.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_loopback_port_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_PORT] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LOOPBACK_PORT];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LOOPBACK_PORT;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_loopback_port.
 * @param obj Pointer to an object of type of_bsn_tlv_loopback_port.
 * @param value Pointer to the child object of type
 * of_port_no_t to be filled out.
 *
 */
void
of_bsn_tlv_loopback_port_value_get(
    of_bsn_tlv_loopback_port_t *obj,
    of_port_no_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LOOPBACK_PORT);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_port_no_get(ver, wbuf, abs_offset, value);
    OF_PORT_NO_VALUE_CHECK(*value, ver);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_loopback_port.
 * @param obj Pointer to an object of type of_bsn_tlv_loopback_port.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_loopback_port_value_set(
    of_bsn_tlv_loopback_port_t *obj,
    of_port_no_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_LOOPBACK_PORT);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_port_no_set(ver, wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_lossless_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xbc); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_lossless of_bsn_tlv_lossless
 */

/**
 * Create a new of_bsn_tlv_lossless object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_lossless
 */

of_object_t *
of_bsn_tlv_lossless_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LOSSLESS];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_lossless_init(obj, version, bytes, 0);
    of_bsn_tlv_lossless_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_lossless.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_lossless_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LOSSLESS] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LOSSLESS];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LOSSLESS;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_lr_all_enabled_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xb2); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_lr_all_enabled of_bsn_tlv_lr_all_enabled
 */

/**
 * Create a new of_bsn_tlv_lr_all_enabled object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_lr_all_enabled
 */

of_object_t *
of_bsn_tlv_lr_all_enabled_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_LR_ALL_ENABLED];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_lr_all_enabled_init(obj, version, bytes, 0);
    of_bsn_tlv_lr_all_enabled_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_lr_all_enabled.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_lr_all_enabled_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_LR_ALL_ENABLED] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_LR_ALL_ENABLED];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_LR_ALL_ENABLED;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mac_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x1); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mac of_bsn_tlv_mac
 */

/**
 * Create a new of_bsn_tlv_mac object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mac
 */

of_object_t *
of_bsn_tlv_mac_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MAC];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mac_init(obj, version, bytes, 0);
    of_bsn_tlv_mac_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mac.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mac_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MAC] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MAC];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MAC;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_mac.
 * @param value Pointer to the child object of type
 * of_mac_addr_t to be filled out.
 *
 */
void
of_bsn_tlv_mac_value_get(
    of_bsn_tlv_mac_t *obj,
    of_mac_addr_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_mac.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_mac_value_set(
    of_bsn_tlv_mac_t *obj,
    of_mac_addr_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mac_mask_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x38); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mac_mask of_bsn_tlv_mac_mask
 */

/**
 * Create a new of_bsn_tlv_mac_mask object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mac_mask
 */

of_object_t *
of_bsn_tlv_mac_mask_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MAC_MASK];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mac_mask_init(obj, version, bytes, 0);
    of_bsn_tlv_mac_mask_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mac_mask.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mac_mask_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MAC_MASK] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MAC_MASK];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MAC_MASK;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_mac_mask.
 * @param obj Pointer to an object of type of_bsn_tlv_mac_mask.
 * @param value Pointer to the child object of type
 * of_mac_addr_t to be filled out.
 *
 */
void
of_bsn_tlv_mac_mask_value_get(
    of_bsn_tlv_mac_mask_t *obj,
    of_mac_addr_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MAC_MASK);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_mac_mask.
 * @param obj Pointer to an object of type of_bsn_tlv_mac_mask.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_mac_mask_value_set(
    of_bsn_tlv_mac_mask_t *obj,
    of_mac_addr_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MAC_MASK);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mcg_type_vxlan_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x57); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mcg_type_vxlan of_bsn_tlv_mcg_type_vxlan
 */

/**
 * Create a new of_bsn_tlv_mcg_type_vxlan object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mcg_type_vxlan
 */

of_object_t *
of_bsn_tlv_mcg_type_vxlan_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MCG_TYPE_VXLAN];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mcg_type_vxlan_init(obj, version, bytes, 0);
    of_bsn_tlv_mcg_type_vxlan_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mcg_type_vxlan.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mcg_type_vxlan_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MCG_TYPE_VXLAN] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MCG_TYPE_VXLAN];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MCG_TYPE_VXLAN;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_miss_packets_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xd); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_miss_packets of_bsn_tlv_miss_packets
 */

/**
 * Create a new of_bsn_tlv_miss_packets object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_miss_packets
 */

of_object_t *
of_bsn_tlv_miss_packets_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MISS_PACKETS];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_miss_packets_init(obj, version, bytes, 0);
    of_bsn_tlv_miss_packets_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_miss_packets.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_miss_packets_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MISS_PACKETS] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MISS_PACKETS];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MISS_PACKETS;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_miss_packets.
 * @param obj Pointer to an object of type of_bsn_tlv_miss_packets.
 * @param value Pointer to the child object of type
 * uint64_t to be filled out.
 *
 */
void
of_bsn_tlv_miss_packets_value_get(
    of_bsn_tlv_miss_packets_t *obj,
    uint64_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MISS_PACKETS);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u64_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_miss_packets.
 * @param obj Pointer to an object of type of_bsn_tlv_miss_packets.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_miss_packets_value_set(
    of_bsn_tlv_miss_packets_t *obj,
    uint64_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MISS_PACKETS);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u64_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mpls_control_word_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x3e); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mpls_control_word of_bsn_tlv_mpls_control_word
 */

/**
 * Create a new of_bsn_tlv_mpls_control_word object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mpls_control_word
 */

of_object_t *
of_bsn_tlv_mpls_control_word_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_CONTROL_WORD];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mpls_control_word_init(obj, version, bytes, 0);
    of_bsn_tlv_mpls_control_word_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mpls_control_word.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mpls_control_word_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MPLS_CONTROL_WORD] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_CONTROL_WORD];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MPLS_CONTROL_WORD;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_mpls_control_word.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_control_word.
 * @param value Pointer to the child object of type
 * uint8_t to be filled out.
 *
 */
void
of_bsn_tlv_mpls_control_word_value_get(
    of_bsn_tlv_mpls_control_word_t *obj,
    uint8_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_CONTROL_WORD);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_mpls_control_word.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_control_word.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_mpls_control_word_value_set(
    of_bsn_tlv_mpls_control_word_t *obj,
    uint8_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_CONTROL_WORD);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mpls_label_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x3d); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mpls_label of_bsn_tlv_mpls_label
 */

/**
 * Create a new of_bsn_tlv_mpls_label object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mpls_label
 */

of_object_t *
of_bsn_tlv_mpls_label_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_LABEL];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mpls_label_init(obj, version, bytes, 0);
    of_bsn_tlv_mpls_label_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mpls_label.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mpls_label_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MPLS_LABEL] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_LABEL];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MPLS_LABEL;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_mpls_label.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_label.
 * @param value Pointer to the child object of type
 * uint32_t to be filled out.
 *
 */
void
of_bsn_tlv_mpls_label_value_get(
    of_bsn_tlv_mpls_label_t *obj,
    uint32_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_LABEL);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_mpls_label.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_label.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_mpls_label_value_set(
    of_bsn_tlv_mpls_label_t *obj,
    uint32_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_LABEL);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_mpls_sequenced_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x3f); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_mpls_sequenced of_bsn_tlv_mpls_sequenced
 */

/**
 * Create a new of_bsn_tlv_mpls_sequenced object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_mpls_sequenced
 */

of_object_t *
of_bsn_tlv_mpls_sequenced_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_SEQUENCED];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_mpls_sequenced_init(obj, version, bytes, 0);
    of_bsn_tlv_mpls_sequenced_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_mpls_sequenced.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_mpls_sequenced_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MPLS_SEQUENCED] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MPLS_SEQUENCED];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MPLS_SEQUENCED;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_mpls_sequenced.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_sequenced.
 * @param value Pointer to the child object of type
 * uint8_t to be filled out.
 *
 */
void
of_bsn_tlv_mpls_sequenced_value_get(
    of_bsn_tlv_mpls_sequenced_t *obj,
    uint8_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_SEQUENCED);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_mpls_sequenced.
 * @param obj Pointer to an object of type of_bsn_tlv_mpls_sequenced.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_mpls_sequenced_value_set(
    of_bsn_tlv_mpls_sequenced_t *obj,
    uint8_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MPLS_SEQUENCED);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u8_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_multicast_interface_id_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x5f); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_multicast_interface_id of_bsn_tlv_multicast_interface_id
 */

/**
 * Create a new of_bsn_tlv_multicast_interface_id object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_multicast_interface_id
 */

of_object_t *
of_bsn_tlv_multicast_interface_id_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_INTERFACE_ID];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_multicast_interface_id_init(obj, version, bytes, 0);
    of_bsn_tlv_multicast_interface_id_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_multicast_interface_id.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_multicast_interface_id_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_INTERFACE_ID] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_INTERFACE_ID];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MULTICAST_INTERFACE_ID;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_multicast_interface_id.
 * @param obj Pointer to an object of type of_bsn_tlv_multicast_interface_id.
 * @param value Pointer to the child object of type
 * uint32_t to be filled out.
 *
 */
void
of_bsn_tlv_multicast_interface_id_value_get(
    of_bsn_tlv_multicast_interface_id_t *obj,
    uint32_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTICAST_INTERFACE_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_multicast_interface_id.
 * @param obj Pointer to an object of type of_bsn_tlv_multicast_interface_id.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_multicast_interface_id_value_set(
    of_bsn_tlv_multicast_interface_id_t *obj,
    uint32_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTICAST_INTERFACE_ID);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_multicast_packet_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xaa); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_multicast_packet of_bsn_tlv_multicast_packet
 */

/**
 * Create a new of_bsn_tlv_multicast_packet object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_multicast_packet
 */

of_object_t *
of_bsn_tlv_multicast_packet_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_PACKET];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_multicast_packet_init(obj, version, bytes, 0);
    of_bsn_tlv_multicast_packet_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_multicast_packet.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_multicast_packet_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_PACKET] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTICAST_PACKET];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MULTICAST_PACKET;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_multicast_packet.
 * @param obj Pointer to an object of type of_bsn_tlv_multicast_packet.
 * @param value Pointer to the child object of type
 * uint16_t to be filled out.
 *
 */
void
of_bsn_tlv_multicast_packet_value_get(
    of_bsn_tlv_multicast_packet_t *obj,
    uint16_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTICAST_PACKET);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_multicast_packet.
 * @param obj Pointer to an object of type of_bsn_tlv_multicast_packet.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_multicast_packet_value_set(
    of_bsn_tlv_multicast_packet_t *obj,
    uint16_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTICAST_PACKET);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_multiplier_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0xae); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_multiplier of_bsn_tlv_multiplier
 */

/**
 * Create a new of_bsn_tlv_multiplier object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_multiplier
 */

of_object_t *
of_bsn_tlv_multiplier_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTIPLIER];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_multiplier_init(obj, version, bytes, 0);
    of_bsn_tlv_multiplier_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_multiplier.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_multiplier_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_MULTIPLIER] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_MULTIPLIER];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_MULTIPLIER;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_multiplier.
 * @param obj Pointer to an object of type of_bsn_tlv_multiplier.
 * @param value Pointer to the child object of type
 * uint32_t to be filled out.
 *
 */
void
of_bsn_tlv_multiplier_value_get(
    of_bsn_tlv_multiplier_t *obj,
    uint32_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTIPLIER);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_multiplier.
 * @param obj Pointer to an object of type of_bsn_tlv_multiplier.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_multiplier_value_set(
    of_bsn_tlv_multiplier_t *obj,
    uint32_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_MULTIPLIER);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u32_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_name_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x34); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_name of_bsn_tlv_name
 */

/**
 * Create a new of_bsn_tlv_name object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_name
 */

of_object_t *
of_bsn_tlv_name_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NAME];

    if ((obj = of_object_new(OF_WIRE_BUFFER_MAX_LENGTH)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_name_init(obj, version, bytes, 0);
    of_bsn_tlv_name_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_name.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_name_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NAME] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NAME];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NAME;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_name.
 * @param obj Pointer to an object of type of_bsn_tlv_name.
 * @param value Pointer to the child object of type
 * of_octets_t to be filled out.
 *
 */
void
of_bsn_tlv_name_value_get(
    of_bsn_tlv_name_t *obj,
    of_octets_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;
    int cur_len = 0; /* Current length of object data */

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NAME);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        cur_len = _END_LEN(obj, offset);
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    LOCI_ASSERT(cur_len >= 0 && cur_len < 64 * 1024);
    LOCI_ASSERT(cur_len + abs_offset <= WBUF_CURRENT_BYTES(wbuf));
    value->bytes = cur_len;
    value->data = OF_WIRE_BUFFER_INDEX(wbuf, abs_offset);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_name.
 * @param obj Pointer to an object of type of_bsn_tlv_name.
 * @param value The value to write into the object
 */
int WARN_UNUSED_RESULT
of_bsn_tlv_name_value_set(
    of_bsn_tlv_name_t *obj,
    of_octets_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;
    int cur_len = 0; /* Current length of object data */
    int new_len, delta; /* For set, need new length and delta */

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NAME);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        cur_len = _END_LEN(obj, offset);
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    LOCI_ASSERT(cur_len >= 0 && cur_len < 64 * 1024);
    new_len = value->bytes;
    of_wire_buffer_grow(wbuf, abs_offset + (new_len - cur_len));
    of_wire_buffer_octets_data_set(wbuf, abs_offset, value, cur_len);

    /* Not scalar, update lengths if needed */
    delta = new_len - cur_len;
    if (delta != 0) {
        /* Update parent(s) */
        of_object_parent_length_update((of_object_t *)obj, delta);
    }

    OF_LENGTH_CHECK_ASSERT(obj);

    return OF_ERROR_NONE;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_ndp_offload_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x7b); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_ndp_offload of_bsn_tlv_ndp_offload
 */

/**
 * Create a new of_bsn_tlv_ndp_offload object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_ndp_offload
 */

of_object_t *
of_bsn_tlv_ndp_offload_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NDP_OFFLOAD];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_ndp_offload_init(obj, version, bytes, 0);
    of_bsn_tlv_ndp_offload_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_ndp_offload.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_ndp_offload_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NDP_OFFLOAD] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NDP_OFFLOAD];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NDP_OFFLOAD;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_ndp_static_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x7c); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_ndp_static of_bsn_tlv_ndp_static
 */

/**
 * Create a new of_bsn_tlv_ndp_static object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_ndp_static
 */

of_object_t *
of_bsn_tlv_ndp_static_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NDP_STATIC];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_ndp_static_init(obj, version, bytes, 0);
    of_bsn_tlv_ndp_static_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_ndp_static.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_ndp_static_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NDP_STATIC] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NDP_STATIC];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NDP_STATIC;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_negate_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x53); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_negate of_bsn_tlv_negate
 */

/**
 * Create a new of_bsn_tlv_negate object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_negate
 */

of_object_t *
of_bsn_tlv_negate_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NEGATE];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_negate_init(obj, version, bytes, 0);
    of_bsn_tlv_negate_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_negate.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_negate_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NEGATE] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NEGATE];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NEGATE;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_next_hop_ipv4_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x73); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_next_hop_ipv4 of_bsn_tlv_next_hop_ipv4
 */

/**
 * Create a new of_bsn_tlv_next_hop_ipv4 object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_next_hop_ipv4
 */

of_object_t *
of_bsn_tlv_next_hop_ipv4_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_IPV4];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_next_hop_ipv4_init(obj, version, bytes, 0);
    of_bsn_tlv_next_hop_ipv4_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_next_hop_ipv4.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_next_hop_ipv4_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_IPV4] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_IPV4];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NEXT_HOP_IPV4;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_next_hop_ipv4.
 * @param obj Pointer to an object of type of_bsn_tlv_next_hop_ipv4.
 * @param value Pointer to the child object of type
 * of_ipv4_t to be filled out.
 *
 */
void
of_bsn_tlv_next_hop_ipv4_value_get(
    of_bsn_tlv_next_hop_ipv4_t *obj,
    of_ipv4_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NEXT_HOP_IPV4);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_ipv4_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_next_hop_ipv4.
 * @param obj Pointer to an object of type of_bsn_tlv_next_hop_ipv4.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_next_hop_ipv4_value_set(
    of_bsn_tlv_next_hop_ipv4_t *obj,
    of_ipv4_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NEXT_HOP_IPV4);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_ipv4_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_next_hop_mac_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x72); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_next_hop_mac of_bsn_tlv_next_hop_mac
 */

/**
 * Create a new of_bsn_tlv_next_hop_mac object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_next_hop_mac
 */

of_object_t *
of_bsn_tlv_next_hop_mac_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_MAC];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_next_hop_mac_init(obj, version, bytes, 0);
    of_bsn_tlv_next_hop_mac_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_next_hop_mac.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_next_hop_mac_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_MAC] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXT_HOP_MAC];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NEXT_HOP_MAC;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_next_hop_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_next_hop_mac.
 * @param value Pointer to the child object of type
 * of_mac_addr_t to be filled out.
 *
 */
void
of_bsn_tlv_next_hop_mac_value_get(
    of_bsn_tlv_next_hop_mac_t *obj,
    of_mac_addr_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NEXT_HOP_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_next_hop_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_next_hop_mac.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_next_hop_mac_value_set(
    of_bsn_tlv_next_hop_mac_t *obj,
    of_mac_addr_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_NEXT_HOP_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_nexthop_type_vxlan_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x5e); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_nexthop_type_vxlan of_bsn_tlv_nexthop_type_vxlan
 */

/**
 * Create a new of_bsn_tlv_nexthop_type_vxlan object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_nexthop_type_vxlan
 */

of_object_t *
of_bsn_tlv_nexthop_type_vxlan_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXTHOP_TYPE_VXLAN];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_nexthop_type_vxlan_init(obj, version, bytes, 0);
    of_bsn_tlv_nexthop_type_vxlan_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_nexthop_type_vxlan.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_nexthop_type_vxlan_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NEXTHOP_TYPE_VXLAN] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NEXTHOP_TYPE_VXLAN];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NEXTHOP_TYPE_VXLAN;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_no_arp_response_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x93); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_no_arp_response of_bsn_tlv_no_arp_response
 */

/**
 * Create a new of_bsn_tlv_no_arp_response object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_no_arp_response
 */

of_object_t *
of_bsn_tlv_no_arp_response_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NO_ARP_RESPONSE];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_no_arp_response_init(obj, version, bytes, 0);
    of_bsn_tlv_no_arp_response_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_no_arp_response.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_no_arp_response_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NO_ARP_RESPONSE] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NO_ARP_RESPONSE];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NO_ARP_RESPONSE;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_no_ns_response_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x94); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_no_ns_response of_bsn_tlv_no_ns_response
 */

/**
 * Create a new of_bsn_tlv_no_ns_response object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_no_ns_response
 */

of_object_t *
of_bsn_tlv_no_ns_response_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_NO_NS_RESPONSE];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_no_ns_response_init(obj, version, bytes, 0);
    of_bsn_tlv_no_ns_response_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_no_ns_response.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_no_ns_response_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_NO_NS_RESPONSE] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_NO_NS_RESPONSE];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_NO_NS_RESPONSE;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_offset_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x52); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_offset of_bsn_tlv_offset
 */

/**
 * Create a new of_bsn_tlv_offset object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_offset
 */

of_object_t *
of_bsn_tlv_offset_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_OFFSET];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_offset_init(obj, version, bytes, 0);
    of_bsn_tlv_offset_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_offset.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_offset_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_OFFSET] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_OFFSET];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_OFFSET;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_offset.
 * @param obj Pointer to an object of type of_bsn_tlv_offset.
 * @param value Pointer to the child object of type
 * uint16_t to be filled out.
 *
 */
void
of_bsn_tlv_offset_value_get(
    of_bsn_tlv_offset_t *obj,
    uint16_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_OFFSET);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_offset.
 * @param obj Pointer to an object of type of_bsn_tlv_offset.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_offset_value_set(
    of_bsn_tlv_offset_t *obj,
    uint16_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_OFFSET);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_optics_always_enabled_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x96); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_optics_always_enabled of_bsn_tlv_optics_always_enabled
 */

/**
 * Create a new of_bsn_tlv_optics_always_enabled object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_optics_always_enabled
 */

of_object_t *
of_bsn_tlv_optics_always_enabled_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_OPTICS_ALWAYS_ENABLED];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_optics_always_enabled_init(obj, version, bytes, 0);
    of_bsn_tlv_optics_always_enabled_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_optics_always_enabled.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_optics_always_enabled_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_OPTICS_ALWAYS_ENABLED] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_OPTICS_ALWAYS_ENABLED];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_OPTICS_ALWAYS_ENABLED;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_outer_src_mac_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x9d); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_outer_src_mac of_bsn_tlv_outer_src_mac
 */

/**
 * Create a new of_bsn_tlv_outer_src_mac object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_outer_src_mac
 */

of_object_t *
of_bsn_tlv_outer_src_mac_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_OUTER_SRC_MAC];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_outer_src_mac_init(obj, version, bytes, 0);
    of_bsn_tlv_outer_src_mac_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_outer_src_mac.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_outer_src_mac_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_OUTER_SRC_MAC] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_OUTER_SRC_MAC];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_OUTER_SRC_MAC;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_outer_src_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_outer_src_mac.
 * @param value Pointer to the child object of type
 * of_mac_addr_t to be filled out.
 *
 */
void
of_bsn_tlv_outer_src_mac_value_get(
    of_bsn_tlv_outer_src_mac_t *obj,
    of_mac_addr_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_OUTER_SRC_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_outer_src_mac.
 * @param obj Pointer to an object of type of_bsn_tlv_outer_src_mac.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_outer_src_mac_value_set(
    of_bsn_tlv_outer_src_mac_t *obj,
    of_mac_addr_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_OUTER_SRC_MAC);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_mac_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_parent_port_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x6d); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_parent_port of_bsn_tlv_parent_port
 */

/**
 * Create a new of_bsn_tlv_parent_port object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_parent_port
 */

of_object_t *
of_bsn_tlv_parent_port_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_PARENT_PORT];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_parent_port_init(obj, version, bytes, 0);
    of_bsn_tlv_parent_port_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_parent_port.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_parent_port_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_PARENT_PORT] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_PARENT_PORT];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_PARENT_PORT;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_parent_port.
 * @param obj Pointer to an object of type of_bsn_tlv_parent_port.
 * @param value Pointer to the child object of type
 * of_port_no_t to be filled out.
 *
 */
void
of_bsn_tlv_parent_port_value_get(
    of_bsn_tlv_parent_port_t *obj,
    of_port_no_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_PARENT_PORT);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_port_no_get(ver, wbuf, abs_offset, value);
    OF_PORT_NO_VALUE_CHECK(*value, ver);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_parent_port.
 * @param obj Pointer to an object of type of_bsn_tlv_parent_port.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_parent_port_value_set(
    of_bsn_tlv_parent_port_t *obj,
    of_port_no_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_PARENT_PORT);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_port_no_set(ver, wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#ifdef __GNUC__

#ifdef __linux__
/* glibc */
#include <features.h>
#else
/* NetBSD etc */
#include <sys/cdefs.h>
#ifdef __GNUC_PREREQ__
#define __GNUC_PREREQ __GNUC_PREREQ__
#endif
#endif

#ifndef __GNUC_PREREQ
/* fallback */
#define __GNUC_PREREQ(maj, min) 0
#endif

#if __GNUC_PREREQ(4,6)
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif

#endif

#include "loci_log.h"
#include "loci_int.h"

void
of_bsn_tlv_partner_key_push_wire_types(of_object_t *obj)
{
    unsigned char *buf = OF_OBJECT_BUFFER_INDEX(obj, 0);
    switch (obj->version) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        *(uint16_t *)(buf + 0) = U16_HTON(0x33); /* type */
        break;
    default:
        UNREACHABLE();
    }
}



/**
 * \defgroup of_bsn_tlv_partner_key of_bsn_tlv_partner_key
 */

/**
 * Create a new of_bsn_tlv_partner_key object
 *
 * @param version The wire version to use for the object
 * @return Pointer to the newly create object or NULL on error
 *
 * Initializes the new object with it's default fixed length associating
 * a new underlying wire buffer.
 *
 * \ingroup of_bsn_tlv_partner_key
 */

of_object_t *
of_bsn_tlv_partner_key_new(of_version_t version)
{
    of_object_t *obj;
    int bytes;

    bytes = of_object_fixed_len[version][OF_BSN_TLV_PARTNER_KEY];

    if ((obj = of_object_new(bytes)) == NULL) {
        return NULL;
    }

    of_bsn_tlv_partner_key_init(obj, version, bytes, 0);
    of_bsn_tlv_partner_key_push_wire_types(obj);
    of_tlv16_wire_length_set(obj, obj->length);

    return obj;
}

/**
 * Initialize an object of type of_bsn_tlv_partner_key.
 *
 * @param obj Pointer to the object to initialize
 * @param version The wire version to use for the object
 * @param bytes How many bytes in the object
 * @param clean_wire Boolean: If true, clear the wire object control struct
 *
 * If bytes < 0, then the default fixed length is used for the object
 *
 * This is a "coerce" function that sets up the pointers for the
 * accessors properly.
 *
 * If anything other than 0 is passed in for the buffer size, the underlying
 * wire buffer will have 'grow' called.
 */

void
of_bsn_tlv_partner_key_init(of_object_t *obj,
    of_version_t version, int bytes, int clean_wire)
{
    LOCI_ASSERT(of_object_fixed_len[version][OF_BSN_TLV_PARTNER_KEY] >= 0);
    if (clean_wire) {
        MEMSET(obj, 0, sizeof(*obj));
    }
    if (bytes < 0) {
        bytes = of_object_fixed_len[version][OF_BSN_TLV_PARTNER_KEY];
    }
    obj->version = version;
    obj->length = bytes;
    obj->object_id = OF_BSN_TLV_PARTNER_KEY;

    /* Grow the wire buffer */
    if (obj->wbuf != NULL) {
        int tot_bytes;

        tot_bytes = bytes + obj->obj_offset;
        of_wire_buffer_grow(obj->wbuf, tot_bytes);
    }
}

/**
 * Get value from an object of type of_bsn_tlv_partner_key.
 * @param obj Pointer to an object of type of_bsn_tlv_partner_key.
 * @param value Pointer to the child object of type
 * uint16_t to be filled out.
 *
 */
void
of_bsn_tlv_partner_key_value_get(
    of_bsn_tlv_partner_key_t *obj,
    uint16_t *value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_PARTNER_KEY);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_get(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}

/**
 * Set value in an object of type of_bsn_tlv_partner_key.
 * @param obj Pointer to an object of type of_bsn_tlv_partner_key.
 * @param value The value to write into the object
 */
void
of_bsn_tlv_partner_key_value_set(
    of_bsn_tlv_partner_key_t *obj,
    uint16_t value)
{
    of_wire_buffer_t *wbuf;
    int offset = 0; /* Offset of value relative to the start obj */
    int abs_offset; /* Offset of value relative to start of wbuf */
    of_version_t ver;

    LOCI_ASSERT(obj->object_id == OF_BSN_TLV_PARTNER_KEY);
    ver = obj->version;
    wbuf = OF_OBJECT_TO_WBUF(obj);
    LOCI_ASSERT(wbuf != NULL);

    /* By version, determine offset and current length (where needed) */
    switch (ver) {
    case OF_VERSION_1_3:
    case OF_VERSION_1_4:
        offset = 4;
        break;
    default:
        LOCI_ASSERT(0);
    }

    abs_offset = OF_OBJECT_ABSOLUTE_OFFSET(obj, offset);
    LOCI_ASSERT(abs_offset >= 0);
    of_wire_buffer_u16_set(wbuf, abs_offset, value);

    OF_LENGTH_CHECK_ASSERT(obj);

    return ;
}
