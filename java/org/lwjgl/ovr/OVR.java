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
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>Basic steps to use the API:
 * <h3>Setup</h3>
 * <ul>
 * <li>{@link #ovr_Initialize _Initialize}</li>
 * <li>ovrHMD hmd = {@link #ovrHmd_Create Hmd_Create}(0)</li>
 * <li>Use hmd members and {@link #ovrHmd_GetFovTextureSize Hmd_GetFovTextureSize} to determine graphics configuration.</li>
 * <li>Call {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking} to configure and initialize tracking.</li>
 * <li>Call {@link #ovrHmd_ConfigureRendering Hmd_ConfigureRendering} to setup graphics for SDK rendering, which is the preferred approach. Please refer to "Client Distortion Rendering"
 * below if you prefer to do that instead.</li>
 * <li>If the ovrHmdCap_ExtendDesktop flag is not set, then use {@link #ovrHmd_AttachToWindow Hmd_AttachToWindow} to associate the relevant application window with the hmd.</li>
 * <li>Allocate render target textures as needed.</li>
 * </ul>
 * <h3>Game Loop</h3>
 * <ul>
 * <li>Call {@link #ovrHmd_BeginFrame Hmd_BeginFrame} to get the current frame timing information.</li>
 * <li>Render each eye using {@link #ovrHmd_GetEyePoses Hmd_GetEyePoses} to get each eye pose.</li>
 * <li>Call {@link #ovrHmd_EndFrame Hmd_EndFrame} to render the distorted textures to the back buffer and present them on the hmd.</li>
 * </ul></p>
 * 
 * <h3>Shutdown</h3>
 * <ul>
 * <li>{@link #ovrHmd_Destroy Hmd_Destroy}</li>
 * <li>{@link #ovr_Shutdown _Shutdown}</li>
 * </ul>
 */
public final class OVR {

	/** Boolean values */
	public static final int
		ovrFalse = 0x0,
		ovrTrue  = 0x1;

	/** Flags for {@link #ovr_Initialize _Initialize} */
	public static final int
		ovrInit_Debug          = 0x1,
		ovrInit_ServerOptional = 0x2,
		ovrInit_RequestVersion = 0x4,
		ovrInit_ForceNoDebug   = 0x8;

	/** Logging levels */
	public static final int
		ovrLogLevel_Debug = 0x0,
		ovrLogLevel_Info  = 0x1,
		ovrLogLevel_Error = 0x2;

	/** HMD types */
	public static final int
		ovrHmd_None      = 0x0,
		ovrHmd_DK1       = 0x3,
		ovrHmd_DKHD      = 0x4,
		ovrHmd_DK2       = 0x6,
		ovrHmd_BlackStar = 0x7,
		ovrHmd_CB        = 0x8,
		ovrHmd_Other     = 0x9;

	/** HMD caps */
	public static final int
		ovrHmdCap_Present           = 0x1,
		ovrHmdCap_Available         = 0x2,
		ovrHmdCap_Captured          = 0x4,
		ovrHmdCap_ExtendDesktop     = 0x8,
		ovrHmdCap_DebugDevice       = 0x10,
		ovrHmdCap_NoMirrorToWindow  = 0x2000,
		ovrHmdCap_DisplayOff        = 0x40,
		ovrHmdCap_LowPersistence    = 0x80,
		ovrHmdCap_DynamicPrediction = 0x200,
		ovrHmdCap_NoVSync           = 0x1000,
		ovrHmdCap_Writable_Mask     = ovrHmdCap_NoMirrorToWindow | ovrHmdCap_DisplayOff | ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction | ovrHmdCap_NoVSync,
		ovrHmdCap_Service_Mask      = ovrHmdCap_NoMirrorToWindow | ovrHmdCap_DisplayOff | ovrHmdCap_LowPersistence | ovrHmdCap_DynamicPrediction;

	/** Tracking capability bits reported by the device. Used with {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking}. */
	public static final int
		ovrTrackingCap_Orientation      = 0x10,
		ovrTrackingCap_MagYawCorrection = 0x20,
		ovrTrackingCap_Position         = 0x40,
		ovrTrackingCap_Idle             = 0x100;

	/** Distortion capability bits reported by device. Used with {@link #ovrHmd_ConfigureRendering Hmd_ConfigureRendering} and {@link #ovrHmd_CreateDistortionMesh Hmd_CreateDistortionMesh}. */
	public static final int
		ovrDistortionCap_Chromatic                  = 0x1,
		ovrDistortionCap_TimeWarp                   = 0x2,
		ovrDistortionCap_Vignette                   = 0x8,
		ovrDistortionCap_NoRestore                  = 0x10,
		ovrDistortionCap_FlipInput                  = 0x20,
		ovrDistortionCap_SRGB                       = 0x40,
		ovrDistortionCap_Overdrive                  = 0x80,
		ovrDistortionCap_HqDistortion               = 0x100,
		ovrDistortionCap_LinuxDevFullscreen         = 0x200,
		ovrDistortionCap_ComputeShader              = 0x400,
		ovrDistortionCap_TimewarpJitDelay           = 0x1000,
		ovrDistortionCap_ProfileNoTimewarpSpinWaits = 0x10000;

	/** Eye types */
	public static final int
		ovrEye_left  = 0x0,
		ovrEye_Right = 0x1,
		ovrEye_Count = 0x2;

	/** Bit flags describing the current status of sensor tracking. */
	public static final int
		ovrStatus_OrientationTracked = 0x1,
		ovrStatus_PositionTracked    = 0x2,
		ovrStatus_CameraPoseTracked  = 0x4,
		ovrStatus_PositionConnected  = 0x20,
		ovrStatus_HmdConnected       = 0x80;

	/** Render API */
	public static final int
		ovrRenderAPI_None         = 0x0,
		ovrRenderAPI_OpenGL       = 0x1,
		ovrRenderAPI_Android_GLES = 0x2,
		ovrRenderAPI_D3D9         = 0x3,
		ovrRenderAPI_D3D10        = 0x4,
		ovrRenderAPI_D3D11        = 0x5,
		ovrRenderAPI_Count        = 0x6;

	static { LWJGLUtil.initialize(); }

	private OVR() {}

	// --- [ ovr_InitializeRenderingShimVersion ] ---

	/**
	 * Same as {@link #ovr_InitializeRenderingShim _InitializeRenderingShim} except it requests to support at least the given minor LibOVR library version.
	 *
	 * @param requestedMinorVersion the requested minor LibOVR library version
	 */
	public static native boolean ovr_InitializeRenderingShimVersion(int requestedMinorVersion);

	// --- [ ovr_InitializeRenderingShim ] ---

	/**
	 * Initializes the rendering shim apart from everything else in LibOVR. This may be helpful if the application prefers to avoid creating any OVR resources
	 * (allocations, service connections, etc) at this point. ovr_InitializeRenderingShim does not bring up anything within LibOVR except the necessary hooks
	 * to enable the Direct-to-Rift functionality.
	 * 
	 * <p>Either {@link #ovr_InitializeRenderingShim _InitializeRenderingShim} or {@link #ovr_Initialize _Initialize} must be called before any Direct3D or OpenGL initialization is done by application (creation of
	 * devices, etc). {@link #ovr_Initialize _Initialize} must still be called after to use the rest of LibOVR APIs.</p>
	 */
	public static native boolean ovr_InitializeRenderingShim();

	// --- [ ovr_Initialize ] ---

	/** JNI method for {@link #ovr_Initialize _Initialize} */
	@JavadocExclude
	public static native boolean novr_Initialize(long params);

	/**
	 * Initializes all Oculus functionality. Pass {@code NULL} to initialize with default parameters, suitable for released games.
	 * 
	 * <p>Library init/shutdown, must be called around all other OVR code. No other functions calls besides {@link #ovr_InitializeRenderingShim _InitializeRenderingShim} are allowed before
	 * ovr_Initialize succeeds or after {@link #ovr_Shutdown _Shutdown}.</p>
	 * 
	 * <p>A second call to ovr_Initialize after successful second call returns {@link #ovrTrue True}.</p>
	 * 
	 * <p>LibOVRRT shared library search order:
	 * <ol>
	 * <li>Current working directory (often the same as the application directory).</li>
	 * <li>Module directory (usually the same as the application directory, but not if the module is a separate shared library).</li>
	 * <li>Application directory</li>
	 * <li>Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).</li>
	 * <li>Standard OS shared library search location(s) (OS-specific).</li>
	 * </ol></p>
	 *
	 * @param params an {@link OVRInitParams} structure
	 */
	public static boolean ovr_Initialize(ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( params != null ) checkBuffer(params, OVRInitParams.SIZEOF);
		return novr_Initialize(memAddressSafe(params));
	}

	// --- [ ovr_Shutdown ] ---

	/** Shuts down all Oculus functionality. */
	public static native void ovr_Shutdown();

	// --- [ ovr_GetVersionString ] ---

	/** JNI method for {@link #ovr_GetVersionString _GetVersionString} */
	@JavadocExclude
	public static native long novr_GetVersionString();

	/** Returns version string representing libOVR version. Static, so string remains valid for app lifespan. */
	public static String ovr_GetVersionString() {
		long __result = novr_GetVersionString();
		return memDecodeASCII(__result);
	}

	// --- [ ovrHmd_Detect ] ---

	/**
	 * Detects or re-detects HMDs and reports the total number detected. Users can get information about each HMD by calling {@link #ovrHmd_Create Hmd_Create} with an index.
	 *
	 * @return the number of HMDs detected or -1 when the service is unreachable
	 */
	public static native int ovrHmd_Detect();

	// --- [ ovrHmd_Create ] ---

	/**
	 * Creates a handle to an HMD which doubles as a description structure. Index can be <code style="font-family: monospace">[0 .. {@link #ovrHmd_Detect Hmd_Detect}-1]</code>. Index mappings can cange after each
	 * {@link #ovrHmd_Detect Hmd_Detect} call. If not null, then the returned handle must be freed with {@link #ovrHmd_Destroy Hmd_Destroy}.
	 *
	 * @param index the HMD index
	 */
	public static native long ovrHmd_Create(int index);

	// --- [ ovrHmd_Destroy ] ---

	/** JNI method for {@link #ovrHmd_Destroy Hmd_Destroy} */
	@JavadocExclude
	public static native void novrHmd_Destroy(long hmd);

	/**
	 * Destroys an HMD handle.
	 *
	 * @param hmd the HMD handle to destroy
	 */
	public static void ovrHmd_Destroy(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_Destroy(hmd);
	}

	// --- [ ovrHmd_CreateDebug ] ---

	/**
	 * Creates a 'fake' HMD used for debugging only. This is not tied to specific hardware, but may be used to debug some of the related rendering.
	 *
	 * @param type the HMD type. One of:<br>{@link #ovrHmd_None Hmd_None}, {@link #ovrHmd_DK1 Hmd_DK1}, {@link #ovrHmd_DKHD Hmd_DKHD}, {@link #ovrHmd_DK2 Hmd_DK2}, {@link #ovrHmd_BlackStar Hmd_BlackStar}, {@link #ovrHmd_CB Hmd_CB}, {@link #ovrHmd_Other Hmd_Other}
	 */
	public static native long ovrHmd_CreateDebug(int type);

	// --- [ ovrHmd_GetLastError ] ---

	/** JNI method for {@link #ovrHmd_GetLastError Hmd_GetLastError} */
	@JavadocExclude
	public static native long novrHmd_GetLastError(long hmd);

	/**
	 * Returns last error for HMD state. Returns null for no error. String is valid until next call of GetLastError or HMD is destroyed. Pass null {@code hmd}
	 * to get global errors (during create etc).
	 *
	 * @param hmd the HMD handle
	 */
	public static String ovrHmd_GetLastError(long hmd) {
		long __result = novrHmd_GetLastError(hmd);
		return memDecodeASCII(__result);
	}

	// --- [ ovrHmd_AttachToWindow ] ---

	/** JNI method for {@link #ovrHmd_AttachToWindow Hmd_AttachToWindow} */
	@JavadocExclude
	public static native boolean novrHmd_AttachToWindow(long hmd, long window, long destMirrorRect, long sourceRenderTargetRect);

	/**
	 * Platform specific function to specify the application window whose output will be displayed on the HMD. Only used if the {@link #ovrHmdCap_ExtendDesktop HmdCap_ExtendDesktop} flag is
	 * false.
	 * 
	 * <p>Notes:
	 * <ul>
	 * <li><b>Windows</b>: SwapChain associated with this window will be displayed on the HMD. Specify {@code destMirrorRect} in window coordinates to
	 * indicate an area of the render target output that will be mirrored from {@code sourceRenderTargetRect}. Null pointers mean "full size".</li>
	 * <li>Source and dest mirror rects are not yet implemented.</li>
	 * </ul></p>
	 *
	 * @param hmd                    
	 * @param window                 
	 * @param destMirrorRect         
	 * @param sourceRenderTargetRect 
	 */
	public static boolean ovrHmd_AttachToWindow(long hmd, long window, ByteBuffer destMirrorRect, ByteBuffer sourceRenderTargetRect) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkPointer(window);
			if ( destMirrorRect != null ) checkBuffer(destMirrorRect, OVRRecti.SIZEOF);
			if ( sourceRenderTargetRect != null ) checkBuffer(sourceRenderTargetRect, OVRRecti.SIZEOF);
		}
		return novrHmd_AttachToWindow(hmd, window, memAddressSafe(destMirrorRect), memAddressSafe(sourceRenderTargetRect));
	}

	// --- [ ovrHmd_GetEnabledCaps ] ---

	/** JNI method for {@link #ovrHmd_GetEnabledCaps Hmd_GetEnabledCaps} */
	@JavadocExclude
	public static native int novrHmd_GetEnabledCaps(long hmd);

	/**
	 * Returns capability bits that are enabled at this time as described by ovrHmdCaps. Note that this value is different from ovrHmdDesc::HmdCaps, which
	 * describes what capabilities are available for that HMD.
	 *
	 * @param hmd 
	 */
	public static int ovrHmd_GetEnabledCaps(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_GetEnabledCaps(hmd);
	}

	// --- [ ovrHmd_SetEnabledCaps ] ---

	/** JNI method for {@link #ovrHmd_SetEnabledCaps Hmd_SetEnabledCaps} */
	@JavadocExclude
	public static native void novrHmd_SetEnabledCaps(long hmd, int hmdCaps);

	/**
	 * Modifies capability bits described by ovrHmdCaps that can be modified, such as {@link #ovrHmdCap_LowPersistence HmdCap_LowPersistence}.
	 *
	 * @param hmd     
	 * @param hmdCaps one of:<br>{@link #ovrHmdCap_Present HmdCap_Present}, {@link #ovrHmdCap_Available HmdCap_Available}, {@link #ovrHmdCap_Captured HmdCap_Captured}, {@link #ovrHmdCap_ExtendDesktop HmdCap_ExtendDesktop}, {@link #ovrHmdCap_DebugDevice HmdCap_DebugDevice}, {@link #ovrHmdCap_NoMirrorToWindow HmdCap_NoMirrorToWindow}, {@link #ovrHmdCap_DisplayOff HmdCap_DisplayOff}, {@link #ovrHmdCap_LowPersistence HmdCap_LowPersistence}, {@link #ovrHmdCap_DynamicPrediction HmdCap_DynamicPrediction}, {@link #ovrHmdCap_NoVSync HmdCap_NoVSync}, {@link #ovrHmdCap_Writable_Mask HmdCap_Writable_Mask}, {@link #ovrHmdCap_Service_Mask HmdCap_Service_Mask}
	 */
	public static void ovrHmd_SetEnabledCaps(long hmd, int hmdCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_SetEnabledCaps(hmd, hmdCaps);
	}

	// --- [ ovrHmd_ConfigureTracking ] ---

	/** JNI method for {@link #ovrHmd_ConfigureTracking Hmd_ConfigureTracking} */
	@JavadocExclude
	public static native boolean novrHmd_ConfigureTracking(long hmd, int supportedTrackingCaps, int requiredTrackingCaps);

	/**
	 * Starts sensor sampling, enabling specified capabilities, described by ovrTrackingCaps. Pass 0 for both {@code supportedTrackingCaps} and
	 * {@code requiredTrackingCaps} to disable tracking.
	 *
	 * @param hmd                   
	 * @param supportedTrackingCaps specifies support that is requested. The function will succeed even if these caps are not available (i.e. sensor or camera is unplugged). Support
	 *                              will automatically be enabled if such device is plugged in later. Software should check ovrTrackingState.StatusFlags for real-time status. One of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 * @param requiredTrackingCaps  specify sensor capabilities required at the time of the call. If they are not available, the function will fail. Pass 0 if only specifying
	 *                              {@code supportedTrackingCaps}. One of:<br>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation}, {@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection}, {@link #ovrTrackingCap_Position TrackingCap_Position}, {@link #ovrTrackingCap_Idle TrackingCap_Idle}
	 */
	public static boolean ovrHmd_ConfigureTracking(long hmd, int supportedTrackingCaps, int requiredTrackingCaps) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_ConfigureTracking(hmd, supportedTrackingCaps, requiredTrackingCaps);
	}

	// --- [ ovrHmd_RecenterPose ] ---

	/** JNI method for {@link #ovrHmd_RecenterPose Hmd_RecenterPose} */
	@JavadocExclude
	public static native void novrHmd_RecenterPose(long hmd);

	/**
	 * Re-centers the sensor orientation. Normally this will recenter the (x,y,z) translational components and the yaw component of orientation.
	 *
	 * @param hmd 
	 */
	public static void ovrHmd_RecenterPose(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_RecenterPose(hmd);
	}

	// --- [ ovrHmd_GetTrackingState ] ---

	/** JNI method for {@link #ovrHmd_GetTrackingState Hmd_GetTrackingState} */
	@JavadocExclude
	public static native void novrHmd_GetTrackingState(long hmd, double absTime, long __result);

	/**
	 * Returns tracking state reading based on the specified absolute system time. Pass an absTime value of 0.0 to request the most recent sensor reading. In
	 * this case both PredictedPose and SamplePose will have the same value. ovrHmd_GetEyePoses relies on a valid ovrTrackingState. This may also be used for
	 * more refined timing of FrontBuffer rendering logic, etc.
	 *
	 * @param hmd     
	 * @param absTime 
	 */
	public static void ovrHmd_GetTrackingState(long hmd, double absTime, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_GetTrackingState(hmd, absTime, memAddress(__result));
	}

	// --- [ ovrHmd_GetFovTextureSize ] ---

	/** JNI method for {@link #ovrHmd_GetFovTextureSize Hmd_GetFovTextureSize} */
	@JavadocExclude
	public static native void novrHmd_GetFovTextureSize(long hmd, int eye, long fov, float pixelsPerDisplayPixel, long __result);

	/**
	 * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone. Higher FOV will generally require larger
	 * textures to maintain quality.
	 * 
	 * <p>Apps packing multiple eye views together on the same textue should ensure there is roughly 8 pixels of padding between them to prevent texture
	 * filtering and chromatic aberration causing images to "leak" between the two eye views.</p>
	 *
	 * @param hmd                   
	 * @param eye                   one of:<br>{@link #ovrEye_left Eye_left}, {@link #ovrEye_Right Eye_Right}, {@link #ovrEye_Count Eye_Count}
	 * @param fov                   
	 * @param pixelsPerDisplayPixel specifies the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can
	 *                              improve performance, higher values give improved quality.
	 */
	public static void ovrHmd_GetFovTextureSize(long hmd, int eye, ByteBuffer fov, float pixelsPerDisplayPixel, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novrHmd_GetFovTextureSize(hmd, eye, memAddress(fov), pixelsPerDisplayPixel, memAddress(__result));
	}

	// --- [ ovrHmd_ConfigureRendering ] ---

	/** JNI method for {@link #ovrHmd_ConfigureRendering Hmd_ConfigureRendering} */
	@JavadocExclude
	public static native boolean novrHmd_ConfigureRendering(long hmd, long apiConfig, int distortionCaps, long eyeFovIn, long eyeRenderDescOut);

	/**
	 * Configures rendering and fills in computed render parameters. This function can be called multiple times to change rendering settings.
	 * {@code eyeRenderDescOut} is a pointer to an array of two {@link OVREyeRenderDesc} structs that are used to return complete rendering information for each eye.
	 *
	 * @param hmd              
	 * @param apiConfig        
	 * @param distortionCaps   one of:<br>{@link #ovrDistortionCap_Chromatic DistortionCap_Chromatic}, {@link #ovrDistortionCap_TimeWarp DistortionCap_TimeWarp}, {@link #ovrDistortionCap_Vignette DistortionCap_Vignette}, {@link #ovrDistortionCap_NoRestore DistortionCap_NoRestore}, {@link #ovrDistortionCap_FlipInput DistortionCap_FlipInput}, {@link #ovrDistortionCap_SRGB DistortionCap_SRGB}, {@link #ovrDistortionCap_Overdrive DistortionCap_Overdrive}, {@link #ovrDistortionCap_HqDistortion DistortionCap_HqDistortion}, {@link #ovrDistortionCap_LinuxDevFullscreen DistortionCap_LinuxDevFullscreen}, {@link #ovrDistortionCap_ComputeShader DistortionCap_ComputeShader}, {@link #ovrDistortionCap_TimewarpJitDelay DistortionCap_TimewarpJitDelay}, {@link #ovrDistortionCap_ProfileNoTimewarpSpinWaits DistortionCap_ProfileNoTimewarpSpinWaits}
	 * @param eyeFovIn         
	 * @param eyeRenderDescOut 
	 */
	public static boolean ovrHmd_ConfigureRendering(long hmd, ByteBuffer apiConfig, int distortionCaps, ByteBuffer eyeFovIn, ByteBuffer eyeRenderDescOut) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(apiConfig, OVRRenderAPIConfig.SIZEOF);
			checkBuffer(eyeFovIn, 2 * OVRFovPort.SIZEOF);
			checkBuffer(eyeRenderDescOut, 2 * OVREyeRenderDesc.SIZEOF);
		}
		return novrHmd_ConfigureRendering(hmd, memAddress(apiConfig), distortionCaps, memAddress(eyeFovIn), memAddress(eyeRenderDescOut));
	}

	// --- [ ovrHmd_BeginFrame ] ---

	/** JNI method for {@link #ovrHmd_BeginFrame Hmd_BeginFrame} */
	@JavadocExclude
	public static native void novrHmd_BeginFrame(long hmd, int frameIndex, long __result);

	/**
	 * Begins a frame, returning timing information. This should be called at the beginning of the game rendering loop (on the render thread). Pass 0 for the
	 * frame index if not using {@link #ovrHmd_GetFrameTiming Hmd_GetFrameTiming}.
	 *
	 * @param hmd        
	 * @param frameIndex 
	 */
	public static void ovrHmd_BeginFrame(long hmd, int frameIndex, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_BeginFrame(hmd, frameIndex, memAddress(__result));
	}

	// --- [ ovrHmd_EndFrame ] ---

	/** JNI method for {@link #ovrHmd_EndFrame Hmd_EndFrame} */
	@JavadocExclude
	public static native void novrHmd_EndFrame(long hmd, long renderPose, long eyeTexture);

	/**
	 * Ends a frame, submitting the rendered textures to the frame buffer.
	 * <ul>
	 * <li>RenderViewport within each eyeTexture can change per frame if necessary.</li>
	 * <li>This may perform distortion and scaling internally, assuming is it not delegated to another thread.</li>
	 * <li>Must be called on the same thread as BeginFrame.</li>
	 * <li>If ovrDistortionCap_DepthProjectedTimeWarp is enabled, then app must provide eyeDepthTexture and posTimewarpDesc. Otherwise both can be {@code NULL}.</li>
	 * <li>*** This Function will call Present/SwapBuffers and potentially wait for GPU Sync ***</li>
	 * </ul>
	 *
	 * @param hmd        
	 * @param renderPose will typically be the value returned from {@link #ovrHmd_GetEyePoses Hmd_GetEyePoses} but can be different if a different head pose was used for rendering.
	 * @param eyeTexture 
	 */
	public static void ovrHmd_EndFrame(long hmd, ByteBuffer renderPose, ByteBuffer eyeTexture) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(renderPose, 2 * OVRPosef.SIZEOF);
			checkBuffer(eyeTexture, 2 * OVRTexture.SIZEOF);
		}
		novrHmd_EndFrame(hmd, memAddress(renderPose), memAddress(eyeTexture));
	}

	// --- [ ovrHmd_GetEyePoses ] ---

	/** JNI method for {@link #ovrHmd_GetEyePoses Hmd_GetEyePoses} */
	@JavadocExclude
	public static native void novrHmd_GetEyePoses(long hmd, int frameIndex, long hmdToEyeViewOffset, long outEyePoses, long outHmdTrackingState);

	/**
	 * Returns predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses} as an atomic operation. Caller need not worry
	 * about applying HmdToEyeViewOffset to the returned {@code outEyePoses} variables.
	 * <ul>
	 * <li>Thread-safe function where caller should increment frameIndex with every frame and pass the index where applicable to functions called on the
	 * rendering thread.</li>
	 * <li>hmdToEyeViewOffset[2] can be ovrEyeRenderDesc.HmdToEyeViewOffset returned from {@link #ovrHmd_ConfigureRendering Hmd_ConfigureRendering} or {@link #ovrHmd_GetRenderDesc Hmd_GetRenderDesc}. For monoscopic
	 * rendering, use a vector that is the average of the two vectors for both eyes.</li>
	 * <li>If frameIndex is not being utilized, pass in 0.</li>
	 * <li>Assuming outEyePoses are used for rendering, it should be passed into {@link #ovrHmd_EndFrame Hmd_EndFrame}.</li>
	 * <li>If caller doesn't need {@code outHmdTrackingState}, it can be passed in as {@code NULL}</li>
	 * </ul>
	 *
	 * @param hmd                 
	 * @param frameIndex          
	 * @param hmdToEyeViewOffset  
	 * @param outEyePoses         
	 * @param outHmdTrackingState 
	 */
	public static void ovrHmd_GetEyePoses(long hmd, int frameIndex, ByteBuffer hmdToEyeViewOffset, ByteBuffer outEyePoses, ByteBuffer outHmdTrackingState) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(hmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
			checkBuffer(outEyePoses, 2 * OVRPosef.SIZEOF);
			checkBuffer(outHmdTrackingState, OVRTrackingState.SIZEOF);
		}
		novrHmd_GetEyePoses(hmd, frameIndex, memAddress(hmdToEyeViewOffset), memAddress(outEyePoses), memAddress(outHmdTrackingState));
	}

	// --- [ ovrHmd_GetHmdPosePerEye ] ---

	/** JNI method for {@link #ovrHmd_GetHmdPosePerEye Hmd_GetHmdPosePerEye} */
	@JavadocExclude
	public static native void novrHmd_GetHmdPosePerEye(long hmd, int eye, long __result);

	/**
	 * Returns the predicted head pose to use when rendering the specified eye.
	 * <ul>
	 * <li>Important: Caller must apply HmdToEyeViewOffset before using ovrPosef for rendering</li>
	 * <li>Must be called between {@link #ovrHmd_BeginFrameTiming Hmd_BeginFrameTiming} and {@link #ovrHmd_EndFrameTiming Hmd_EndFrameTiming}.</li>
	 * <li>If returned pose is used for rendering the eye, it should be passed to {@link #ovrHmd_EndFrame Hmd_EndFrame}.</li>
	 * <li>Parameter 'eye' is used internally for prediction timing only</li>
	 * </ul>
	 *
	 * @param hmd 
	 * @param eye 
	 */
	public static void ovrHmd_GetHmdPosePerEye(long hmd, int eye, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_GetHmdPosePerEye(hmd, eye, memAddress(__result));
	}

	// --- [ ovrHmd_GetRenderDesc ] ---

	/** JNI method for {@link #ovrHmd_GetRenderDesc Hmd_GetRenderDesc} */
	@JavadocExclude
	public static native void novrHmd_GetRenderDesc(long hmd, int eyeType, long fov, long __result);

	/**
	 * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye. This can be used instead of
	 * {@link #ovrHmd_ConfigureRendering Hmd_ConfigureRendering} to do setup for client rendered distortion.
	 *
	 * @param hmd     
	 * @param eyeType 
	 * @param fov     
	 */
	public static void ovrHmd_GetRenderDesc(long hmd, int eyeType, ByteBuffer fov, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
		}
		novrHmd_GetRenderDesc(hmd, eyeType, memAddress(fov), memAddress(__result));
	}

	// --- [ ovrHmd_CreateDistortionMesh ] ---

	/** JNI method for {@link #ovrHmd_CreateDistortionMesh Hmd_CreateDistortionMesh} */
	@JavadocExclude
	public static native boolean novrHmd_CreateDistortionMesh(long hmd, int eyeType, long fov, int distortionCaps, long meshData);

	/**
	 * Generate distortion mesh per eye. Distortion capabilities will depend on 'distortionCaps' flags. Users should render using the appropriate shaders
	 * based on their settings. Distortion mesh data will be allocated and written into the ovrDistortionMesh data structure, which should be explicitly freed
	 * with {@link #ovrHmd_DestroyDistortionMesh Hmd_DestroyDistortionMesh}. Users should call {@link #ovrHmd_GetRenderScaleAndOffset Hmd_GetRenderScaleAndOffset} to get uvScale and Offset values for rendering. The function
	 * shouldn't fail unless theres is a configuration or memory error, in which case ovrDistortionMesh values will be set to null. This is the only function
	 * in the SDK reliant on eye relief, currently imported from profiles, or overridden here.
	 *
	 * @param hmd            
	 * @param eyeType        
	 * @param fov            
	 * @param distortionCaps one of:<br>{@link #ovrDistortionCap_Chromatic DistortionCap_Chromatic}, {@link #ovrDistortionCap_TimeWarp DistortionCap_TimeWarp}, {@link #ovrDistortionCap_Vignette DistortionCap_Vignette}, {@link #ovrDistortionCap_NoRestore DistortionCap_NoRestore}, {@link #ovrDistortionCap_FlipInput DistortionCap_FlipInput}, {@link #ovrDistortionCap_SRGB DistortionCap_SRGB}, {@link #ovrDistortionCap_Overdrive DistortionCap_Overdrive}, {@link #ovrDistortionCap_HqDistortion DistortionCap_HqDistortion}, {@link #ovrDistortionCap_LinuxDevFullscreen DistortionCap_LinuxDevFullscreen}, {@link #ovrDistortionCap_ComputeShader DistortionCap_ComputeShader}, {@link #ovrDistortionCap_TimewarpJitDelay DistortionCap_TimewarpJitDelay}, {@link #ovrDistortionCap_ProfileNoTimewarpSpinWaits DistortionCap_ProfileNoTimewarpSpinWaits}
	 * @param meshData       
	 */
	public static boolean ovrHmd_CreateDistortionMesh(long hmd, int eyeType, ByteBuffer fov, int distortionCaps, ByteBuffer meshData) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(fov, OVRFovPort.SIZEOF);
			checkBuffer(meshData, OVRDistortionMesh.SIZEOF);
		}
		return novrHmd_CreateDistortionMesh(hmd, eyeType, memAddress(fov), distortionCaps, memAddress(meshData));
	}

	// --- [ ovrHmd_CreateDistortionMeshDebug ] ---

	/** JNI method for {@link #ovrHmd_CreateDistortionMeshDebug Hmd_CreateDistortionMeshDebug} */
	@JavadocExclude
	public static native boolean novrHmd_CreateDistortionMeshDebug(long hmddesc, int eyeType, long fov, int distortionCaps, long meshData, float debugEyeReliefOverrideInMetres);

	/**
	 * Debug version of {@link #ovrHmd_CreateDistortionMesh Hmd_CreateDistortionMesh}.
	 *
	 * @param hmddesc                        
	 * @param eyeType                        
	 * @param fov                            
	 * @param distortionCaps                 one of:<br>{@link #ovrDistortionCap_Chromatic DistortionCap_Chromatic}, {@link #ovrDistortionCap_TimeWarp DistortionCap_TimeWarp}, {@link #ovrDistortionCap_Vignette DistortionCap_Vignette}, {@link #ovrDistortionCap_NoRestore DistortionCap_NoRestore}, {@link #ovrDistortionCap_FlipInput DistortionCap_FlipInput}, {@link #ovrDistortionCap_SRGB DistortionCap_SRGB}, {@link #ovrDistortionCap_Overdrive DistortionCap_Overdrive}, {@link #ovrDistortionCap_HqDistortion DistortionCap_HqDistortion}, {@link #ovrDistortionCap_LinuxDevFullscreen DistortionCap_LinuxDevFullscreen}, {@link #ovrDistortionCap_ComputeShader DistortionCap_ComputeShader}, {@link #ovrDistortionCap_TimewarpJitDelay DistortionCap_TimewarpJitDelay}, {@link #ovrDistortionCap_ProfileNoTimewarpSpinWaits DistortionCap_ProfileNoTimewarpSpinWaits}
	 * @param meshData                       
	 * @param debugEyeReliefOverrideInMetres 
	 */
	public static boolean ovrHmd_CreateDistortionMeshDebug(long hmddesc, int eyeType, ByteBuffer fov, int distortionCaps, ByteBuffer meshData, float debugEyeReliefOverrideInMetres) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmddesc);
			checkBuffer(fov, OVRFovPort.SIZEOF);
			checkBuffer(meshData, OVRDistortionMesh.SIZEOF);
		}
		return novrHmd_CreateDistortionMeshDebug(hmddesc, eyeType, memAddress(fov), distortionCaps, memAddress(meshData), debugEyeReliefOverrideInMetres);
	}

	// --- [ ovrHmd_DestroyDistortionMesh ] ---

	/** JNI method for {@link #ovrHmd_DestroyDistortionMesh Hmd_DestroyDistortionMesh} */
	@JavadocExclude
	public static native void novrHmd_DestroyDistortionMesh(long meshData);

	/**
	 * Used to free the distortion mesh allocated by {@link #ovrHmd_CreateDistortionMesh Hmd_CreateDistortionMesh}. {@code meshData} elements are set to null and zeroes after the call.
	 *
	 * @param meshData 
	 */
	public static void ovrHmd_DestroyDistortionMesh(ByteBuffer meshData) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(meshData, OVRDistortionMesh.SIZEOF);
		novrHmd_DestroyDistortionMesh(memAddress(meshData));
	}

	// --- [ ovrHmd_GetRenderScaleAndOffset ] ---

	/** JNI method for {@link #ovrHmd_GetRenderScaleAndOffset Hmd_GetRenderScaleAndOffset} */
	@JavadocExclude
	public static native void novrHmd_GetRenderScaleAndOffset(long fov, long textureSize, long renderViewport, long uvScaleOffsetOut);

	/**
	 * Computes updated 'uvScaleOffsetOut' to be used with a distortion if render target size or viewport changes after the fact. This can be used to adjust
	 * render size every frame if desired.
	 *
	 * @param fov              
	 * @param textureSize      
	 * @param renderViewport   
	 * @param uvScaleOffsetOut 
	 */
	public static void ovrHmd_GetRenderScaleAndOffset(ByteBuffer fov, ByteBuffer textureSize, ByteBuffer renderViewport, ByteBuffer uvScaleOffsetOut) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(fov, OVRFovPort.SIZEOF);
			checkBuffer(textureSize, OVRSizei.SIZEOF);
			checkBuffer(renderViewport, OVRRecti.SIZEOF);
			checkBuffer(uvScaleOffsetOut, 2 * OVRVector2f.SIZEOF);
		}
		novrHmd_GetRenderScaleAndOffset(memAddress(fov), memAddress(textureSize), memAddress(renderViewport), memAddress(uvScaleOffsetOut));
	}

	// --- [ ovrHmd_GetFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_GetFrameTiming Hmd_GetFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_GetFrameTiming(long hmd, int frameIndex, long __result);

	/**
	 * Thread-safe timing function for the main thread. Caller should increment frameIndex with every frame and pass the index where applicable to functions
	 * called on the rendering thread.
	 *
	 * @param hmd        
	 * @param frameIndex 
	 */
	public static void ovrHmd_GetFrameTiming(long hmd, int frameIndex, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_GetFrameTiming(hmd, frameIndex, memAddress(__result));
	}

	// --- [ ovrHmd_BeginFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_BeginFrameTiming Hmd_BeginFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_BeginFrameTiming(long hmd, int frameIndex, long __result);

	/**
	 * Called at the beginning of the frame on the rendering thread. Pass frameIndex == 0 if {@link #ovrHmd_GetFrameTiming Hmd_GetFrameTiming} isn't being used. Otherwise, pass the same
	 * frame index as was used for GetFrameTiming on the main thread.
	 *
	 * @param hmd        
	 * @param frameIndex 
	 */
	public static void ovrHmd_BeginFrameTiming(long hmd, int frameIndex, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_BeginFrameTiming(hmd, frameIndex, memAddress(__result));
	}

	// --- [ ovrHmd_EndFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_EndFrameTiming Hmd_EndFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_EndFrameTiming(long hmd);

	/**
	 * Marks the end of client distortion rendered frame, tracking the necessary timing information. This function must be called immediately after
	 * Present/SwapBuffers + GPU sync. GPU sync is important before this call to reduce latency and ensure proper timing.
	 *
	 * @param hmd 
	 */
	public static void ovrHmd_EndFrameTiming(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_EndFrameTiming(hmd);
	}

	// --- [ ovrHmd_ResetFrameTiming ] ---

	/** JNI method for {@link #ovrHmd_ResetFrameTiming Hmd_ResetFrameTiming} */
	@JavadocExclude
	public static native void novrHmd_ResetFrameTiming(long hmd, int frameIndex);

	/**
	 * Initializes and resets frame time tracking. This is typically not necessary, but is helpful if game changes vsync state or video mode. vsync is assumed
	 * to be on if this isn't called. Resets internal frame index to the specified number.
	 *
	 * @param hmd        
	 * @param frameIndex 
	 */
	public static void ovrHmd_ResetFrameTiming(long hmd, int frameIndex) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		novrHmd_ResetFrameTiming(hmd, frameIndex);
	}

	// --- [ ovrHmd_GetEyeTimewarpMatrices ] ---

	/** JNI method for {@link #ovrHmd_GetEyeTimewarpMatrices Hmd_GetEyeTimewarpMatrices} */
	@JavadocExclude
	public static native void novrHmd_GetEyeTimewarpMatrices(long hmd, int eye, long renderPose, long twmOut);

	/**
	 * Computes timewarp matrices used by distortion mesh shader, these are used to adjust for head orientation change since the last call to
	 * {@link #ovrHmd_GetEyePoses Hmd_GetEyePoses} when rendering this eye. The ovrDistortionVertex::TimeWarpFactor is used to blend between the matrices, usually representing two
	 * different sides of the screen.
	 * 
	 * <p>Set 'calcPosition' to true when using depth based positional timewarp.</p>
	 * 
	 * <p>Must be called on the same thread as {@link #ovrHmd_BeginFrameTiming Hmd_BeginFrameTiming}.</p>
	 *
	 * @param hmd        
	 * @param eye        
	 * @param renderPose 
	 * @param twmOut     
	 */
	public static void ovrHmd_GetEyeTimewarpMatrices(long hmd, int eye, ByteBuffer renderPose, ByteBuffer twmOut) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(renderPose, OVRPosef.SIZEOF);
			checkBuffer(twmOut, 2 * OVRMatrix4f.SIZEOF);
		}
		novrHmd_GetEyeTimewarpMatrices(hmd, eye, memAddress(renderPose), memAddress(twmOut));
	}

	// --- [ ovrHmd_GetEyeTimewarpMatricesDebug ] ---

	/** JNI method for {@link #ovrHmd_GetEyeTimewarpMatricesDebug Hmd_GetEyeTimewarpMatricesDebug} */
	@JavadocExclude
	public static native void novrHmd_GetEyeTimewarpMatricesDebug(long hmd, int eye, long renderPose, long playerTorsoMotion, long twmOut, double debugTimingOffsetInSeconds);

	/**
	 * Debug version of {@link #ovrHmd_GetEyeTimewarpMatrices Hmd_GetEyeTimewarpMatrices}.
	 *
	 * @param hmd                        
	 * @param eye                        
	 * @param renderPose                 
	 * @param playerTorsoMotion          
	 * @param twmOut                     
	 * @param debugTimingOffsetInSeconds 
	 */
	public static void ovrHmd_GetEyeTimewarpMatricesDebug(long hmd, int eye, ByteBuffer renderPose, ByteBuffer playerTorsoMotion, ByteBuffer twmOut, double debugTimingOffsetInSeconds) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(renderPose, OVRPosef.SIZEOF);
			checkBuffer(playerTorsoMotion, OVRQuatf.SIZEOF);
			checkBuffer(twmOut, 2 * OVRMatrix4f.SIZEOF);
		}
		novrHmd_GetEyeTimewarpMatricesDebug(hmd, eye, memAddress(renderPose), memAddress(playerTorsoMotion), memAddress(twmOut), debugTimingOffsetInSeconds);
	}

	// --- [ ovr_GetTimeInSeconds ] ---

	/** Returns global, absolute high-resolution time in seconds. This is the same value as used in sensor messages. */
	public static native double ovr_GetTimeInSeconds();

	// --- [ ovrHmd_ProcessLatencyTest ] ---

	/** JNI method for {@link #ovrHmd_ProcessLatencyTest Hmd_ProcessLatencyTest} */
	@JavadocExclude
	public static native boolean novrHmd_ProcessLatencyTest(long hmd, long rgbColorOut);

	/**
	 * Does latency test processing and returns 'TRUE' if specified rgb color should be used to clear the screen.
	 *
	 * @param hmd         
	 * @param rgbColorOut 
	 */
	public static boolean ovrHmd_ProcessLatencyTest(long hmd, ByteBuffer rgbColorOut) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(rgbColorOut, 3);
		}
		return novrHmd_ProcessLatencyTest(hmd, memAddress(rgbColorOut));
	}

	// --- [ ovrHmd_GetLatencyTestResult ] ---

	/** JNI method for {@link #ovrHmd_GetLatencyTestResult Hmd_GetLatencyTestResult} */
	@JavadocExclude
	public static native long novrHmd_GetLatencyTestResult(long hmd);

	/**
	 * Returns non-null string once with latency test result, when it is available. Buffer is valid until next call.
	 *
	 * @param hmd 
	 */
	public static String ovrHmd_GetLatencyTestResult(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		long __result = novrHmd_GetLatencyTestResult(hmd);
		return memDecodeASCII(__result);
	}

	// --- [ ovrHmd_GetLatencyTest2DrawColor ] ---

	/** JNI method for {@link #ovrHmd_GetLatencyTest2DrawColor Hmd_GetLatencyTest2DrawColor} */
	@JavadocExclude
	public static native boolean novrHmd_GetLatencyTest2DrawColor(long hmddesc, long rgbColorOut);

	/**
	 * Returns the latency testing color in rgbColorOut to render when using a DK2. Returns false if this feature is disabled or not-applicable (e.g. using a
	 * DK1).
	 *
	 * @param hmddesc     
	 * @param rgbColorOut 
	 */
	public static boolean ovrHmd_GetLatencyTest2DrawColor(long hmddesc, ByteBuffer rgbColorOut) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmddesc);
			checkBuffer(rgbColorOut, 3);
		}
		return novrHmd_GetLatencyTest2DrawColor(hmddesc, memAddress(rgbColorOut));
	}

	// --- [ ovrHmd_GetHSWDisplayState ] ---

	/** JNI method for {@link #ovrHmd_GetHSWDisplayState Hmd_GetHSWDisplayState} */
	@JavadocExclude
	public static native void novrHmd_GetHSWDisplayState(long hmd, long hasWarningState);

	/**
	 * Returns the current state of the HSW display. If the application is doing the rendering of the HSW display then this function serves to indicate that
	 * the warning should be currently displayed. If the application is using SDK-based eye rendering then the SDK by default automatically handles the
	 * drawing of the HSW display. An application that uses application-based eye rendering should use this function to know when to start drawing the HSW
	 * display itself and can optionally use it in conjunction with ovrhmd_DismissHSWDisplay as described below.
	 * 
	 * <p>Example usage for application-based rendering:
	 * <pre><code style="font-family: monospace">
	 * bool HSWDisplayCurrentlyDisplayed = false; // global or class member variable
	 * ovrHSWDisplayState hswDisplayState;
	 * ovrhmd_GetHSWDisplayState(Hmd, &hswDisplayState);
	 * 
	 * if (hswDisplayState.Displayed && !HSWDisplayCurrentlyDisplayed) {
	 * 	<insert model into the scene that stays in front of the user>
	 * 	HSWDisplayCurrentlyDisplayed = true;
	 * }</code></pre></p>
	 *
	 * @param hmd             
	 * @param hasWarningState 
	 */
	public static void ovrHmd_GetHSWDisplayState(long hmd, ByteBuffer hasWarningState) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(hasWarningState, OVRHSWDisplayState.SIZEOF);
		}
		novrHmd_GetHSWDisplayState(hmd, memAddress(hasWarningState));
	}

	// --- [ ovrHmd_DismissHSWDisplay ] ---

	/** JNI method for {@link #ovrHmd_DismissHSWDisplay Hmd_DismissHSWDisplay} */
	@JavadocExclude
	public static native boolean novrHmd_DismissHSWDisplay(long hmd);

	/**
	 * Requests a dismissal of the HSWDisplay at the earliest possible time, which may be seconds into the future due to display longevity requirements.
	 * 
	 * <p>Example usage:
	 * <pre><code style="font-family: monospace">
	 * void ProcessEvent(int key) {
	 * 	if ( key == escape )
	 * 		ovrhmd_DismissHSWDisplay(hmd);
	 * }</code></pre></p>
	 *
	 * @param hmd 
	 *
	 * @return true if the display is valid, in which case the request can always be honored
	 */
	public static boolean ovrHmd_DismissHSWDisplay(long hmd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_DismissHSWDisplay(hmd);
	}

	// --- [ ovrHmd_GetBool ] ---

	/** JNI method for {@link #ovrHmd_GetBool Hmd_GetBool} */
	@JavadocExclude
	public static native boolean novrHmd_GetBool(long hmd, long propertyName, boolean defaultVal);

	/**
	 * Get boolean property. Returns first element if property is a boolean array. Returns defaultValue if property doesn't exist.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param defaultVal   
	 */
	public static boolean ovrHmd_GetBool(long hmd, ByteBuffer propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetBool(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetBool Hmd_GetBool} */
	public static boolean ovrHmd_GetBool(long hmd, CharSequence propertyName, boolean defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetBool(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetBool ] ---

	/** JNI method for {@link #ovrHmd_SetBool Hmd_SetBool} */
	@JavadocExclude
	public static native boolean novrHmd_SetBool(long hmd, long propertyName, boolean value);

	/**
	 * Modify bool property; false if property doesn't exist or is readonly.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param value        
	 */
	public static boolean ovrHmd_SetBool(long hmd, ByteBuffer propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetBool(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetBool Hmd_SetBool} */
	public static boolean ovrHmd_SetBool(long hmd, CharSequence propertyName, boolean value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetBool(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetInt ] ---

	/** JNI method for {@link #ovrHmd_GetInt Hmd_GetInt} */
	@JavadocExclude
	public static native int novrHmd_GetInt(long hmd, long propertyName, int defaultVal);

	/**
	 * Get integer property. Returns first element if property is an integer array. Returns defaultValue if property doesn't exist.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param defaultVal   
	 */
	public static int ovrHmd_GetInt(long hmd, ByteBuffer propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetInt(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetInt Hmd_GetInt} */
	public static int ovrHmd_GetInt(long hmd, CharSequence propertyName, int defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetInt(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetInt ] ---

	/** JNI method for {@link #ovrHmd_SetInt Hmd_SetInt} */
	@JavadocExclude
	public static native boolean novrHmd_SetInt(long hmd, long propertyName, int value);

	/**
	 * Modify integer property; false if property doesn't exist or is readonly.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param value        
	 */
	public static boolean ovrHmd_SetInt(long hmd, ByteBuffer propertyName, int value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetInt(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetInt Hmd_SetInt} */
	public static boolean ovrHmd_SetInt(long hmd, CharSequence propertyName, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetInt(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetFloat ] ---

	/** JNI method for {@link #ovrHmd_GetFloat Hmd_GetFloat} */
	@JavadocExclude
	public static native float novrHmd_GetFloat(long hmd, long propertyName, float defaultVal);

	/**
	 * Get float property. Returns first element if property is a float array. Returns defaultValue if property doesn't exist.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param defaultVal   
	 */
	public static float ovrHmd_GetFloat(long hmd, ByteBuffer propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_GetFloat(hmd, memAddress(propertyName), defaultVal);
	}

	/** CharSequence version of: {@link #ovrHmd_GetFloat Hmd_GetFloat} */
	public static float ovrHmd_GetFloat(long hmd, CharSequence propertyName, float defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetFloat(hmd, __buffer.address(propertyNameEncoded), defaultVal);
	}

	// --- [ ovrHmd_SetFloat ] ---

	/** JNI method for {@link #ovrHmd_SetFloat Hmd_SetFloat} */
	@JavadocExclude
	public static native boolean novrHmd_SetFloat(long hmd, long propertyName, float value);

	/**
	 * Modify float property; false if property doesn't exist or is readonly.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param value        
	 */
	public static boolean ovrHmd_SetFloat(long hmd, ByteBuffer propertyName, float value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
		}
		return novrHmd_SetFloat(hmd, memAddress(propertyName), value);
	}

	/** CharSequence version of: {@link #ovrHmd_SetFloat Hmd_SetFloat} */
	public static boolean ovrHmd_SetFloat(long hmd, CharSequence propertyName, float value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetFloat(hmd, __buffer.address(propertyNameEncoded), value);
	}

	// --- [ ovrHmd_GetFloatArray ] ---

	/** JNI method for {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	@JavadocExclude
	public static native int novrHmd_GetFloatArray(long hmd, long propertyName, long values, int arraySize);

	/**
	 * Get float[] property. Returns the number of elements filled in, 0 if property doesn't exist. Maximum of arraySize elements will be written.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param values       
	 * @param arraySize    
	 */
	public static int ovrHmd_GetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int arraySize) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, arraySize << 2);
		}
		return novrHmd_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), arraySize);
	}

	/** Alternative version of: {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	public static int ovrHmd_GetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_GetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovrHmd_GetFloatArray Hmd_GetFloatArray} */
	public static int ovrHmd_GetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_GetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovrHmd_SetFloatArray ] ---

	/** JNI method for {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	@JavadocExclude
	public static native boolean novrHmd_SetFloatArray(long hmd, long propertyName, long values, int arraySize);

	/**
	 * Modify float[] property; false if property doesn't exist or is readonly.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param values       
	 * @param arraySize    
	 */
	public static boolean ovrHmd_SetFloatArray(long hmd, ByteBuffer propertyName, ByteBuffer values, int arraySize) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkNT1(propertyName);
			checkBuffer(values, arraySize << 2);
		}
		return novrHmd_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), arraySize);
	}

	/** Alternative version of: {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	public static boolean ovrHmd_SetFloatArray(long hmd, ByteBuffer propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_SetFloatArray(hmd, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/** CharSequence version of: {@link #ovrHmd_SetFloatArray Hmd_SetFloatArray} */
	public static boolean ovrHmd_SetFloatArray(long hmd, CharSequence propertyName, FloatBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		return novrHmd_SetFloatArray(hmd, __buffer.address(propertyNameEncoded), memAddress(values), values.remaining());
	}

	// --- [ ovrHmd_GetString ] ---

	/** JNI method for {@link #ovrHmd_GetString Hmd_GetString} */
	@JavadocExclude
	public static native long novrHmd_GetString(long hmd, long propertyName, long defaultVal);

	/**
	 * Get string property. Returns first element if property is a string array. Returns defaultValue if property doesn't exist. String memory is guaranteed
	 * to exist until next call to GetString or GetStringArray, or HMD is destroyed.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param defaultVal   
	 */
	public static String ovrHmd_GetString(long hmd, ByteBuffer propertyName, ByteBuffer defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		long __result = novrHmd_GetString(hmd, memAddress(propertyName), memAddress(defaultVal));
		return memDecodeASCII(__result);
	}

	/**
	 * Get string property. Returns first element if property is a string array. Returns defaultValue if property doesn't exist. String memory is guaranteed
	 * to exist until next call to GetString or GetStringArray, or HMD is destroyed.
	 *
	 * @param hmd          
	 * @param propertyName 
	 * @param defaultVal   
	 */
	public static String ovrHmd_GetString(long hmd, CharSequence propertyName, CharSequence defaultVal) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int defaultValEncoded = __buffer.stringParamASCII(defaultVal, true);
		long __result = novrHmd_GetString(hmd, __buffer.address(propertyNameEncoded), __buffer.address(defaultValEncoded));
		return memDecodeASCII(__result);
	}

	// --- [ ovrHmd_SetString ] ---

	/** JNI method for {@link #ovrHmd_SetString Hmd_SetString} */
	@JavadocExclude
	public static native boolean novrHmd_SetString(long hmddesc, long propertyName, long value);

	/**
	 * Set string property
	 *
	 * @param hmddesc      
	 * @param propertyName 
	 * @param value        
	 */
	public static boolean ovrHmd_SetString(long hmddesc, ByteBuffer propertyName, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmddesc);
			checkNT1(propertyName);
			checkNT1(value);
		}
		return novrHmd_SetString(hmddesc, memAddress(propertyName), memAddress(value));
	}

	/** CharSequence version of: {@link #ovrHmd_SetString Hmd_SetString} */
	public static boolean ovrHmd_SetString(long hmddesc, CharSequence propertyName, CharSequence value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmddesc);
		APIBuffer __buffer = apiBuffer();
		int propertyNameEncoded = __buffer.stringParamASCII(propertyName, true);
		int valueEncoded = __buffer.stringParamASCII(value, true);
		return novrHmd_SetString(hmddesc, __buffer.address(propertyNameEncoded), __buffer.address(valueEncoded));
	}

	// --- [ ovr_TraceMessage ] ---

	/** JNI method for {@link #ovr_TraceMessage _TraceMessage} */
	@JavadocExclude
	public static native int novr_TraceMessage(int level, long message);

	/**
	 * Sends a message string to the system tracing mechanism if enabled (currently Event Tracing for Windows)
	 *
	 * @param level   the log level. One of:<br>{@link #ovrLogLevel_Debug LogLevel_Debug}, {@link #ovrLogLevel_Info LogLevel_Info}, {@link #ovrLogLevel_Error LogLevel_Error}
	 * @param message the message
	 *
	 * @return the length of the message, or -1 if message is too large
	 */
	public static int ovr_TraceMessage(int level, ByteBuffer message) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(message);
		return novr_TraceMessage(level, memAddress(message));
	}

	/** CharSequence version of: {@link #ovr_TraceMessage _TraceMessage} */
	public static int ovr_TraceMessage(int level, CharSequence message) {
		APIBuffer __buffer = apiBuffer();
		int messageEncoded = __buffer.stringParamASCII(message, true);
		return novr_TraceMessage(level, __buffer.address(messageEncoded));
	}

     /**
	 * Creates a {@link OVRLogCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link OVRLogCallback} instance
	 */
	public static OVRLogCallback OVRLogCallback(final OVRLogCallback.SAM sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(int level, long message) {
				sam.invoke(level, message);
			}
		};
	}

}