/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** Keys for libOVR's CAPI calls. */
public final class OVRKeys {

	/**  */
	public static final String
		OVR_KEY_USER                      = "User",
		OVR_KEY_NAME                      = "Name",
		OVR_KEY_GENDER                    = "Gender",
		OVR_KEY_PLAYER_HEIGHT             = "PlayerHeight",
		OVR_KEY_EYE_HEIGHT                = "EyeHeight",
		OVR_KEY_IPD                       = "IPD",
		OVR_KEY_NECK_TO_EYE_DISTANCE      = "NeckEyeDistance",
		OVR_KEY_EYE_RELIEF_DIAL           = "EyeReliefDial",
		OVR_KEY_EYE_TO_NOSE_DISTANCE      = "EyeToNoseDist",
		OVR_KEY_MAX_EYE_TO_PLATE_DISTANCE = "MaxEyeToPlateDist",
		OVR_KEY_EYE_CUP                   = "EyeCup",
		OVR_KEY_CUSTOM_EYE_RENDER         = "CustomEyeRender",
		OVR_KEY_CAMERA_POSITION           = "CenteredFromWorld2";

	/**  */
	public static final String OVR_DEFAULT_GENDER = "Unknown";

	/** Default measurements empirically determined at Oculus. */
	public static final float
		OVR_DEFAULT_PLAYER_HEIGHT          = 1.778f,
		OVR_DEFAULT_EYE_HEIGHT             = 1.675f,
		OVR_DEFAULT_IPD                    = 0.064f,
		OVR_DEFAULT_NECK_TO_EYE_HORIZONTAL = 0.0805f,
		OVR_DEFAULT_NECK_TO_EYE_VERTICAL   = 0.075f;

	/** Default measurements empirically determined at Oculus. */
	public static final int OVR_DEFAULT_EYE_RELIEF_DIAL = 0x3;

	/**  */
	public static final int[] OVR_DEFAULT_CAMERA_POSITION = { 0, 0, 0, 1, 0, 0, 0 };

	/**  */
	public static final String OVR_PERF_HUDE_MODE = "PerfHudMode";

	/**  */
	public static final String
		OVR_DEBUG_HUD_STEREO_MODE               = "DebugHudStereoMode",
		OVR_DEBUG_HUD_STEREO_GUIDE_SIZE         = "DebugHudStereoGuideSize2f",
		OVR_DEBUG_HUD_STEREO_GUIDE_POSITION     = "DebugHudStereoGuidePosition3f",
		OVR_DEBUG_HUD_STEREO_GUIDE_YAWPITCHROLL = "DebugHudStereoGuideYawPitchRoll3f",
		OVR_DEBUG_HUD_STEREO_GUIDE_COLOR        = "DebugHudStereoGuideColor4f";

	private OVRKeys() {}

}