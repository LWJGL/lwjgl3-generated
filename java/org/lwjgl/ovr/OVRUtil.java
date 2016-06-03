/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libOVR utility functions. */
public class OVRUtil {

	/**
	 * Use for generating a default projection matrix that is:
	 * 
	 * <ul>
	 * <li>Right-handed.</li>
	 * <li>Near depth values stored in the depth buffer are smaller than far depth values.</li>
	 * <li>Both near and far are explicitly defined.</li>
	 * <li>With a clipping range that is (0 to w).</li>
	 * </ul>
	 */
	public static final int ovrProjection_None = 0x0;

	/** Enable if using left-handed transformations in your application. */
	public static final int ovrProjection_LeftHanded = 0x1;

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

	static { Library.initialize(); }

	protected OVRUtil() {
		throw new UnsupportedOperationException();
	}

	// --- [ ovr_Detect ] ---

	/**
	 * Detects Oculus Runtime and Device Status.
	 * 
	 * <p>Checks for Oculus Runtime and Oculus HMD device status without loading the LibOVRRT shared library. This may be called before {@link OVR#ovr_Initialize _Initialize} to help
	 * decide whether or not to initialize LibOVR.</p>
	 *
	 * @param timeoutMilliseconds a timeout to wait for HMD to be attached or 0 to poll
	 */
	public static native void novr_Detect(int timeoutMilliseconds, long __result);

	/**
	 * Detects Oculus Runtime and Device Status.
	 * 
	 * <p>Checks for Oculus Runtime and Oculus HMD device status without loading the LibOVRRT shared library. This may be called before {@link OVR#ovr_Initialize _Initialize} to help
	 * decide whether or not to initialize LibOVR.</p>
	 *
	 * @param timeoutMilliseconds a timeout to wait for HMD to be attached or 0 to poll
	 */
	public static OVRDetectResult ovr_Detect(int timeoutMilliseconds, OVRDetectResult __result) {
		novr_Detect(timeoutMilliseconds, __result.address());
		return __result;
	}

	// --- [ ovrMatrix4f_Projection ] ---

	/**
	 * Used to generate projection from {@code ovrEyeDesc::Fov}.
	 *
	 * @param fov                the {@link OVRFovPort} to use
	 * @param znear              distance to near Z limit
	 * @param zfar               distance to far Z limit
	 * @param projectionModFlags a combination of the {@code ovrProjectionModifier} flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td></tr><tr><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
	 * @param __result           the calculated projection matrix
	 */
	public static native void novrMatrix4f_Projection(long fov, float znear, float zfar, int projectionModFlags, long __result);

	/**
	 * Used to generate projection from {@code ovrEyeDesc::Fov}.
	 *
	 * @param fov                the {@link OVRFovPort} to use
	 * @param znear              distance to near Z limit
	 * @param zfar               distance to far Z limit
	 * @param projectionModFlags a combination of the {@code ovrProjectionModifier} flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td></tr><tr><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
	 * @param __result           the calculated projection matrix
	 */
	public static OVRMatrix4f ovrMatrix4f_Projection(OVRFovPort fov, float znear, float zfar, int projectionModFlags, OVRMatrix4f __result) {
		novrMatrix4f_Projection(fov.address(), znear, zfar, projectionModFlags, __result.address());
		return __result;
	}

	// --- [ ovrTimewarpProjectionDesc_FromProjection ] ---

	/**
	 * Extracts the required data from the result of {@link #ovrMatrix4f_Projection Matrix4f_Projection}.
	 *
	 * @param projection         the project matrix from which to extract {@link OVRTimewarpProjectionDesc}
	 * @param projectionModFlags a combination of the ovrProjectionModifier flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td></tr><tr><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
	 * @param __result           the extracted ovrTimewarpProjectionDesc
	 */
	public static native void novrTimewarpProjectionDesc_FromProjection(long projection, int projectionModFlags, long __result);

	/**
	 * Extracts the required data from the result of {@link #ovrMatrix4f_Projection Matrix4f_Projection}.
	 *
	 * @param projection         the project matrix from which to extract {@link OVRTimewarpProjectionDesc}
	 * @param projectionModFlags a combination of the ovrProjectionModifier flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td></tr><tr><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
	 * @param __result           the extracted ovrTimewarpProjectionDesc
	 */
	public static OVRTimewarpProjectionDesc ovrTimewarpProjectionDesc_FromProjection(OVRMatrix4f projection, int projectionModFlags, OVRTimewarpProjectionDesc __result) {
		novrTimewarpProjectionDesc_FromProjection(projection.address(), projectionModFlags, __result.address());
		return __result;
	}

	// --- [ ovrMatrix4f_OrthoSubProjection ] ---

	/**
	 * Generates an orthographic sub-projection.
	 * 
	 * <p>Used for 2D rendering, Y is down.</p>
	 *
	 * @param projection      the perspective matrix that the orthographic matrix is derived from
	 * @param orthoScale      equal to {@code 1.0f / pixelsPerTanAngleAtCenter}
	 * @param orthoDistance   equal to the distance from the camera in meters, such as 0.8m
	 * @param HmdToEyeOffsetX the offset of the eye from the center
	 * @param __result        the calculated projection matrix
	 */
	public static native void novrMatrix4f_OrthoSubProjection(long projection, long orthoScale, float orthoDistance, float HmdToEyeOffsetX, long __result);

	/**
	 * Generates an orthographic sub-projection.
	 * 
	 * <p>Used for 2D rendering, Y is down.</p>
	 *
	 * @param projection      the perspective matrix that the orthographic matrix is derived from
	 * @param orthoScale      equal to {@code 1.0f / pixelsPerTanAngleAtCenter}
	 * @param orthoDistance   equal to the distance from the camera in meters, such as 0.8m
	 * @param HmdToEyeOffsetX the offset of the eye from the center
	 * @param __result        the calculated projection matrix
	 */
	public static OVRMatrix4f ovrMatrix4f_OrthoSubProjection(OVRMatrix4f projection, OVRVector2f orthoScale, float orthoDistance, float HmdToEyeOffsetX, OVRMatrix4f __result) {
		novrMatrix4f_OrthoSubProjection(projection.address(), orthoScale.address(), orthoDistance, HmdToEyeOffsetX, __result.address());
		return __result;
	}

	// --- [ ovr_CalcEyePoses ] ---

	/**
	 * Computes offset eye poses based on {@code headPose} returned by {@link OVRTrackingState}.
	 *
	 * @param headPose       indicates the HMD position and orientation to use for the calculation
	 * @param HmdToEyeOffset can be {@link OVREyeRenderDesc}{@code .HmdToEyeViewOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                       average of the two vectors for both eyes.
	 * @param outEyePoses    if {@code outEyePoses} are used for rendering, they should be passed to {@link OVR#ovr_SubmitFrame _SubmitFrame} in {@link OVRLayerEyeFov}{@code ::RenderPose} or
	 *                       {@link OVRLayerEyeFovDepth}{@code ::RenderPose}
	 */
	public static native void novr_CalcEyePoses(long headPose, long HmdToEyeOffset, long outEyePoses);

	/**
	 * Computes offset eye poses based on {@code headPose} returned by {@link OVRTrackingState}.
	 *
	 * @param headPose       indicates the HMD position and orientation to use for the calculation
	 * @param HmdToEyeOffset can be {@link OVREyeRenderDesc}{@code .HmdToEyeViewOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                       average of the two vectors for both eyes.
	 * @param outEyePoses    if {@code outEyePoses} are used for rendering, they should be passed to {@link OVR#ovr_SubmitFrame _SubmitFrame} in {@link OVRLayerEyeFov}{@code ::RenderPose} or
	 *                       {@link OVRLayerEyeFovDepth}{@code ::RenderPose}
	 */
	public static void ovr_CalcEyePoses(OVRPosef headPose, OVRVector3f.Buffer HmdToEyeOffset, OVRPosef.Buffer outEyePoses) {
		if ( CHECKS ) {
			checkBuffer(HmdToEyeOffset, 2);
			checkBuffer(outEyePoses, 2);
		}
		novr_CalcEyePoses(headPose.address(), HmdToEyeOffset.address(), outEyePoses.address());
	}

	// --- [ ovr_GetEyePoses ] ---

	/**
	 * Returns the predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses}.
	 * 
	 * <p>This is a thread-safe function where caller should increment {@code frameIndex} with every frame and pass that index where applicable to functions
	 * called on the rendering thread. Assuming {@code outEyePoses} are used for rendering, it should be passed as a part of {@link OVRLayerEyeFov}. The caller does
	 * not need to worry about applying {@code HmdToEyeOffset} to the returned {@code outEyePoses} variables.</p>
	 *
	 * @param session             an {@code ovrSession} previously returned by {@link OVR#ovr_Create _Create}
	 * @param frameIndex          the targeted frame index, or 0 to refer to one frame after the last time {@link OVR#ovr_SubmitFrame _SubmitFrame} was called
	 * @param latencyMarker       Specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
	 *                            "SensorSampleTimestamp", that will override the value stored here.
	 * @param hmdToEyeOffset      can be {@link OVREyeRenderDesc}{@code .HmdToEyeOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                            average of the two vectors for both eyes.
	 * @param outEyePoses         the predicted eye poses
	 * @param outSensorSampleTime the time when this function was called. May be NULL, in which case it is ignored.
	 */
	public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long hmdToEyeOffset, long outEyePoses, long outSensorSampleTime);

	/**
	 * Returns the predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses}.
	 * 
	 * <p>This is a thread-safe function where caller should increment {@code frameIndex} with every frame and pass that index where applicable to functions
	 * called on the rendering thread. Assuming {@code outEyePoses} are used for rendering, it should be passed as a part of {@link OVRLayerEyeFov}. The caller does
	 * not need to worry about applying {@code HmdToEyeOffset} to the returned {@code outEyePoses} variables.</p>
	 *
	 * @param session             an {@code ovrSession} previously returned by {@link OVR#ovr_Create _Create}
	 * @param frameIndex          the targeted frame index, or 0 to refer to one frame after the last time {@link OVR#ovr_SubmitFrame _SubmitFrame} was called
	 * @param latencyMarker       Specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
	 *                            "SensorSampleTimestamp", that will override the value stored here.
	 * @param hmdToEyeOffset      can be {@link OVREyeRenderDesc}{@code .HmdToEyeOffset} returned from {@link OVR#ovr_GetRenderDesc _GetRenderDesc}. For monoscopic rendering, use a vector that is the
	 *                            average of the two vectors for both eyes.
	 * @param outEyePoses         the predicted eye poses
	 * @param outSensorSampleTime the time when this function was called. May be NULL, in which case it is ignored.
	 */
	public static void ovr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, OVRVector3f.Buffer hmdToEyeOffset, OVRPosef.Buffer outEyePoses, DoubleBuffer outSensorSampleTime) {
		if ( CHECKS ) {
			checkPointer(session);
			checkBuffer(hmdToEyeOffset, 2);
			checkBuffer(outEyePoses, 2);
		}
		novr_GetEyePoses(session, frameIndex, latencyMarker, hmdToEyeOffset.address(), outEyePoses.address(), memAddressSafe(outSensorSampleTime));
	}

	// --- [ ovrPosef_FlipHandedness ] ---

	/**
	 * Tracking poses provided by the SDK come in a right-handed coordinate system. If an application is passing in {@link #ovrProjection_LeftHanded Projection_LeftHanded} into
	 * {@link #ovrMatrix4f_Projection Matrix4f_Projection}, then it should also use this function to flip the HMD tracking poses to be left-handed.
	 * 
	 * <p>While this utility function is intended to convert a left-handed OVRPosef into a right-handed coordinate system, it will also work for converting
	 * right-handed to left-handed since the flip operation is the same for both cases.</p>
	 *
	 * @param inPose  a pose that is right-handed
	 * @param outPose the pose that is requested to be left-handed (can be the same pointer to {@code inPose})
	 */
	public static native void novrPosef_FlipHandedness(long inPose, long outPose);

	/**
	 * Tracking poses provided by the SDK come in a right-handed coordinate system. If an application is passing in {@link #ovrProjection_LeftHanded Projection_LeftHanded} into
	 * {@link #ovrMatrix4f_Projection Matrix4f_Projection}, then it should also use this function to flip the HMD tracking poses to be left-handed.
	 * 
	 * <p>While this utility function is intended to convert a left-handed OVRPosef into a right-handed coordinate system, it will also work for converting
	 * right-handed to left-handed since the flip operation is the same for both cases.</p>
	 *
	 * @param inPose  a pose that is right-handed
	 * @param outPose the pose that is requested to be left-handed (can be the same pointer to {@code inPose})
	 */
	public static void ovrPosef_FlipHandedness(OVRPosef inPose, OVRPosef outPose) {
		novrPosef_FlipHandedness(inPose.address(), outPose.address());
	}

	/** Array version of: {@link #ovr_GetEyePoses _GetEyePoses} */
	public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long hmdToEyeOffset, long outEyePoses, double[] outSensorSampleTime);

	/** Array version of: {@link #ovr_GetEyePoses _GetEyePoses} */
	public static void ovr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, OVRVector3f.Buffer hmdToEyeOffset, OVRPosef.Buffer outEyePoses, double[] outSensorSampleTime) {
		if ( CHECKS ) {
			checkPointer(session);
			checkBuffer(hmdToEyeOffset, 2);
			checkBuffer(outEyePoses, 2);
		}
		novr_GetEyePoses(session, frameIndex, latencyMarker, hmdToEyeOffset.address(), outEyePoses.address(), outSensorSampleTime);
	}

}