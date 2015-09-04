/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** LibOVR version identification. */
public final class OVRVersion {

	/**  */
	public static final int
		OVR_PRODUCT_VERSION = 0x0,
		OVR_MAJOR_VERSION   = 0x7,
		OVR_MINOR_VERSION   = 0x0,
		OVR_PATCH_VERSION   = 0x0,
		OVR_BUILD_NUMBER    = 0x0;

	/** "Product.Major.Minor.Patch.Build" */
	public static final String OVR_VERSION_STRING = Integer.toString(OVR_PRODUCT_VERSION) + '.' + OVR_MAJOR_VERSION + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION;

	/** The product version for the Oculus Display Driver. */
	public static final String OVR_DISPLAY_DRIVER_PRODUCT_VERSION = "1.2.7.0";

	/** The product version for the Oculus Position Tracker Driver. */
	public static final String OVR_POSITIONAL_TRACKER_DRIVER_PRODUCT_VERSION = "1.0.11.0";

	private OVRVersion() {}

}