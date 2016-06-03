/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** LibOVR version identification. */
public final class OVRVersion {

	/** Master version numbers. */
	public static final int
		OVR_PRODUCT_VERSION = 1,
		OVR_MAJOR_VERSION   = 1,
		OVR_MINOR_VERSION   = 4,
		OVR_PATCH_VERSION   = 0,
		OVR_BUILD_NUMBER    = 0;

	/** The {@code ((product * 100) + major)} version of the service that the DLL is compatible with. */
	public static final int OVR_DLL_COMPATIBLE_VERSION = 101;

	/**  */
	public static final int OVR_OVR_FEATURE_VERSION = 0;

	/** "Major.Minor.Patch.Build" */
	public static final String OVR_VERSION_STRING = Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION;

	/** "Major.Minor.Patch.Build" */
	public static final String OVR_DETAILED_VERSION_STRING = Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION + '.' + OVR_BUILD_NUMBER;

	private OVRVersion() {}

}