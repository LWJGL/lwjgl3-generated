/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>Overview of the API:</p>
 * 
 * <h3>Setup</h3>
 * 
 * <ul>
 * <li>{@link #ovr_Initialize Initialize}</li>
 * <li>{@link #ovr_Create Create}(&hmd, &graphicsId)</li>
 * <li>Use hmd members and {@link #ovr_GetFovTextureSize GetFovTextureSize} to determine graphics configuration and {@link #ovr_GetRenderDesc GetRenderDesc} to get per-eye rendering parameters.</li>
 * <li>Allocate texture swap chains with {@code ovr_CreateTextureSwapChainDX()} or {@link OVRGL#ovr_CreateTextureSwapChainGL CreateTextureSwapChainGL}. Create any associated render target
 * views or frame buffer objects.</li>
 * </ul>
 * 
 * <h3>Application Loop</h3>
 * 
 * <ul>
 * <li>Call {@link #ovr_GetPredictedDisplayTime GetPredictedDisplayTime} to get the current frame timing information.</li>
 * <li>Call {@link #ovr_GetTrackingState GetTrackingState} and {@link OVRUtil#ovr_CalcEyePoses CalcEyePoses} to obtain the predicted rendering pose for each eye based on timing.</li>
 * <li>Render the scene content into the current buffer of the texture swapchains for each eye and layer you plan to update this frame. If you render into
 * a texture swap chain, you must call {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} on it to commit the changes before you reference the chain this frame (otherwise,
 * your latest changes won't be picked up).</li>
 * <li>Call {@link #ovr_SubmitFrame SubmitFrame} to render the distorted layers to and present them on the HMD. If {@link #ovr_SubmitFrame SubmitFrame} returns {@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}, there
 * is no need to render the scene for the next loop iteration. Instead, just call {@link #ovr_SubmitFrame SubmitFrame} again until it returns {@link OVRErrorCode#ovrSuccess Success}.</li>
 * </ul>
 * 
 * <h3>Shutdown</h3>
 * 
 * <ul>
 * <li>{@link #ovr_Destroy Destroy}</li>
 * <li>{@link #ovr_Shutdown Shutdown}</li>
 * </ul>
 */
public class OVR {

	/** Boolean values */
	public static final int
		ovrFalse = 0,
		ovrTrue  = 1;

	/**
	 * When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and
	 * debug application code.
	 */
	public static final int ovrInit_Debug = 0x1;

	/**
	 * When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
	 * {@code RequestedMinorVersion} is supported.
	 */
	public static final int ovrInit_RequestVersion = 0x4;

	/** These bits are writable by user code. */
	public static final int ovrInit_WritableBits = 0xFFFFFF;

	/** Debug-level log event. */
	public static final int ovrLogLevel_Debug = 0;

	/** Info-level log event. */
	public static final int ovrLogLevel_Info = 1;

	/** Error-level log event. */
	public static final int ovrLogLevel_Error = 2;

	/** HMD types. ({@code ovrHmdType}) */
	public static final int
		ovrHmd_None    = 0,
		ovrHmd_DK1     = 3,
		ovrHmd_DKHD    = 4,
		ovrHmd_DK2     = 6,
		ovrHmd_CB      = 8,
		ovrHmd_Other   = 9,
		ovrHmd_E3_2015 = 10,
		ovrHmd_ES06    = 11,
		ovrHmd_ES09    = 12,
		ovrHmd_ES11    = 13,
		ovrHmd_CV1     = 14;

	/** (read only) Specifies that the HMD is a virtual debug device. */
	public static final int ovrHmdCap_DebugDevice = 0x10;

	/** Supports orientation tracking (IMU). */
	public static final int ovrTrackingCap_Orientation = 0x10;

	/** Supports yaw drift correction via a magnetometer or other means. */
	public static final int ovrTrackingCap_MagYawCorrection = 0x20;

	/** Supports positional tracking. */
	public static final int ovrTrackingCap_Position = 0x40;

	/** The left eye, from the viewer's perspective. */
	public static final int ovrEye_Left = 0;

	/** The right eye, from the viewer's perspective. */
	public static final int ovrEye_Right = 1;

	/**
	 * Tracking system origin reported at eye (HMD) height.
	 * 
	 * <p>Prefer using this origin when your application requires matching user's current physical head pose to a virtual head pose without any regards to a
	 * the height of the floor. Cockpit-based, or 3rd-person experiences are ideal candidates. When used, all poses in {@link OVRTrackingState} are reported as
	 * an offset transform from the profile calibrated or recentered HMD pose. It is recommended that apps using this origin type call
	 * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} prior to starting the VR experience, but notify the user before doing so to make sure the user is in a comfortable pose,
	 * facing a comfortable direction.</p>
	 */
	public static final int ovrTrackingOrigin_EyeLevel = 0;

	/**
	 * Tracking system origin reported at floor height.
	 * 
	 * <p>Prefer using this origin when your application requires the physical floor height to match the virtual floor height, such as standing experiences.
	 * When used, all poses in {@link OVRTrackingState} are reported as an offset transform from the profile calibrated floor pose. Calling
	 * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} will recenter the X & Z axes as well as yaw, but the Y-axis (i.e. height) will continue to be reported using the floor
	 * height as the origin for all poses.</p>
	 */
	public static final int ovrTrackingOrigin_FloorLevel = 1;

	/** Orientation is currently tracked (connected and in use). */
	public static final int ovrStatus_OrientationTracked = 0x1;

	/** Position is currently tracked (false if out of range). */
	public static final int ovrStatus_PositionTracked = 0x2;

	/** The sensor is present, else the sensor is absent or offline. */
	public static final int ovrTracker_Connected = 0x20;

	/** The sensor has a valid pose, else the pose is unavailable. This will only be set if ovrTracker_Connected is set. */
	public static final int ovrTracker_PoseTracked = 0x4;

	/** 2D textures */
	public static final int ovrTexture_2D = 0;

	/** External 2D texture. Not used on PC */
	public static final int ovrTexture_2D_External = 1;

	/** Cube maps. Not currently supported on PC. */
	public static final int ovrTexture_Cube = 2;

	/**
	 * The bindings required for texture swap chain. ({@code ovrTextureBindFlags})
	 * 
	 * <p>All texture swap chains are automatically bindable as shader input resources since the Oculus runtime needs this to read them.</p>
	 */
	public static final int ovrTextureBind_None = 0;

	/** The application can write into the chain with pixel shader */
	public static final int ovrTextureBind_DX_RenderTarget = 0x1;

	/** The application can write to the chain with compute shader */
	public static final int ovrTextureBind_DX_UnorderedAccess = 0x2;

	/** The chain buffers can be bound as depth and/or stencil buffers */
	public static final int ovrTextureBind_DX_DepthStencil = 0x4;

	/** The format of a texture. ({@code ovrTextureFormat}) */
	public static final int
		OVR_FORMAT_UNKNOWN              = 0,
		OVR_FORMAT_R8G8B8A8_UNORM       = 4,
		OVR_FORMAT_R8G8B8A8_UNORM_SRGB  = 5,
		OVR_FORMAT_B8G8R8A8_UNORM       = 6,
		OVR_FORMAT_R16G16B16A16_FLOAT   = 10,
		OVR_FORMAT_D16_UNORM            = 11,
		OVR_FORMAT_D24_UNORM_S8_UINT    = 12,
		OVR_FORMAT_D32_FLOAT            = 13,
		OVR_FORMAT_D32_FLOAT_S8X24_UINT = 14;

	/** Not currently supported on PC. Would require a DirectX 11.1 device. */
	public static final int OVR_FORMAT_B5G6R5_UNORM = 1;

	/** Not currently supported on PC. Would require a DirectX 11.1 device. */
	public static final int OVR_FORMAT_B5G5R5A1_UNORM = 2;

	/** Not currently supported on PC. Would require a DirectX 11.1 device. */
	public static final int OVR_FORMAT_B4G4R4A4_UNORM = 3;

	/** Not supported for OpenGL applications. */
	public static final int OVR_FORMAT_B8G8R8A8_UNORM_SRGB = 7;

	/** Not supported for OpenGL applications. */
	public static final int OVR_FORMAT_B8G8R8X8_UNORM = 8;

	/** Not supported for OpenGL applications. */
	public static final int OVR_FORMAT_B8G8R8X8_UNORM_SRGB = 9;

	/** Misc flags overriding particular behaviors of a texture swap chain. ({@code ovrTextureFlags}) */
	public static final int ovrTextureMisc_None = 0;

	/**
	 * DX only: The underlying texture is created with a TYPELESS equivalent of the format specified in the texture desc. The SDK will still access the
	 * texture using the format specified in the texture desc, but the app can create views with different formats if this is specified.
	 */
	public static final int ovrTextureMisc_DX_Typeless = 0x1;

	/** DX only: Allow generation of the mip chain on the GPU via the GenerateMips call. This flag requires that RenderTarget binding also be specified. */
	public static final int ovrTextureMisc_AllowGenerateMips = 0x2;

	/**
	 * Texture swap chain contains protected content, and requires HDCP connection in order to display to HMD. Also prevents mirroring or other
	 * redirection of any frame containing this contents
	 */
	public static final int ovrTextureMisc_ProtectedContent = 0x4;

	/** Button A */
	public static final int ovrButton_A = 0x1;

	/** Button B */
	public static final int ovrButton_B = 0x2;

	/** Button RThumb */
	public static final int ovrButton_RThumb = 0x4;

	/** Button RShoulder */
	public static final int ovrButton_RShoulder = 0x8;

	/** Bit mask of all buttons on the right Touch controller */
	public static final int ovrButton_RMask = ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder;

	/** Button X */
	public static final int ovrButton_X = 0x100;

	/** Button Y */
	public static final int ovrButton_Y = 0x200;

	/** Button LThumb */
	public static final int ovrButton_LThumb = 0x400;

	/** Button LShoulder */
	public static final int ovrButton_LShoulder = 0x800;

	/** Bit mask of all buttons on the left Touch controller */
	public static final int ovrButton_LMask = ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder;

	/** Button Up */
	public static final int ovrButton_Up = 0x10000;

	/** Button Down */
	public static final int ovrButton_Down = 0x20000;

	/** Button Left */
	public static final int ovrButton_Left = 0x40000;

	/** Button Right */
	public static final int ovrButton_Right = 0x80000;

	/** Button Enter */
	public static final int ovrButton_Enter = 0x100000;

	/** Button Back */
	public static final int ovrButton_Back = 0x200000;

	/** Button VolUp */
	public static final int ovrButton_VolUp = 0x400000;

	/** Button VolDown */
	public static final int ovrButton_VolDown = 0x800000;

	/** Button Home */
	public static final int ovrButton_Home = 0x1000000;

	/** Button input types. ({@code ovrTouch}) */
	public static final int ovrButton_Private = ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home;

	/** Touch A */
	public static final int ovrTouch_A = ovrButton_A;

	/** Touch B */
	public static final int ovrTouch_B = ovrButton_B;

	/** Touch RThumb */
	public static final int ovrTouch_RThumb = ovrButton_RThumb;

	/** Touch RIndexTrigger */
	public static final int ovrTouch_RIndexTrigger = 0x10;

	/** Bit mask of all the button touches on the right controller */
	public static final int ovrTouch_RButtonMask = ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RIndexTrigger;

	/** Touch X */
	public static final int ovrTouch_X = ovrButton_X;

	/** Touch Y */
	public static final int ovrTouch_Y = ovrButton_Y;

	/** Touch LThumb */
	public static final int ovrTouch_LThumb = ovrButton_LThumb;

	/** Touch LIndexTrigger */
	public static final int ovrTouch_LIndexTrigger = 0x1000;

	/** Bit mask of all the button touches on the left controller */
	public static final int ovrTouch_LButtonMask = ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LIndexTrigger;

	/** TouchRIndexPointing */
	public static final int ovrTouch_RIndexPointing = 0x20;

	/** Touch RThumbUp */
	public static final int ovrTouch_RThumbUp = 0x40;

	/** Bit mask of all right controller poses */
	public static final int ovrTouch_RPoseMask = ovrTouch_RIndexPointing | ovrTouch_RThumbUp;

	/** Touch LIndexPointing */
	public static final int ovrTouch_LIndexPointing = 0x2000;

	/** Touch LThumbUp */
	public static final int ovrTouch_LThumbUp = 0x4000;

	/** Bit mask of all left controller poses. */
	public static final int ovrTouch_LPoseMask = ovrTouch_LIndexPointing | ovrTouch_LThumbUp;

	/** Which controller is connected; multiple can be connected at once. ({@code ovrControllerType}) */
	public static final int
		ovrControllerType_None   = 0x0,
		ovrControllerType_LTouch = 0x1,
		ovrControllerType_RTouch = 0x2,
		ovrControllerType_Touch  = 0x3,
		ovrControllerType_Remote = 0x4,
		ovrControllerType_XBox   = 0x10;

	/** Operate on or query whichever controller is active. */
	public static final int ovrControllerType_Active = 0xFF;

	/** Names for the left and right hand array indexes. ({@code ovrHandType}) */
	public static final int
		ovrHand_Left  = 0x0,
		ovrHand_Right = 0x1;

	/** Specifies the maximum number of layers supported by {@link #ovr_SubmitFrame SubmitFrame}. */
	public static final int ovrMaxLayerCount = 16;

	/** Layer is disabled. */
	public static final int ovrLayerType_Disabled = 0;

	/** Described by {@link OVRLayerEyeFov}. */
	public static final int ovrLayerType_EyeFov = 1;

	/** Described by {@link OVRLayerQuad}. */
	public static final int ovrLayerType_Quad = 3;

	/** Described by {@link OVRLayerEyeMatrix}. */
	public static final int ovrLayerType_EyeMatrix = 5;

	/**
	 * Enables 4x anisotropic sampling during the composition of the layer. The benefits are mostly visible at the periphery for high-frequency &amp;
	 * high-contrast visuals. For best results consider combining this flag with an {@code ovrTextureSwapChain} that has mipmaps and instead of using
	 * arbitrary sized textures, prefer texture sizes that are powers-of-two. Actual rendered viewport and doesn't necessarily have to fill the whole
	 * texture.
	 */
	public static final int ovrLayerFlag_HighQuality = 0x1;

	/** the opposite is TopLeft. Generally this is false for D3D, true for OpenGL. */
	public static final int ovrLayerFlag_TextureOriginAtBottomLeft = 0x2;

	/**
	 * Mark this surface as "headlocked", which means it is specified relative to the HMD and moves with it, rather than being specified relative to
	 * sensor/torso space and remaining still while the head moves. What used to be {@code ovrLayerType_QuadHeadLocked} is now {@link #ovrLayerType_Quad LayerType_Quad} plus this
	 * flag. However the flag can be applied to any layer type to achieve a similar effect.
	 */
	public static final int ovrLayerFlag_HeadLocked = 0x4;

	/** Turns off the performance HUD */
	public static final int ovrPerfHud_Off = 0;

	/** Shows performance summary and headroom */
	public static final int ovrPerfHud_PerfSummary = 1;

	/** Shows latency related timing info */
	public static final int ovrPerfHud_LatencyTiming = 2;

	/** Shows render timing info for application */
	public static final int ovrPerfHud_AppRenderTiming = 3;

	/** Shows render timing info for OVR compositor */
	public static final int ovrPerfHud_CompRenderTiming = 4;

	/** Shows SDK & HMD version Info */
	public static final int ovrPerfHud_VersionInfo = 5;

	/** Turns off the layer HUD */
	public static final int ovrLayerHud_Off = 0;

	/** Shows info about a specific layer */
	public static final int ovrLayerHud_Info = 1;

	/** Visual properties of the stereo guide. */
	public static final int
		ovrDebugHudStereo_Off                 = 0,
		ovrDebugHudStereo_Quad                = 1,
		ovrDebugHudStereo_QuadWithCrosshair   = 2,
		ovrDebugHudStereo_CrosshairAtInfinity = 3;

	static { Library.initialize(); }

	protected OVR() {
		throw new UnsupportedOperationException();
	}

	// --- [ ovr_Initialize ] ---

	/**
	 * Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} and {@link OVRUtil#ovr_Detect _Detect}, can be called unless {@link #ovr_Initialize Initialize} succeeds. A successful call to {@code ovr_Initialize} must be eventually
	 * followed by a call to {@link #ovr_Shutdown Shutdown}. {@code ovr_Initialize} calls are idempotent. Calling {@code ovr_Initialize} twice does not require two matching
	 * calls to {@code ovr_Shutdown}. If already initialized, the return value is {@link OVRErrorCode#ovrSuccess Success}.
	 * 
	 * <p>LibOVRRT shared library search order:</p>
	 * 
	 * <ol>
	 * <li>Current working directory (often the same as the application directory).</li>
	 * <li>Module directory (usually the same as the application directory, but not if the module is a separate shared library).</li>
	 * <li>Application directory</li>
	 * <li>Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).</li>
	 * <li>Standard OS shared library search location(s) (OS-specific).</li>
	 * </ol>
	 *
	 * @param params an {@link OVRInitParams} struct that cpecifies custom initialization options. May be {@code NULL} to indicate default options.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information. Example failed results
	 *         include:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrError_Initialize Error_Initialize}: Generic initialization error.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibLoad Error_LibLoad}: Couldn't load LibOVRRT.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibVersion Error_LibVersion}: LibOVRRT version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceConnection Error_ServiceConnection}: Couldn't connect to the OVR Service.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceVersion Error_ServiceVersion}: OVR Service version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_IncompatibleOS Error_IncompatibleOS}: The operating system version is incompatible.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayInit Error_DisplayInit}: Unable to initialize the HMD display.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServerStart Error_ServerStart}:  Unable to start the server. Is it already running?</li>
	 *         <li>{@link OVRErrorCode#ovrError_Reinitialization Error_Reinitialization}: Attempted to re-initialize with a different version.</li>
	 *         </ul>
	 */
	public static native int novr_Initialize(long params);

	/**
	 * Initialize LibOVR for application usage. This includes finding and loading the LibOVRRT shared library. No LibOVR API functions, other than
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} and {@link OVRUtil#ovr_Detect _Detect}, can be called unless {@link #ovr_Initialize Initialize} succeeds. A successful call to {@code ovr_Initialize} must be eventually
	 * followed by a call to {@link #ovr_Shutdown Shutdown}. {@code ovr_Initialize} calls are idempotent. Calling {@code ovr_Initialize} twice does not require two matching
	 * calls to {@code ovr_Shutdown}. If already initialized, the return value is {@link OVRErrorCode#ovrSuccess Success}.
	 * 
	 * <p>LibOVRRT shared library search order:</p>
	 * 
	 * <ol>
	 * <li>Current working directory (often the same as the application directory).</li>
	 * <li>Module directory (usually the same as the application directory, but not if the module is a separate shared library).</li>
	 * <li>Application directory</li>
	 * <li>Development directory (only if OVR_ENABLE_DEVELOPER_SEARCH is enabled, which is off by default).</li>
	 * <li>Standard OS shared library search location(s) (OS-specific).</li>
	 * </ol>
	 *
	 * @param params an {@link OVRInitParams} struct that cpecifies custom initialization options. May be {@code NULL} to indicate default options.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link #ovr_GetLastErrorInfo GetLastErrorInfo} to get more information. Example failed results
	 *         include:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrError_Initialize Error_Initialize}: Generic initialization error.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibLoad Error_LibLoad}: Couldn't load LibOVRRT.</li>
	 *         <li>{@link OVRErrorCode#ovrError_LibVersion Error_LibVersion}: LibOVRRT version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceConnection Error_ServiceConnection}: Couldn't connect to the OVR Service.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServiceVersion Error_ServiceVersion}: OVR Service version incompatibility.</li>
	 *         <li>{@link OVRErrorCode#ovrError_IncompatibleOS Error_IncompatibleOS}: The operating system version is incompatible.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayInit Error_DisplayInit}: Unable to initialize the HMD display.</li>
	 *         <li>{@link OVRErrorCode#ovrError_ServerStart Error_ServerStart}:  Unable to start the server. Is it already running?</li>
	 *         <li>{@link OVRErrorCode#ovrError_Reinitialization Error_Reinitialization}: Attempted to re-initialize with a different version.</li>
	 *         </ul>
	 */
	public static int ovr_Initialize(OVRInitParams params) {
		return novr_Initialize(params == null ? NULL : params.address());
	}

	// --- [ ovr_Shutdown ] ---

	/**
	 * Shuts down LibOVR.
	 * 
	 * <p>A successful call to {@link #ovr_Initialize Initialize} must be eventually matched by a call to {@code ovr_Shutdown}. After calling {@code ovr_Shutdown}, no LibOVR
	 * functions can be called except {@link #ovr_GetLastErrorInfo GetLastErrorInfo} or another {@link #ovr_Initialize Initialize}. {@code ovr_Shutdown} invalidates all pointers, references, and created
	 * objects previously returned by LibOVR functions. The LibOVRRT shared library can be unloaded by {@code ovr_Shutdown}.</p>
	 */
	public static native void ovr_Shutdown();

	// --- [ ovr_GetLastErrorInfo ] ---

	/**
	 * Returns information about the most recent failed return value by the current thread for this library.
	 * 
	 * <p>This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	 * call to determine if there was an error in the last API call as successful API calls don't clear the last {@link OVRErrorInfo}. To avoid any inconsistency,
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
	 * the interim.</p>
	 *
	 * @param errorInfo The last {@link OVRErrorInfo} for the current thread
	 */
	public static native void novr_GetLastErrorInfo(long errorInfo);

	/**
	 * Returns information about the most recent failed return value by the current thread for this library.
	 * 
	 * <p>This function itself can never generate an error. The last error is never cleared by LibOVR, but will be overwritten by new errors. Do not use this
	 * call to determine if there was an error in the last API call as successful API calls don't clear the last {@link OVRErrorInfo}. To avoid any inconsistency,
	 * {@link #ovr_GetLastErrorInfo GetLastErrorInfo} should be called immediately after an API function that returned a failed {@code ovrResult}, with no other API functions called in
	 * the interim.</p>
	 *
	 * @param errorInfo The last {@link OVRErrorInfo} for the current thread
	 */
	public static void ovr_GetLastErrorInfo(OVRErrorInfo errorInfo) {
		novr_GetLastErrorInfo(errorInfo.address());
	}

	// --- [ ovr_GetVersionString ] ---

	/**
	 * Returns the version string representing the LibOVRRT version.
	 * 
	 * <p>The returned string pointer is valid until the next call to {@link #ovr_Shutdown Shutdown}.</p>
	 * 
	 * <p>Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
	 * shared library version and not the locally compiled interface version.</p>
	 * 
	 * <p>The format of this string is subject to change in future versions and its contents should not be interpreted.</p>
	 *
	 * @return a UTF8-encoded null-terminated version string
	 */
	public static native long novr_GetVersionString();

	/**
	 * Returns the version string representing the LibOVRRT version.
	 * 
	 * <p>The returned string pointer is valid until the next call to {@link #ovr_Shutdown Shutdown}.</p>
	 * 
	 * <p>Note that the returned version string doesn't necessarily match the current OVR_MAJOR_VERSION, etc., as the returned string refers to the LibOVRRT
	 * shared library version and not the locally compiled interface version.</p>
	 * 
	 * <p>The format of this string is subject to change in future versions and its contents should not be interpreted.</p>
	 *
	 * @return a UTF8-encoded null-terminated version string
	 */
	public static String ovr_GetVersionString() {
		long __result = novr_GetVersionString();
		return memUTF8(__result);
	}

	// --- [ ovr_TraceMessage ] ---

	/**
	 * Writes a message string to the LibOVR tracing mechanism (if enabled).
	 * 
	 * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
	 *
	 * @param level   an {@code ovrLogLevel} constant. One of:<br><table><tr><td>{@link #ovrLogLevel_Debug LogLevel_Debug}</td><td>{@link #ovrLogLevel_Info LogLevel_Info}</td><td>{@link #ovrLogLevel_Error LogLevel_Error}</td></tr></table>
	 * @param message a UTF8-encoded null-terminated string
	 *
	 * @return the {@code strlen} of the message or a negative value if the message is too large
	 */
	public static native long novr_TraceMessage(int level, long message);

	/**
	 * Writes a message string to the LibOVR tracing mechanism (if enabled).
	 * 
	 * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
	 *
	 * @param level   an {@code ovrLogLevel} constant. One of:<br><table><tr><td>{@link #ovrLogLevel_Debug LogLevel_Debug}</td><td>{@link #ovrLogLevel_Info LogLevel_Info}</td><td>{@link #ovrLogLevel_Error LogLevel_Error}</td></tr></table>
	 * @param message a UTF8-encoded null-terminated string
	 *
	 * @return the {@code strlen} of the message or a negative value if the message is too large
	 */
	public static String ovr_TraceMessage(int level, ByteBuffer message) {
		if ( CHECKS )
			checkNT1(message);
		long __result = novr_TraceMessage(level, memAddress(message));
		return memUTF8(__result);
	}

	/**
	 * Writes a message string to the LibOVR tracing mechanism (if enabled).
	 * 
	 * <p>This message will be passed back to the application via the {@link OVRLogCallback} if it was registered.</p>
	 *
	 * @param level   an {@code ovrLogLevel} constant. One of:<br><table><tr><td>{@link #ovrLogLevel_Debug LogLevel_Debug}</td><td>{@link #ovrLogLevel_Info LogLevel_Info}</td><td>{@link #ovrLogLevel_Error LogLevel_Error}</td></tr></table>
	 * @param message a UTF8-encoded null-terminated string
	 *
	 * @return the {@code strlen} of the message or a negative value if the message is too large
	 */
	public static String ovr_TraceMessage(int level, CharSequence message) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer messageEncoded = stack.UTF8(message);
			long __result = novr_TraceMessage(level, memAddress(messageEncoded));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetHmdDesc ] ---

	/**
	 * Returns information about the current HMD.
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise ovrHmdDesc::Type will be reported as {@link #ovrHmd_None Hmd_None}.</p>
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}, else {@code NULL} in which case this function detects whether an HMD is present and returns its
	 *                 info if so.
	 * @param __result an {@link OVRHmdDesc}. If the {@code hmd} is {@code NULL} and ovrHmdDesc::Type is {@link #ovrHmd_None Hmd_None} then no HMD is present.
	 */
	public static native void novr_GetHmdDesc(long session, long __result);

	/**
	 * Returns information about the current HMD.
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise ovrHmdDesc::Type will be reported as {@link #ovrHmd_None Hmd_None}.</p>
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}, else {@code NULL} in which case this function detects whether an HMD is present and returns its
	 *                 info if so.
	 * @param __result an {@link OVRHmdDesc}. If the {@code hmd} is {@code NULL} and ovrHmdDesc::Type is {@link #ovrHmd_None Hmd_None} then no HMD is present.
	 */
	public static OVRHmdDesc ovr_GetHmdDesc(long session, OVRHmdDesc __result) {
		novr_GetHmdDesc(session, __result.address());
		return __result;
	}

	// --- [ ovr_GetTrackerCount ] ---

	/**
	 * Returns the number of sensors.
	 * 
	 * <p>The number of sensors may change at any time, so this function should be called before use as opposed to once on startup.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native int novr_GetTrackerCount(long session);

	/**
	 * Returns the number of sensors.
	 * 
	 * <p>The number of sensors may change at any time, so this function should be called before use as opposed to once on startup.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static int ovr_GetTrackerCount(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetTrackerCount(session);
	}

	// --- [ ovr_GetTrackerDesc ] ---

	/**
	 * Returns a given sensor description.
	 * 
	 * <p>It's possible that sensor {@code desc [0]} may indicate a unconnnected or non-pose tracked sensor, but sensor {@code desc [1]} may be connected.</p>
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise the returned {@code trackerDescArray} will be zero-initialized. The
	 * data returned by this function can change at runtime.</p>
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerDescIndex a sensor index. The valid indexes are in the range of 0 to the sensor count returned by {@link #ovr_GetTrackerCount GetTrackerCount}.
	 * @param __result         an {@link OVRTrackerDesc}. An empty {@code OVRTrackerDesc} will be returned if {@code trackerDescIndex} is out of range.
	 */
	public static native void novr_GetTrackerDesc(long session, int trackerDescIndex, long __result);

	/**
	 * Returns a given sensor description.
	 * 
	 * <p>It's possible that sensor {@code desc [0]} may indicate a unconnnected or non-pose tracked sensor, but sensor {@code desc [1]} may be connected.</p>
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise the returned {@code trackerDescArray} will be zero-initialized. The
	 * data returned by this function can change at runtime.</p>
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerDescIndex a sensor index. The valid indexes are in the range of 0 to the sensor count returned by {@link #ovr_GetTrackerCount GetTrackerCount}.
	 * @param __result         an {@link OVRTrackerDesc}. An empty {@code OVRTrackerDesc} will be returned if {@code trackerDescIndex} is out of range.
	 */
	public static OVRTrackerDesc ovr_GetTrackerDesc(long session, int trackerDescIndex, OVRTrackerDesc __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackerDesc(session, trackerDescIndex, __result.address());
		return __result;
	}

	// --- [ ovr_Create ] ---

	/**
	 * Creates a handle to a VR session.
	 * 
	 * <p>Upon success the returned {@code ovrSession} must be eventually freed with {@link #ovr_Destroy Destroy} when it is no longer needed. A second call to {@link #ovr_Create Create} will result
	 * in an error return value if the previous {@code Hmd} has not been destroyed.</p>
	 *
	 * @param pSession a pointer to an {@code ovrSession} which will be written to upon success
	 * @param luid     a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
	 *                 application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
	 *                 the default adapter will not run reliably on multi-adapter systems.
	 *
	 * @return an {@code ovrResult} indicating success or failure. Upon failure the returned {@code pHmd} will be {@code NULL}.
	 */
	public static native int novr_Create(long pSession, long luid);

	/**
	 * Creates a handle to a VR session.
	 * 
	 * <p>Upon success the returned {@code ovrSession} must be eventually freed with {@link #ovr_Destroy Destroy} when it is no longer needed. A second call to {@link #ovr_Create Create} will result
	 * in an error return value if the previous {@code Hmd} has not been destroyed.</p>
	 *
	 * @param pSession a pointer to an {@code ovrSession} which will be written to upon success
	 * @param luid     a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
	 *                 application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
	 *                 the default adapter will not run reliably on multi-adapter systems.
	 *
	 * @return an {@code ovrResult} indicating success or failure. Upon failure the returned {@code pHmd} will be {@code NULL}.
	 */
	public static int ovr_Create(PointerBuffer pSession, OVRGraphicsLuid luid) {
		if ( CHECKS )
			checkBuffer(pSession, 1);
		return novr_Create(memAddress(pSession), luid.address());
	}

	// --- [ ovr_Destroy ] ---

	/**
	 * Destroys the HMD.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native void novr_Destroy(long session);

	/**
	 * Destroys the HMD.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_Destroy(long session) {
		if ( CHECKS )
			checkPointer(session);
		novr_Destroy(session);
	}

	// --- [ ovr_GetSessionStatus ] ---

	/**
	 * Returns status information for the application.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param sessionStatus an {@link OVRSessionStatus} that is filled in
	 */
	public static native int novr_GetSessionStatus(long session, long sessionStatus);

	/**
	 * Returns status information for the application.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param sessionStatus an {@link OVRSessionStatus} that is filled in
	 */
	public static int ovr_GetSessionStatus(long session, OVRSessionStatus sessionStatus) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetSessionStatus(session, sessionStatus.address());
	}

	// --- [ ovr_SetTrackingOriginType ] ---

	/**
	 * Sets the tracking origin type.
	 * 
	 * <p>When the tracking origin is changed, all of the calls that either provide or accept ovrPosef will use the new tracking origin provided.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param origin  an {@code ovrTrackingOrigin} to be used for all {@link OVRPosef}
	 */
	public static native int novr_SetTrackingOriginType(long session, int origin);

	/**
	 * Sets the tracking origin type.
	 * 
	 * <p>When the tracking origin is changed, all of the calls that either provide or accept ovrPosef will use the new tracking origin provided.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param origin  an {@code ovrTrackingOrigin} to be used for all {@link OVRPosef}
	 */
	public static int ovr_SetTrackingOriginType(long session, int origin) {
		if ( CHECKS )
			checkPointer(session);
		return novr_SetTrackingOriginType(session, origin);
	}

	// --- [ ovr_GetTrackingOriginType ] ---

	/**
	 * Gets the tracking origin state.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native int novr_GetTrackingOriginType(long session);

	/**
	 * Gets the tracking origin state.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static int ovr_GetTrackingOriginType(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetTrackingOriginType(session);
	}

	// --- [ ovr_RecenterTrackingOrigin ] ---

	/**
	 * Re-centers the sensor position and orientation.
	 * 
	 * <p>This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
	 * gravity and cannot be redefined. All future tracking will report values relative to this new reference position. If you are using {@link OVRTrackerPose} then
	 * you will need to call {@link #ovr_GetTrackerPose GetTrackerPose} after this, because the sensor position(s) will change as a result of this.</p>
	 * 
	 * <p>The headset cannot be facing vertically upward or downward but rather must be roughly level otherwise this function will fail with
	 * {@link OVRErrorCode#ovrError_InvalidHeadsetOrientation Error_InvalidHeadsetOrientation}.</p>
	 * 
	 * <p>For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
	 * current {@code ovrTrackingOrigin} setting.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native int novr_RecenterTrackingOrigin(long session);

	/**
	 * Re-centers the sensor position and orientation.
	 * 
	 * <p>This resets the (x,y,z) positional components and the yaw orientation component. The Roll and pitch orientation components are always determined by
	 * gravity and cannot be redefined. All future tracking will report values relative to this new reference position. If you are using {@link OVRTrackerPose} then
	 * you will need to call {@link #ovr_GetTrackerPose GetTrackerPose} after this, because the sensor position(s) will change as a result of this.</p>
	 * 
	 * <p>The headset cannot be facing vertically upward or downward but rather must be roughly level otherwise this function will fail with
	 * {@link OVRErrorCode#ovrError_InvalidHeadsetOrientation Error_InvalidHeadsetOrientation}.</p>
	 * 
	 * <p>For more info, see the notes on each {@code ovrTrackingOrigin} enumeration to understand how recenter will vary slightly in its behavior based on the
	 * current {@code ovrTrackingOrigin} setting.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static int ovr_RecenterTrackingOrigin(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_RecenterTrackingOrigin(session);
	}

	// --- [ ovr_ClearShouldRecenterFlag ] ---

	/**
	 * Clears the ShouldRecenter status bit in ovrSessionStatus.
	 * 
	 * <p>Clears the {@code ShouldRecenter} status bit in {@link OVRSessionStatus}, allowing further recenter requests to be detected. Since this is automatically done
	 * by {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin}, this is only needs to be called when application is doing its own re-centering.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native void novr_ClearShouldRecenterFlag(long session);

	/**
	 * Clears the ShouldRecenter status bit in ovrSessionStatus.
	 * 
	 * <p>Clears the {@code ShouldRecenter} status bit in {@link OVRSessionStatus}, allowing further recenter requests to be detected. Since this is automatically done
	 * by {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin}, this is only needs to be called when application is doing its own re-centering.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_ClearShouldRecenterFlag(long session) {
		if ( CHECKS )
			checkPointer(session);
		novr_ClearShouldRecenterFlag(session);
	}

	// --- [ ovr_GetTrackingState ] ---

	/**
	 * Returns tracking state reading based on the specified absolute system time.
	 * 
	 * <p>Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
	 * have the same value.</p>
	 * 
	 * <p>This may also be used for more refined timing of front buffer rendering logic, and so on.</p>
	 * 
	 * <p>This may be called by multiple threads.</p>
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param absTime       the absolute future time to predict the return {@link OVRTrackingState} value. Use 0 to request the most recent tracking state.
	 * @param latencyMarker specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
	 *                      "SensorSampleTimestamp", that will override the value stored here.
	 * @param __result      the {@link OVRTrackingState} that is predicted for the given {@code absTime}
	 */
	public static native void novr_GetTrackingState(long session, double absTime, boolean latencyMarker, long __result);

	/**
	 * Returns tracking state reading based on the specified absolute system time.
	 * 
	 * <p>Pass an {@code absTime} value of 0.0 to request the most recent sensor reading. In this case both {@code PredictedPose} and {@code SamplePose} will
	 * have the same value.</p>
	 * 
	 * <p>This may also be used for more refined timing of front buffer rendering logic, and so on.</p>
	 * 
	 * <p>This may be called by multiple threads.</p>
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param absTime       the absolute future time to predict the return {@link OVRTrackingState} value. Use 0 to request the most recent tracking state.
	 * @param latencyMarker specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
	 *                      "SensorSampleTimestamp", that will override the value stored here.
	 * @param __result      the {@link OVRTrackingState} that is predicted for the given {@code absTime}
	 */
	public static OVRTrackingState ovr_GetTrackingState(long session, double absTime, boolean latencyMarker, OVRTrackingState __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackingState(session, absTime, latencyMarker, __result.address());
		return __result;
	}

	// --- [ ovr_GetTrackerPose ] ---

	/**
	 * Returns the {@link OVRTrackerPose} for the given sensor.
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerPoseIndex index of the sensor being requested.
	 */
	public static native void novr_GetTrackerPose(long session, int trackerPoseIndex, long __result);

	/**
	 * Returns the {@link OVRTrackerPose} for the given sensor.
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerPoseIndex index of the sensor being requested.
	 */
	public static OVRTrackerPose ovr_GetTrackerPose(long session, int trackerPoseIndex, OVRTrackerPose __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackerPose(session, trackerPoseIndex, __result.address());
		return __result;
	}

	// --- [ ovr_GetInputState ] ---

	/**
	 * Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
	 * checking the {@code PacketNumber}.
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType which controllers the input will be returned for
	 * @param inputState     the input state that will be filled in
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} if the new state was successfully obtained
	 */
	public static native int novr_GetInputState(long session, int controllerType, long inputState);

	/**
	 * Returns the most recent input state for controllers, without positional tracking info. Developers can tell whether the same state was returned by
	 * checking the {@code PacketNumber}.
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType which controllers the input will be returned for
	 * @param inputState     the input state that will be filled in
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} if the new state was successfully obtained
	 */
	public static int ovr_GetInputState(long session, int controllerType, OVRInputState inputState) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetInputState(session, controllerType, inputState.address());
	}

	// --- [ ovr_GetConnectedControllerTypes ] ---

	/**
	 * Returns controller types connected to the system OR'ed together.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static native int novr_GetConnectedControllerTypes(long session);

	/**
	 * Returns controller types connected to the system OR'ed together.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static int ovr_GetConnectedControllerTypes(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetConnectedControllerTypes(session);
	}

	// --- [ ovr_SetControllerVibration ] ---

	/**
	 * Turns on vibration of the given controller.
	 * 
	 * <p>To disable vibration, call {@link #ovr_SetControllerVibration SetControllerVibration} with an amplitude of 0. Vibration automatically stops after a nominal amount of time, so if you
	 * want vibration to be continuous over multiple seconds then you need to call this function periodically.</p>
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller to apply the vibration to
	 * @param frequency      a vibration frequency in the range of 0.0 to 1.0. Currently the only valid values are 0.0, 0.5, and 1.0 and other values will be clamped to one of
	 *                       these.
	 * @param amplitude      a vibration amplitude in the range of 0.0 to 1.0.
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static native int novr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude);

	/**
	 * Turns on vibration of the given controller.
	 * 
	 * <p>To disable vibration, call {@link #ovr_SetControllerVibration SetControllerVibration} with an amplitude of 0. Vibration automatically stops after a nominal amount of time, so if you
	 * want vibration to be continuous over multiple seconds then you need to call this function periodically.</p>
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller to apply the vibration to
	 * @param frequency      a vibration frequency in the range of 0.0 to 1.0. Currently the only valid values are 0.0, 0.5, and 1.0 and other values will be clamped to one of
	 *                       these.
	 * @param amplitude      a vibration amplitude in the range of 0.0 to 1.0.
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static int ovr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude) {
		if ( CHECKS )
			checkPointer(session);
		return novr_SetControllerVibration(session, controllerType, frequency, amplitude);
	}

	// --- [ ovr_GetTextureSwapChainLength ] ---

	/**
	 * Gets the number of buffers in an {@code ovrTextureSwapChain}.
	 *
	 * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain      the {@code ovrTextureSwapChain} for which the length should be retrieved
	 * @param out_Length returns the number of buffers in the specified chain
	 */
	public static native int novr_GetTextureSwapChainLength(long session, long chain, long out_Length);

	/**
	 * Gets the number of buffers in an {@code ovrTextureSwapChain}.
	 *
	 * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain      the {@code ovrTextureSwapChain} for which the length should be retrieved
	 * @param out_Length returns the number of buffers in the specified chain
	 */
	public static int ovr_GetTextureSwapChainLength(long session, long chain, IntBuffer out_Length) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_Length, 1);
		}
		return novr_GetTextureSwapChainLength(session, chain, memAddress(out_Length));
	}

	// --- [ ovr_GetTextureSwapChainCurrentIndex ] ---

	/**
	 * Gets the current index in an {@code ovrTextureSwapChain}.
	 *
	 * @param session   an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain     the {@code ovrTextureSwapChain} for which the index should be retrieved
	 * @param out_Index returns the current (free) index in specified chain
	 */
	public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, long out_Index);

	/**
	 * Gets the current index in an {@code ovrTextureSwapChain}.
	 *
	 * @param session   an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain     the {@code ovrTextureSwapChain} for which the index should be retrieved
	 * @param out_Index returns the current (free) index in specified chain
	 */
	public static int ovr_GetTextureSwapChainCurrentIndex(long session, long chain, IntBuffer out_Index) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_Index, 1);
		}
		return novr_GetTextureSwapChainCurrentIndex(session, chain, memAddress(out_Index));
	}

	// --- [ ovr_GetTextureSwapChainDesc ] ---

	/**
	 * Gets the description of the buffers in an {@code ovrTextureSwapChain}.
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain    the {@code ovrTextureSwapChain} for which the description should be retrieved
	 * @param out_Desc returns the description of the specified chain
	 */
	public static native int novr_GetTextureSwapChainDesc(long session, long chain, long out_Desc);

	/**
	 * Gets the description of the buffers in an {@code ovrTextureSwapChain}.
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain    the {@code ovrTextureSwapChain} for which the description should be retrieved
	 * @param out_Desc returns the description of the specified chain
	 */
	public static int ovr_GetTextureSwapChainDesc(long session, long chain, OVRTextureSwapChainDesc out_Desc) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
		}
		return novr_GetTextureSwapChainDesc(session, chain, out_Desc.address());
	}

	// --- [ ovr_CommitTextureSwapChain ] ---

	/**
	 * Commits any pending changes to an {@code ovrTextureSwapChain}, and advances its current index.
	 * 
	 * <p>When Commit is called, the texture at the current index is considered ready for use by the runtime, and further writes to it should be avoided. The
	 * swap chain's current index is advanced, providing there's room in the chain. The next time the SDK dereferences this texture swap chain, it will
	 * synchronize with the app's graphics context and pick up the submitted index, opening up room in the swap chain for further commits.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain   the {@code ovrTextureSwapChain} to commit
	 */
	public static native int novr_CommitTextureSwapChain(long session, long chain);

	/**
	 * Commits any pending changes to an {@code ovrTextureSwapChain}, and advances its current index.
	 * 
	 * <p>When Commit is called, the texture at the current index is considered ready for use by the runtime, and further writes to it should be avoided. The
	 * swap chain's current index is advanced, providing there's room in the chain. The next time the SDK dereferences this texture swap chain, it will
	 * synchronize with the app's graphics context and pick up the submitted index, opening up room in the swap chain for further commits.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain   the {@code ovrTextureSwapChain} to commit
	 */
	public static int ovr_CommitTextureSwapChain(long session, long chain) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
		}
		return novr_CommitTextureSwapChain(session, chain);
	}

	// --- [ ovr_DestroyTextureSwapChain ] ---

	/**
	 * Destroys an {@code ovrTextureSwapChain} and frees all the resources associated with it.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain   the {@code ovrTextureSwapChain} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static native void novr_DestroyTextureSwapChain(long session, long chain);

	/**
	 * Destroys an {@code ovrTextureSwapChain} and frees all the resources associated with it.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param chain   the {@code ovrTextureSwapChain} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static void ovr_DestroyTextureSwapChain(long session, long chain) {
		if ( CHECKS )
			checkPointer(session);
		novr_DestroyTextureSwapChain(session, chain);
	}

	// --- [ ovr_DestroyMirrorTexture ] ---

	/**
	 * Destroys a mirror texture previously created by one of the mirror texture creation functions.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param mirrorTexture the {@code ovrTexture} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static native void novr_DestroyMirrorTexture(long session, long mirrorTexture);

	/**
	 * Destroys a mirror texture previously created by one of the mirror texture creation functions.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param mirrorTexture the {@code ovrTexture} to destroy. If it is {@code NULL} then this function has no effect.
	 */
	public static void ovr_DestroyMirrorTexture(long session, long mirrorTexture) {
		if ( CHECKS )
			checkPointer(session);
		novr_DestroyMirrorTexture(session, mirrorTexture);
	}

	// --- [ ovr_GetFovTextureSize ] ---

	/**
	 * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.
	 * 
	 * <p>Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
	 * are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.</p>
	 * 
	 * <p>Example code:</p>
	 * 
	 * <pre><code>ovrHmdDesc hmdDesc = ovr_GetHmdDesc(session);
ovrSizei eyeSizeLeft  = ovr_GetFovTextureSize(session, ovrEye_Left,  hmdDesc.DefaultEyeFov[ovrEye_Left],  1.0f);
ovrSizei eyeSizeRight = ovr_GetFovTextureSize(session, ovrEye_Right, hmdDesc.DefaultEyeFov[ovrEye_Right], 1.0f);</code></pre>
	 *
	 * @param session               an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param eye                   which eye (left or right) to calculate for. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
	 * @param fov                   the {@link OVRFovPort} to use
	 * @param pixelsPerDisplayPixel the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
	 *                              performance, higher values give improved quality.
	 * @param __result              the texture width and height size
	 */
	public static native void novr_GetFovTextureSize(long session, int eye, long fov, float pixelsPerDisplayPixel, long __result);

	/**
	 * Calculates the recommended viewport size for rendering a given eye within the HMD with a given FOV cone.
	 * 
	 * <p>Higher FOV will generally require larger textures to maintain quality. Apps packing multiple eye views together on the same texture should ensure there
	 * are at least 8 pixels of padding between them to prevent texture filtering and chromatic aberration causing images to leak between the two eye views.</p>
	 * 
	 * <p>Example code:</p>
	 * 
	 * <pre><code>ovrHmdDesc hmdDesc = ovr_GetHmdDesc(session);
ovrSizei eyeSizeLeft  = ovr_GetFovTextureSize(session, ovrEye_Left,  hmdDesc.DefaultEyeFov[ovrEye_Left],  1.0f);
ovrSizei eyeSizeRight = ovr_GetFovTextureSize(session, ovrEye_Right, hmdDesc.DefaultEyeFov[ovrEye_Right], 1.0f);</code></pre>
	 *
	 * @param session               an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param eye                   which eye (left or right) to calculate for. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
	 * @param fov                   the {@link OVRFovPort} to use
	 * @param pixelsPerDisplayPixel the ratio of the number of render target pixels to display pixels at the center of distortion. 1.0 is the default value. Lower values can improve
	 *                              performance, higher values give improved quality.
	 * @param __result              the texture width and height size
	 */
	public static OVRSizei ovr_GetFovTextureSize(long session, int eye, OVRFovPort fov, float pixelsPerDisplayPixel, OVRSizei __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetFovTextureSize(session, eye, fov.address(), pixelsPerDisplayPixel, __result.address());
		return __result;
	}

	// --- [ ovr_GetRenderDesc ] ---

	/**
	 * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param eyeType  which eye (left or right) for which to perform calculations. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
	 * @param fov      the {@link OVRFovPort} to use.
	 * @param __result the computed {@link OVREyeRenderDesc} for the given {@code eyeType} and field of view
	 */
	public static native void novr_GetRenderDesc(long session, int eyeType, long fov, long __result);

	/**
	 * Computes the distortion viewport, view adjust, and other rendering parameters for the specified eye.
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param eyeType  which eye (left or right) for which to perform calculations. One of:<br><table><tr><td>{@link #ovrEye_Left Eye_Left}</td><td>{@link #ovrEye_Right Eye_Right}</td></tr></table>
	 * @param fov      the {@link OVRFovPort} to use.
	 * @param __result the computed {@link OVREyeRenderDesc} for the given {@code eyeType} and field of view
	 */
	public static OVREyeRenderDesc ovr_GetRenderDesc(long session, int eyeType, OVRFovPort fov, OVREyeRenderDesc __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetRenderDesc(session, eyeType, fov.address(), __result.address());
		return __result;
	}

	// --- [ ovr_SubmitFrame ] ---

	/**
	 * Submits layers for distortion and display.
	 * 
	 * <p>{@code ovr_SubmitFrame} triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	 * queue and surfaces are available. Distortion might or might not have completed.</p>
	 * 
	 * <ul>
	 * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
	 * <li>Layers are not remembered between successive calls to {@code ovr_SubmitFrame}. A layer must be specified in every call to {@code ovr_SubmitFrame}
	 * or it won't be displayed.</li>
	 * <li>If a {@code layerPtrList} entry that was specified in a previous call to {@code ovr_SubmitFrame} is passed as {@code NULL} or is of type
	 * {@link #ovrLayerType_Disabled LayerType_Disabled}, that layer is no longer displayed.</li>
	 * <li>A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
	 * duplicated (i.e. the same pointer as an earlier entry).</li>
	 * </ul>
	 * 
	 * <h3>Example code</h3>
	 * 
	 * <pre><code>ovrLayerEyeFov  layer0;
ovrLayerQuad    layer1;
...
ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
ovrResult result = ovr_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);</code></pre>
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex    the targeted application frame index, or 0 to refer to one frame after the last time {@link #ovr_SubmitFrame SubmitFrame} was called
	 * @param viewScaleDesc provides additional information needed only if {@code layerPtrList} contains an {@link #ovrLayerType_Quad LayerType_Quad}. If {@code NULL}, a default version is used based on the
	 *                      current configuration and a 1.0 world scale.
	 * @param layerPtrList  a list of {@code ovrLayer} pointers, which can include {@code NULL} entries to indicate that any previously shown layer at that index is to not be
	 *                      displayed. Each layer header must be a part of a layer structure such as {@link OVRLayerEyeFov} or {@link OVRLayerQuad}, with {@code Header.Type} identifying
	 *                      its type. A {@code NULL} {@code layerPtrList} entry in the array indicates the absence of the given layer.
	 * @param layerCount    the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
	 *                      a future version.
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: rendering completed successfully.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}: rendering completed successfully but was not displayed on the HMD, usually because another application currently
	 *         has ownership of the HMD. Applications receiving this result should stop rendering new content, but continue to call {@code ovr_SubmitFrame}
	 *         periodically until it returns a value other than {@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
	 *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
	 *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
	 *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
	 *         <li>{@link OVRErrorCode#ovrError_TextureSwapChainInvalid Error_TextureSwapChainInvalid}: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure
	 *         {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} was called at least once first.</li>
	 *         </ul>
	 */
	public static native int novr_SubmitFrame(long session, long frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

	/**
	 * Submits layers for distortion and display.
	 * 
	 * <p>{@code ovr_SubmitFrame} triggers distortion and processing which might happen asynchronously. The function will return when there is room in the submission
	 * queue and surfaces are available. Distortion might or might not have completed.</p>
	 * 
	 * <ul>
	 * <li>Layers are drawn in the order they are specified in the array, regardless of the layer type.</li>
	 * <li>Layers are not remembered between successive calls to {@code ovr_SubmitFrame}. A layer must be specified in every call to {@code ovr_SubmitFrame}
	 * or it won't be displayed.</li>
	 * <li>If a {@code layerPtrList} entry that was specified in a previous call to {@code ovr_SubmitFrame} is passed as {@code NULL} or is of type
	 * {@link #ovrLayerType_Disabled LayerType_Disabled}, that layer is no longer displayed.</li>
	 * <li>A {@code layerPtrList} entry can be of any layer type and multiple entries of the same layer type are allowed. No {@code layerPtrList} entry may be
	 * duplicated (i.e. the same pointer as an earlier entry).</li>
	 * </ul>
	 * 
	 * <h3>Example code</h3>
	 * 
	 * <pre><code>ovrLayerEyeFov  layer0;
ovrLayerQuad    layer1;
...
ovrLayerHeader* layers[2] = { &layer0.Header, &layer1.Header };
ovrResult result = ovr_SubmitFrame(hmd, frameIndex, nullptr, layers, 2);</code></pre>
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex    the targeted application frame index, or 0 to refer to one frame after the last time {@link #ovr_SubmitFrame SubmitFrame} was called
	 * @param viewScaleDesc provides additional information needed only if {@code layerPtrList} contains an {@link #ovrLayerType_Quad LayerType_Quad}. If {@code NULL}, a default version is used based on the
	 *                      current configuration and a 1.0 world scale.
	 * @param layerPtrList  a list of {@code ovrLayer} pointers, which can include {@code NULL} entries to indicate that any previously shown layer at that index is to not be
	 *                      displayed. Each layer header must be a part of a layer structure such as {@link OVRLayerEyeFov} or {@link OVRLayerQuad}, with {@code Header.Type} identifying
	 *                      its type. A {@code NULL} {@code layerPtrList} entry in the array indicates the absence of the given layer.
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon one of the possible success values:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: rendering completed successfully.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}: rendering completed successfully but was not displayed on the HMD, usually because another application currently
	 *         has ownership of the HMD. Applications receiving this result should stop rendering new content, but continue to call {@code ovr_SubmitFrame}
	 *         periodically until it returns a value other than {@link OVRErrorCode#ovrSuccess_NotVisible Success_NotVisible}.</li>
	 *         <li>{@link OVRErrorCode#ovrError_DisplayLost Error_DisplayLost}: The session has become invalid (such as due to a device removal) and the shared resources need to be released
	 *         ({@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain}), the session needs to destroyed ({@link #ovr_Destroy Destroy}) and recreated ({@link #ovr_Create Create}), and new resources need to be created
	 *         ({@code ovr_CreateTextureSwapChainXXX}). The application's existing private graphics resources do not need to be recreated unless the new
	 *         {@code ovr_Create} call returns a different {@code GraphicsLuid}.</li>
	 *         <li>{@link OVRErrorCode#ovrError_TextureSwapChainInvalid Error_TextureSwapChainInvalid}: The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure
	 *         {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} was called at least once first.</li>
	 *         </ul>
	 */
	public static int ovr_SubmitFrame(long session, long frameIndex, OVRViewScaleDesc viewScaleDesc, PointerBuffer layerPtrList) {
		if ( CHECKS )
			checkPointer(session);
		return novr_SubmitFrame(session, frameIndex, viewScaleDesc == null ? NULL : viewScaleDesc.address(), memAddress(layerPtrList), layerPtrList.remaining());
	}

	// --- [ ovr_GetPredictedDisplayTime ] ---

	/**
	 * Gets the time of the specified frame midpoint.
	 * 
	 * <p>Predicts the time at which the given frame will be displayed. The predicted time is the middle of the time period during which the corresponding eye
	 * images will be displayed.</p>
	 * 
	 * <p>The application should increment frameIndex for each successively targeted frame, and pass that index to any relevent OVR functions that need to apply
	 * to the frame identified by that index.</p>
	 * 
	 * <p>This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.</p>
	 * 
	 * <p>In the event that prediction fails due to various reasons (e.g. the display being off or app has yet to present any frames), the return value will be
	 * current CPU time.</p>
	 *
	 * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex the frame the caller wishes to target. A value of zero returns the next frame index.
	 *
	 * @return the absolute frame midpoint time for the given {@code frameIndex}
	 */
	public static native double novr_GetPredictedDisplayTime(long session, long frameIndex);

	/**
	 * Gets the time of the specified frame midpoint.
	 * 
	 * <p>Predicts the time at which the given frame will be displayed. The predicted time is the middle of the time period during which the corresponding eye
	 * images will be displayed.</p>
	 * 
	 * <p>The application should increment frameIndex for each successively targeted frame, and pass that index to any relevent OVR functions that need to apply
	 * to the frame identified by that index.</p>
	 * 
	 * <p>This function is thread-safe and allows for multiple application threads to target their processing to the same displayed frame.</p>
	 * 
	 * <p>In the event that prediction fails due to various reasons (e.g. the display being off or app has yet to present any frames), the return value will be
	 * current CPU time.</p>
	 *
	 * @param session    an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param frameIndex the frame the caller wishes to target. A value of zero returns the next frame index.
	 *
	 * @return the absolute frame midpoint time for the given {@code frameIndex}
	 */
	public static double ovr_GetPredictedDisplayTime(long session, long frameIndex) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetPredictedDisplayTime(session, frameIndex);
	}

	// --- [ ovr_GetTimeInSeconds ] ---

	/**
	 * Returns global, absolute high-resolution time in seconds.
	 * 
	 * <p>The time frame of reference for this function is not specified and should not be depended upon.</p>
	 *
	 * @return seconds as a floating point value
	 */
	public static native double ovr_GetTimeInSeconds();

	// --- [ ovr_GetBool ] ---

	/**
	 * Reads a boolean property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid for only the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static native boolean novr_GetBool(long session, long propertyName, boolean defaultVal);

	/**
	 * Reads a boolean property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid for only the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static boolean ovr_GetBool(long session, ByteBuffer propertyName, boolean defaultVal) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_GetBool(session, memAddress(propertyName), defaultVal);
	}

	/**
	 * Reads a boolean property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid for only the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a boolean value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static boolean ovr_GetBool(long session, CharSequence propertyName, boolean defaultVal) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_GetBool(session, memAddress(propertyNameEncoded), defaultVal);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_SetBool ] ---

	/**
	 * Writes or creates a boolean property.
	 * 
	 * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static native boolean novr_SetBool(long session, long propertyName, boolean value);

	/**
	 * Writes or creates a boolean property.
	 * 
	 * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetBool(long session, ByteBuffer propertyName, boolean value) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_SetBool(session, memAddress(propertyName), value);
	}

	/**
	 * Writes or creates a boolean property.
	 * 
	 * <p>If the property wasn't previously a boolean property, it is changed to a boolean property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetBool(long session, CharSequence propertyName, boolean value) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_SetBool(session, memAddress(propertyNameEncoded), value);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetInt ] ---

	/**
	 * Reads an integer property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static native int novr_GetInt(long session, long propertyName, int defaultVal);

	/**
	 * Reads an integer property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static int ovr_GetInt(long session, ByteBuffer propertyName, int defaultVal) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_GetInt(session, memAddress(propertyName), defaultVal);
	}

	/**
	 * Reads an integer property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as an integer value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static int ovr_GetInt(long session, CharSequence propertyName, int defaultVal) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_GetInt(session, memAddress(propertyNameEncoded), defaultVal);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_SetInt ] ---

	/**
	 * Writes or creates an integer property.
	 * 
	 * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static native boolean novr_SetInt(long session, long propertyName, int value);

	/**
	 * Writes or creates an integer property.
	 * 
	 * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetInt(long session, ByteBuffer propertyName, int value) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_SetInt(session, memAddress(propertyName), value);
	}

	/**
	 * Writes or creates an integer property.
	 * 
	 * <p>If the property wasn't previously an integer property, it is changed to an integer property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetInt(long session, CharSequence propertyName, int value) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_SetInt(session, memAddress(propertyNameEncoded), value);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetFloat ] ---

	/**
	 * Reads a float property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static native float novr_GetFloat(long session, long propertyName, float defaultVal);

	/**
	 * Reads a float property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static float ovr_GetFloat(long session, ByteBuffer propertyName, float defaultVal) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_GetFloat(session, memAddress(propertyName), defaultVal);
	}

	/**
	 * Reads a float property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the property interpreted as a float value. Returns {@code defaultVal} if the property doesn't exist.
	 */
	public static float ovr_GetFloat(long session, CharSequence propertyName, float defaultVal) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_GetFloat(session, memAddress(propertyNameEncoded), defaultVal);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_SetFloat ] ---

	/**
	 * Writes or creates a float property.
	 * 
	 * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static native boolean novr_SetFloat(long session, long propertyName, float value);

	/**
	 * Writes or creates a float property.
	 * 
	 * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloat(long session, ByteBuffer propertyName, float value) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_SetFloat(session, memAddress(propertyName), value);
	}

	/**
	 * Writes or creates a float property.
	 * 
	 * <p>If the property wasn't previously a float property, it's changed to a float property.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the value to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloat(long session, CharSequence propertyName, float value) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_SetFloat(session, memAddress(propertyNameEncoded), value);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetFloatArray ] ---

	/**
	 * Reads a float array property.
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName   the name of the property, which needs to be valid only for the call
	 * @param values         an array of float to write to
	 * @param valuesCapacity the maximum number of elements to write to the values array
	 *
	 * @return the number of elements read, or 0 if property doesn't exist or is empty
	 */
	public static native int novr_GetFloatArray(long session, long propertyName, long values, int valuesCapacity);

	/**
	 * Reads a float array property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write to
	 *
	 * @return the number of elements read, or 0 if property doesn't exist or is empty
	 */
	public static int ovr_GetFloatArray(long session, ByteBuffer propertyName, FloatBuffer values) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_GetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/**
	 * Reads a float array property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write to
	 *
	 * @return the number of elements read, or 0 if property doesn't exist or is empty
	 */
	public static int ovr_GetFloatArray(long session, CharSequence propertyName, FloatBuffer values) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_GetFloatArray(session, memAddress(propertyNameEncoded), memAddress(values), values.remaining());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_SetFloatArray ] ---

	/**
	 * Writes or creates a float array property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write from
	 * @param valuesSize   the number of elements to write
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static native boolean novr_SetFloatArray(long session, long propertyName, long values, int valuesSize);

	/**
	 * Writes or creates a float array property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write from
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloatArray(long session, ByteBuffer propertyName, FloatBuffer values) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_SetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
	}

	/**
	 * Writes or creates a float array property.
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param values       an array of float to write from
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetFloatArray(long session, CharSequence propertyName, FloatBuffer values) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_SetFloatArray(session, memAddress(propertyNameEncoded), memAddress(values), values.remaining());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetString ] ---

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
	 */
	public static native long novr_GetString(long session, long propertyName, long defaultVal);

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovr_GetString(long session, ByteBuffer propertyName, ByteBuffer defaultVal) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
			if ( defaultVal != null ) checkNT1(defaultVal);
		}
		long __result = novr_GetString(session, memAddress(propertyName), memAddressSafe(defaultVal));
		return memUTF8(__result);
	}

	/**
	 * Reads a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param defaultVal   specifes the value to return if the property couldn't be read
	 *
	 * @return the string property if it exists. Otherwise returns {@code defaultVal}, which can be specified as {@code NULL}. The return memory is guaranteed to be valid
	 *         until next call to {@code ovr_GetString} or until the HMD is destroyed, whichever occurs first.
	 */
	public static String ovr_GetString(long session, CharSequence propertyName, CharSequence defaultVal) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			ByteBuffer defaultValEncoded = stack.UTF8(defaultVal);
			long __result = novr_GetString(session, memAddress(propertyNameEncoded), memAddressSafe(defaultValEncoded));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_SetString ] ---

	/**
	 * Writes or creates a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmddesc      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the string property, which only needs to be valid for the duration of the call
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static native boolean novr_SetString(long hmddesc, long propertyName, long value);

	/**
	 * Writes or creates a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmddesc      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the string property, which only needs to be valid for the duration of the call
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetString(long hmddesc, ByteBuffer propertyName, ByteBuffer value) {
		if ( CHECKS ) {
			checkPointer(hmddesc);
			checkNT1(propertyName);
			checkNT1(value);
		}
		return novr_SetString(hmddesc, memAddress(propertyName), memAddress(value));
	}

	/**
	 * Writes or creates a string property.
	 * 
	 * <p>Strings are UTF8-encoded and null-terminated.</p>
	 *
	 * @param hmddesc      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param propertyName the name of the property, which needs to be valid only for the call
	 * @param value        the string property, which only needs to be valid for the duration of the call
	 *
	 * @return true if successful, otherwise false. A false result should only occur if the property name is empty or if the property is read-only.
	 */
	public static boolean ovr_SetString(long hmddesc, CharSequence propertyName, CharSequence value) {
		if ( CHECKS )
			checkPointer(hmddesc);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			ByteBuffer valueEncoded = stack.ASCII(value);
			return novr_SetString(hmddesc, memAddress(propertyNameEncoded), memAddress(valueEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #ovr_GetTextureSwapChainLength GetTextureSwapChainLength} */
	public static native int novr_GetTextureSwapChainLength(long session, long chain, int[] out_Length);

	/** Array version of: {@link #ovr_GetTextureSwapChainLength GetTextureSwapChainLength} */
	public static int ovr_GetTextureSwapChainLength(long session, long chain, int[] out_Length) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_Length, 1);
		}
		return novr_GetTextureSwapChainLength(session, chain, out_Length);
	}

	/** Array version of: {@link #ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex} */
	public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, int[] out_Index);

	/** Array version of: {@link #ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex} */
	public static int ovr_GetTextureSwapChainCurrentIndex(long session, long chain, int[] out_Index) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_Index, 1);
		}
		return novr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
	}

	/** Array version of: {@link #ovr_GetFloatArray GetFloatArray} */
	public static native int novr_GetFloatArray(long session, long propertyName, float[] values, int valuesCapacity);

	/** Array version of: {@link #ovr_GetFloatArray GetFloatArray} */
	public static int ovr_GetFloatArray(long session, ByteBuffer propertyName, float[] values) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_GetFloatArray(session, memAddress(propertyName), values, values.length);
	}

	/** Array version of: {@link #ovr_GetFloatArray GetFloatArray} */
	public static int ovr_GetFloatArray(long session, CharSequence propertyName, float[] values) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_GetFloatArray(session, memAddress(propertyNameEncoded), values, values.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #ovr_SetFloatArray SetFloatArray} */
	public static native boolean novr_SetFloatArray(long session, long propertyName, float[] values, int valuesSize);

	/** Array version of: {@link #ovr_SetFloatArray SetFloatArray} */
	public static boolean ovr_SetFloatArray(long session, ByteBuffer propertyName, float[] values) {
		if ( CHECKS ) {
			checkPointer(session);
			checkNT1(propertyName);
		}
		return novr_SetFloatArray(session, memAddress(propertyName), values, values.length);
	}

	/** Array version of: {@link #ovr_SetFloatArray SetFloatArray} */
	public static boolean ovr_SetFloatArray(long session, CharSequence propertyName, float[] values) {
		if ( CHECKS )
			checkPointer(session);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer propertyNameEncoded = stack.ASCII(propertyName);
			return novr_SetFloatArray(session, memAddress(propertyNameEncoded), values, values.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}