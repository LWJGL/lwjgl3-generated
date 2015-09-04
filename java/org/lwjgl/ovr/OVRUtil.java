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

	/**
	 * Use for generating a default projection matrix that is:
	 * <ul>
	 * <li>Left-handed.</li>
	 * <li>Near depth values stored in the depth buffer are smaller than far depth values.</li>
	 * <li>Both near and far are explicitly defined.</li>
	 * <li>With a clipping range that is (0 to w).</li>
	 * </ul>
	 */
	public static final int ovrProjection_None = 0x0;

	/** Enable if using right-handed transformations in your application. */
	public static final int ovrProjection_RightHanded = 0x1;

	/**
	 * After the projection transform is applied, far values stored in the depth buffer will be less than closer depth values. NOTE: Enable only if the
	 * application is using a floating-point depth buffer for proper precision.
	 */
	public static final int ovrProjection_FarLessThanNear = 0x2;

	/**
	 * When this flag is used, the zfar value pushed into {@link #ovrMatrix4f_Projection Matrix4f_Projection} will be ignored NOTE: Enable only if {@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear} is also
	 * enabled where the far clipping plane will be pushed to infinity.
	 */
	public static final int ovrProjection_FarClipAtInfinity = 0x4;

	/**
	 * Enable if the application is rendering with OpenGL and expects a projection matrix with a clipping range of (-w to w). Ignore this flag if your
	 * application already handles the conversion from D3D range (0 to w) to OpenGL.
	 */
	public static final int ovrProjection_ClipRangeOpenGL = 0x8;

	static { LWJGLUtil.initialize(); }

	private OVRUtil() {}

	// --- [ ovrMatrix4f_Projection ] ---

	/** JNI method for {@link #ovrMatrix4f_Projection Matrix4f_Projection} */
	@JavadocExclude
	public static native void novrMatrix4f_Projection(long fov, float znear, float zfar, int projectionModFlags, long __result);

	/**
	 * Used to generate projection from {@code ovrEyeDesc::Fov}.
	 *
	 * @param fov                the {@link OVRFovPort} to use
	 * @param znear              distance to near Z limit
	 * @param zfar               distance to far Z limit
	 * @param projectionModFlags a combination of the {@code ovrProjectionModifier} flags. One or more of:<br>{@link #ovrProjection_None Projection_None}, {@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}, {@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}, {@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}
	 * @param __result           the calculated projection matrix
	 */
	public static void ovrMatrix4f_Projection(ByteBuffer fov, float znear, float zfar, int projectionModFlags, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fov, OVRFovPort.SIZEOF);
		novrMatrix4f_Projection(memAddress(fov), znear, zfar, projectionModFlags, memAddress(__result));
	}

	// --- [ ovrTimewarpProjectionDesc_FromProjection ] ---

	/** JNI method for {@link #ovrTimewarpProjectionDesc_FromProjection TimewarpProjectionDesc_FromProjection} */
	@JavadocExclude
	public static native void novrTimewarpProjectionDesc_FromProjection(long projection, int projectionModFlags, long __result);

	/**
	 * Extracts the required data from the result of {@link #ovrMatrix4f_Projection Matrix4f_Projection}.
	 *
	 * @param projection         the project matrix from which to extract {@link OVRTimewarpProjectionDesc}
	 * @param projectionModFlags a combination of the ovrProjectionModifier flags. One or more of:<br>{@link #ovrProjection_None Projection_None}, {@link #ovrProjection_RightHanded Projection_RightHanded}, {@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}, {@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}, {@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}
	 * @param __result           the extracted ovrTimewarpProjectionDesc
	 */
	public static void ovrTimewarpProjectionDesc_FromProjection(ByteBuffer projection, int projectionModFlags, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(projection, OVRMatrix4f.SIZEOF);
		novrTimewarpProjectionDesc_FromProjection(memAddress(projection), projectionModFlags, memAddress(__result));
	}

	// --- [ ovrMatrix4f_OrthoSubProjection ] ---

	/** JNI method for {@link #ovrMatrix4f_OrthoSubProjection Matrix4f_OrthoSubProjection} */
	@JavadocExclude
	public static native void novrMatrix4f_OrthoSubProjection(long projection, long orthoScale, float orthoDistance, float hmdToEyeViewOffsetX, long __result);

	/**
	 * Generates an orthographic sub-projection.
	 * 
	 * <p>Used for 2D rendering, Y is down.</p>
	 *
	 * @param projection          the perspective matrix that the orthographic matrix is derived from
	 * @param orthoScale          equal to {@code 1.0f / pixelsPerTanAngleAtCenter}
	 * @param orthoDistance       equal to the distance from the camera in meters, such as 0.8m
	 * @param hmdToEyeViewOffsetX the offset of the eye from the center
	 * @param __result            the calculated projection matrix
	 */
	public static void ovrMatrix4f_OrthoSubProjection(ByteBuffer projection, ByteBuffer orthoScale, float orthoDistance, float hmdToEyeViewOffsetX, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(projection, OVRMatrix4f.SIZEOF);
			checkBuffer(orthoScale, OVRVector2f.SIZEOF);
		}
		novrMatrix4f_OrthoSubProjection(memAddress(projection), memAddress(orthoScale), orthoDistance, hmdToEyeViewOffsetX, memAddress(__result));
	}

	// --- [ ovr_CalcEyePoses ] ---

	/** JNI method for {@link #ovr_CalcEyePoses _CalcEyePoses} */
	@JavadocExclude
	public static native void novr_CalcEyePoses(long headPose, long hmdToEyeViewOffset, long outEyePoses);

	/**
	 * Computes offset eye poses based on {@code headPose} returned by {@link OVRTrackingState}.
	 *
	 * @param headPose           indicates the HMD position and orientation to use for the calculation
	 * @param hmdToEyeViewOffset can be {@link OVREyeRenderDesc}{@code .HmdToEyeViewOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                           average of the two vectors for both eyes.
	 * @param outEyePoses        if {@code outEyePoses} are used for rendering, they should be passed to {@link OVR#ovr_SubmitFrame _SubmitFrame} in {@link OVRLayerEyeFov}{@code ::RenderPose} or
	 *                           {@link OVRLayerEyeFovDepth}{@code ::RenderPose}
	 */
	public static void ovr_CalcEyePoses(ByteBuffer headPose, ByteBuffer hmdToEyeViewOffset, ByteBuffer outEyePoses) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(headPose, OVRPosef.SIZEOF);
			checkBuffer(hmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
			checkBuffer(outEyePoses, 2 * OVRPosef.SIZEOF);
		}
		novr_CalcEyePoses(memAddress(headPose), memAddress(hmdToEyeViewOffset), memAddress(outEyePoses));
	}

	// --- [ ovr_GetEyePoses ] ---

	/** JNI method for {@link #ovr_GetEyePoses _GetEyePoses} */
	@JavadocExclude
	public static native void novr_GetEyePoses(long hmd, int frameIndex, long hmdToEyeViewOffset, long outEyePoses, long outHmdTrackingState);

	/**
	 * Returns the predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses}.
	 * 
	 * <p>This is a thread-safe function where caller should increment {@code frameIndex} with every frame and pass that index where applicable to functions
	 * called on the rendering thread. Assuming {@code outEyePoses} are used for rendering, it should be passed as a part of {@link OVRLayerEyeFov}. The caller does
	 * not need to worry about applying {@code hmdToEyeViewOffset} to the returned {@code outEyePoses} variables.</p>
	 *
	 * @param hmd                 an {@code ovrHmd} previously returned by {@link OVR#ovr_Create _Create}
	 * @param frameIndex          the targeted frame index, or 0 to refer to one frame after the last time {@link OVR#ovr_SubmitFrame _SubmitFrame} was called
	 * @param hmdToEyeViewOffset  can be {@link OVREyeRenderDesc}{@code .HmdToEyeViewOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                            average of the two vectors for both eyes.
	 * @param outEyePoses         the predicted eye poses
	 * @param outHmdTrackingState the predicted {@link OVRTrackingState}. May be {@code NULL}, in which case it is ignored.
	 */
	public static void ovr_GetEyePoses(long hmd, int frameIndex, ByteBuffer hmdToEyeViewOffset, ByteBuffer outEyePoses, ByteBuffer outHmdTrackingState) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(hmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
			checkBuffer(outEyePoses, 2 * OVRPosef.SIZEOF);
			if ( outHmdTrackingState != null ) checkBuffer(outHmdTrackingState, OVRTrackingState.SIZEOF);
		}
		novr_GetEyePoses(hmd, frameIndex, memAddress(hmdToEyeViewOffset), memAddress(outEyePoses), memAddressSafe(outHmdTrackingState));
	}

}