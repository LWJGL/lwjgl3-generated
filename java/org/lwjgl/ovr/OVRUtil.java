/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libOVR utility functions. */
public final class OVRUtil {

	/** Enumerates modifications to the projection matrix based on the application's needs. */
	public static final int
		ovrProjection_None              = 0x0,
		ovrProjection_RightHanded       = 0x1,
		ovrProjection_FarLessThanNear   = 0x2,
		ovrProjection_FarClipAtInfinity = 0x4,
		ovrProjection_ClipRangeOpenGL   = 0x8;

	static { LWJGLUtil.initialize(); }

	private OVRUtil() {}

	// --- [ ovrMatrix4f_Projection ] ---

	/** JNI method for {@link #ovrMatrix4f_Projection Matrix4f_Projection} */
	@JavadocExclude
	public static native void novrMatrix4f_Projection(long fov, float znear, float zfar, int projectionModFlags, long __result);

	/**
	 * Used to generate projection from ovrEyeDesc::Fov.
	 *
	 * @param fov                
	 * @param znear              
	 * @param zfar               
	 * @param projectionModFlags a combination of the ovrProjectionModifier flags. One or more of:<br>{@link #ovrProjection_None Projection_None}, {@link #ovrProjection_RightHanded Projection_RightHanded}, {@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}, {@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}, {@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}
	 */
	public static void ovrMatrix4f_Projection(ByteBuffer fov, float znear, float zfar, int projectionModFlags, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fov, OVRFovPort.SIZEOF);
		novrMatrix4f_Projection(memAddress(fov), znear, zfar, projectionModFlags, memAddress(__result));
	}

	// --- [ ovrMatrix4f_OrthoSubProjection ] ---

	/** JNI method for {@link #ovrMatrix4f_OrthoSubProjection Matrix4f_OrthoSubProjection} */
	@JavadocExclude
	public static native void novrMatrix4f_OrthoSubProjection(long projection, long orthoScale, float orthoDistance, float hmdToEyeViewOffsetX, long __result);

	/**
	 * Used for 2D rendering, Y is down, orthoScale = 1.0f / pixelsPerTanAngleAtCenter, orthoDistance = distance from camera, such as 0.8m
	 *
	 * @param projection          
	 * @param orthoScale          
	 * @param orthoDistance       
	 * @param hmdToEyeViewOffsetX 
	 */
	public static void ovrMatrix4f_OrthoSubProjection(ByteBuffer projection, ByteBuffer orthoScale, float orthoDistance, float hmdToEyeViewOffsetX, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(projection, OVRMatrix4f.SIZEOF);
			checkBuffer(orthoScale, OVRVector2f.SIZEOF);
		}
		novrMatrix4f_OrthoSubProjection(memAddress(projection), memAddress(orthoScale), orthoDistance, hmdToEyeViewOffsetX, memAddress(__result));
	}

	// --- [ ovr_WaitTillTime ] ---

	/**
	 * Waits until the specified absolute time.
	 *
	 * @param absTime 
	 */
	public static native double ovr_WaitTillTime(double absTime);

}