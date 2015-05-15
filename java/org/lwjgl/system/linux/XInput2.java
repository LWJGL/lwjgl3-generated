/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to XInput2.h. */
public final class XInput2 {

	/** Event types */
	public static final int
		XI_DeviceChanged    = 0x1,
		XI_KeyPress         = 0x2,
		XI_KeyRelease       = 0x3,
		XI_ButtonPress      = 0x4,
		XI_ButtonRelease    = 0x5,
		XI_Motion           = 0x6,
		XI_Enter            = 0x7,
		XI_Leave            = 0x8,
		XI_FocusIn          = 0x9,
		XI_FocusOut         = 0xA,
		XI_HierarchyChanged = 0xB,
		XI_PropertyEvent    = 0xC,
		XI_RawKeyPress      = 0xD,
		XI_RawKeyRelease    = 0xE,
		XI_RawButtonPress   = 0xF,
		XI_RawButtonRelease = 0x10,
		XI_RawMotion        = 0x11,
		XI_TouchBegin       = 0x12,
		XI_TouchUpdate      = 0x13,
		XI_TouchEnd         = 0x14,
		XI_TouchOwnership   = 0x15,
		XI_RawTouchBegin    = 0x16,
		XI_RawTouchUpdate   = 0x17,
		XI_RawTouchEnd      = 0x18;

	static { LWJGLUtil.initialize(); }

	private XInput2() {}

	// --- [ XIQueryVersion ] ---

	/** JNI method for {@link #XIQueryVersion} */
	@JavadocExclude
	public static native int nXIQueryVersion(long display, long major_version_inout, long minor_version_inout);

	/**
	 * Announces and queries the supported XI2 version.
	 *
	 * @param display             the connection to the X server
	 * @param major_version_inout the client's supported XI2 major version, and returns the server's supported major version
	 * @param minor_version_inout the client's supported XI2 minor version, and returns the server's supported minor version
	 */
	public static int XIQueryVersion(long display, ByteBuffer major_version_inout, ByteBuffer minor_version_inout) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major_version_inout, 1 << 2);
			checkBuffer(minor_version_inout, 1 << 2);
		}
		return nXIQueryVersion(display, memAddress(major_version_inout), memAddress(minor_version_inout));
	}

	/** Alternative version of: {@link #XIQueryVersion} */
	public static int XIQueryVersion(long display, IntBuffer major_version_inout, IntBuffer minor_version_inout) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major_version_inout, 1);
			checkBuffer(minor_version_inout, 1);
		}
		return nXIQueryVersion(display, memAddress(major_version_inout), memAddress(minor_version_inout));
	}

	// --- [ XISelectEvents ] ---

	/** JNI method for {@link #XISelectEvents} */
	@JavadocExclude
	public static native int nXISelectEvents(long display, long w, long masks, int num_masks);

	/**
	 * Selects XI2 events.
	 * 
	 * <p>{@code XISelectEvents} sets the event mask for this client on win. Further events are only reported to this client if the event type matches the
	 * selected event mask. The masks overrides the previously selected event mask for the given device.</p>
	 * 
	 * <p>If deviceid is a valid device, the event mask is selected only for this device. If deviceid is XIAllDevices or XIAllMasterDevices, the event mask is
	 * selected for all devices or all master devices, respectively. The effective event mask is the bit-wise OR of the XIAllDevices, XIAllMasterDevices and
	 * the respective device's event mask.</p>
	 *
	 * @param display   the connection to the X server
	 * @param w         the window
	 * @param masks     a pointer to an array of {@link XIEventMask} structures
	 * @param num_masks number of masks in {@code masks}
	 */
	public static int XISelectEvents(long display, long w, ByteBuffer masks, int num_masks) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(masks, num_masks * XIEventMask.SIZEOF);
		}
		return nXISelectEvents(display, w, memAddress(masks), num_masks);
	}

	/** Alternative version of: {@link #XISelectEvents} */
	public static int XISelectEvents(long display, long w, ByteBuffer masks) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXISelectEvents(display, w, memAddress(masks), masks.remaining() / XIEventMask.SIZEOF);
	}

}