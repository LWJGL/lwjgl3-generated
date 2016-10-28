/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API. */
public class OVR {

	/** Boolean values */
	public static final int
		ovrFalse = 0,
		ovrTrue  = 1;

	/**
	 * Initialization flags. ({@code ovrInitFlags})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrInit_Debug Init_Debug} - 
	 * When a debug library is requested, a slower debugging version of the library will run which can be used to help solve problems in the library and
	 * debug application code.
	 * </li>
	 * <li>{@link #ovrInit_RequestVersion Init_RequestVersion} - 
	 * When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
	 * {@code RequestedMinorVersion} is supported.
	 * 
	 * <p>When a version is requested, the LibOVR runtime respects the {@code RequestedMinorVersion} field and verifies that the
	 * {@code RequestedMinorVersion} is supported. Normally when you specify this flag you simply use {@link OVRVersion#OVR_MINOR_VERSION MINOR_VERSION} for
	 * {@link OVRInitParams}{@code ::RequestedMinorVersion}, though you could use a lower version than {@link OVRVersion#OVR_MINOR_VERSION MINOR_VERSION} to specify previous version behavior.</p>
	 * </li>
	 * <li>{@link #ovrInit_WritableBits Init_WritableBits} - These bits are writable by user code.</li>
	 * </ul>
	 */
	public static final int
		ovrInit_Debug          = 0x1,
		ovrInit_RequestVersion = 0x4,
		ovrInit_WritableBits   = 0xFFFFFF;

	/**
	 * Logging levels. ({@code ovrLogLevel})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrLogLevel_Debug LogLevel_Debug} - Debug-level log event.</li>
	 * <li>{@link #ovrLogLevel_Info LogLevel_Info} - Info-level log event.</li>
	 * <li>{@link #ovrLogLevel_Error LogLevel_Error} - Error-level log event.</li>
	 * </ul>
	 */
	public static final int
		ovrLogLevel_Debug = 0,
		ovrLogLevel_Info  = 1,
		ovrLogLevel_Error = 2;

	/**
	 * HMD types. ({@code ovrHmdType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrHmd_None Hmd_None}</li>
	 * <li>{@link #ovrHmd_DK1 Hmd_DK1}</li>
	 * <li>{@link #ovrHmd_DKHD Hmd_DKHD}</li>
	 * <li>{@link #ovrHmd_DK2 Hmd_DK2}</li>
	 * <li>{@link #ovrHmd_CB Hmd_CB}</li>
	 * <li>{@link #ovrHmd_Other Hmd_Other}</li>
	 * <li>{@link #ovrHmd_E3_2015 Hmd_E3_2015}</li>
	 * <li>{@link #ovrHmd_ES06 Hmd_ES06}</li>
	 * <li>{@link #ovrHmd_ES09 Hmd_ES09}</li>
	 * <li>{@link #ovrHmd_ES11 Hmd_ES11}</li>
	 * <li>{@link #ovrHmd_CV1 Hmd_CV1}</li>
	 * </ul>
	 */
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

	/**
	 * HMD capability bits reported by device. ({@code ovrHmdCaps})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrHmdCap_DebugDevice HmdCap_DebugDevice} - (read only) Specifies that the HMD is a virtual debug device.</li>
	 * </ul>
	 */
	public static final int ovrHmdCap_DebugDevice = 0x10;

	/**
	 * Tracking capability bits reported by the device. ({@code ovrTrackingCaps})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTrackingCap_Orientation TrackingCap_Orientation} - Supports orientation tracking (IMU).</li>
	 * <li>{@link #ovrTrackingCap_MagYawCorrection TrackingCap_MagYawCorrection} - Supports yaw drift correction via a magnetometer or other means.</li>
	 * <li>{@link #ovrTrackingCap_Position TrackingCap_Position} - Supports positional tracking.</li>
	 * </ul>
	 */
	public static final int
		ovrTrackingCap_Orientation      = 0x10,
		ovrTrackingCap_MagYawCorrection = 0x20,
		ovrTrackingCap_Position         = 0x40;

	/**
	 * Specifies which eye is being used for rendering. ({@code ovrEyeType})
	 * 
	 * <p>This type explicitly does not include a third "NoStereo" monoscopic option, as such is not required for an HMD-centered API.</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrEye_Left Eye_Left} - The left eye, from the viewer's perspective.</li>
	 * <li>{@link #ovrEye_Right Eye_Right} - The right eye, from the viewer's perspective.</li>
	 * <li>{@link #ovrEye_Count Eye_Count} - Count of enumerated elements.</li>
	 * </ul>
	 */
	public static final int
		ovrEye_Left  = 0,
		ovrEye_Right = 1,
		ovrEye_Count = 2;

	/**
	 * Specifies the coordinate system ovrTrackingState returns tracking poses in. ({@code ovrTrackingOrigin})
	 * 
	 * <p>Used with {@link #ovr_SetTrackingOriginType SetTrackingOriginType}.</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTrackingOrigin_EyeLevel TrackingOrigin_EyeLevel} - 
	 * Tracking system origin reported at eye (HMD) height.
	 * 
	 * <p>Prefer using this origin when your application requires matching user's current physical head pose to a virtual head pose without any regards to a
	 * the height of the floor. Cockpit-based, or 3rd-person experiences are ideal candidates. When used, all poses in {@link OVRTrackingState} are reported as
	 * an offset transform from the profile calibrated or recentered HMD pose. It is recommended that apps using this origin type call
	 * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} prior to starting the VR experience, but notify the user before doing so to make sure the user is in a comfortable pose,
	 * facing a comfortable direction.</p>
	 * </li>
	 * <li>{@link #ovrTrackingOrigin_FloorLevel TrackingOrigin_FloorLevel} - 
	 * Tracking system origin reported at floor height.
	 * 
	 * <p>Prefer using this origin when your application requires the physical floor height to match the virtual floor height, such as standing experiences.
	 * When used, all poses in {@link OVRTrackingState} are reported as an offset transform from the profile calibrated floor pose. Calling
	 * {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} will recenter the X & Z axes as well as yaw, but the Y-axis (i.e. height) will continue to be reported using the floor
	 * height as the origin for all poses.</p>
	 * </li>
	 * </ul>
	 */
	public static final int
		ovrTrackingOrigin_EyeLevel   = 0,
		ovrTrackingOrigin_FloorLevel = 1;

	/**
	 * Bit flags describing the current status of sensor tracking. ({@code ovrStatusBits}
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrStatus_OrientationTracked Status_OrientationTracked} - Orientation is currently tracked (connected and in use).</li>
	 * <li>{@link #ovrStatus_PositionTracked Status_PositionTracked} - Position is currently tracked (false if out of range).</li>
	 * </ul>
	 */
	public static final int
		ovrStatus_OrientationTracked = 0x1,
		ovrStatus_PositionTracked    = 0x2;

	/**
	 * Specifies sensor flags. ({@code ovrTrackerFlags})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTracker_Connected Tracker_Connected} - The sensor is present, else the sensor is absent or offline.</li>
	 * <li>{@link #ovrTracker_PoseTracked Tracker_PoseTracked} - The sensor has a valid pose, else the pose is unavailable. This will only be set if ovrTracker_Connected is set.</li>
	 * </ul>
	 */
	public static final int
		ovrTracker_Connected   = 0x20,
		ovrTracker_PoseTracked = 0x4;

	/**
	 * The type of texture resource. ({@code ovrTextureType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTexture_2D Texture_2D} - 2D textures</li>
	 * <li>{@link #ovrTexture_2D_External Texture_2D_External} - External 2D texture. Not used on PC</li>
	 * <li>{@link #ovrTexture_Cube Texture_Cube} - Cube maps. Not currently supported on PC.</li>
	 * </ul>
	 */
	public static final int
		ovrTexture_2D          = 0,
		ovrTexture_2D_External = 1,
		ovrTexture_Cube        = 2;

	/**
	 * The bindings required for texture swap chain. ({@code ovrTextureBindFlags})
	 * 
	 * <p>All texture swap chains are automatically bindable as shader input resources since the Oculus runtime needs this to read them.</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTextureBind_None TextureBind_None}</li>
	 * <li>{@link #ovrTextureBind_DX_RenderTarget TextureBind_DX_RenderTarget} - The application can write into the chain with pixel shader</li>
	 * <li>{@link #ovrTextureBind_DX_UnorderedAccess TextureBind_DX_UnorderedAccess} - The application can write to the chain with compute shader</li>
	 * <li>{@link #ovrTextureBind_DX_DepthStencil TextureBind_DX_DepthStencil} - The chain buffers can be bound as depth and/or stencil buffers</li>
	 * </ul>
	 */
	public static final int
		ovrTextureBind_None               = 0,
		ovrTextureBind_DX_RenderTarget    = 0x1,
		ovrTextureBind_DX_UnorderedAccess = 0x2,
		ovrTextureBind_DX_DepthStencil    = 0x4;

	/**
	 * The format of a texture. ({@code ovrTextureFormat})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #OVR_FORMAT_UNKNOWN OVR_FORMAT_UNKNOWN}</li>
	 * <li>{@link #OVR_FORMAT_B5G6R5_UNORM OVR_FORMAT_B5G6R5_UNORM} - Not currently supported on PC. Would require a DirectX 11.1 device.</li>
	 * <li>{@link #OVR_FORMAT_B5G5R5A1_UNORM OVR_FORMAT_B5G5R5A1_UNORM} - Not currently supported on PC. Would require a DirectX 11.1 device.</li>
	 * <li>{@link #OVR_FORMAT_B4G4R4A4_UNORM OVR_FORMAT_B4G4R4A4_UNORM} - Not currently supported on PC. Would require a DirectX 11.1 device.</li>
	 * <li>{@link #OVR_FORMAT_R8G8B8A8_UNORM OVR_FORMAT_R8G8B8A8_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_R8G8B8A8_UNORM_SRGB OVR_FORMAT_R8G8B8A8_UNORM_SRGB}</li>
	 * <li>{@link #OVR_FORMAT_B8G8R8A8_UNORM OVR_FORMAT_B8G8R8A8_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_B8G8R8A8_UNORM_SRGB OVR_FORMAT_B8G8R8A8_UNORM_SRGB} - Not supported for OpenGL applications.</li>
	 * <li>{@link #OVR_FORMAT_B8G8R8X8_UNORM OVR_FORMAT_B8G8R8X8_UNORM} - Not supported for OpenGL applications.</li>
	 * <li>{@link #OVR_FORMAT_B8G8R8X8_UNORM_SRGB OVR_FORMAT_B8G8R8X8_UNORM_SRGB} - Not supported for OpenGL applications.</li>
	 * <li>{@link #OVR_FORMAT_R16G16B16A16_FLOAT OVR_FORMAT_R16G16B16A16_FLOAT}</li>
	 * <li>{@link #OVR_FORMAT_D16_UNORM OVR_FORMAT_D16_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_D24_UNORM_S8_UINT OVR_FORMAT_D24_UNORM_S8_UINT}</li>
	 * <li>{@link #OVR_FORMAT_D32_FLOAT OVR_FORMAT_D32_FLOAT}</li>
	 * <li>{@link #OVR_FORMAT_D32_FLOAT_S8X24_UINT OVR_FORMAT_D32_FLOAT_S8X24_UINT}</li>
	 * <li>{@link #OVR_FORMAT_BC1_UNORM OVR_FORMAT_BC1_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_BC1_UNORM_SRGB OVR_FORMAT_BC1_UNORM_SRGB}</li>
	 * <li>{@link #OVR_FORMAT_BC2_UNORM OVR_FORMAT_BC2_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_BC2_UNORM_SRGB OVR_FORMAT_BC2_UNORM_SRGB}</li>
	 * <li>{@link #OVR_FORMAT_BC3_UNORM OVR_FORMAT_BC3_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_BC3_UNORM_SRGB OVR_FORMAT_BC3_UNORM_SRGB}</li>
	 * <li>{@link #OVR_FORMAT_BC6H_UF16 OVR_FORMAT_BC6H_UF16}</li>
	 * <li>{@link #OVR_FORMAT_BC6H_SF16 OVR_FORMAT_BC6H_SF16}</li>
	 * <li>{@link #OVR_FORMAT_BC7_UNORM OVR_FORMAT_BC7_UNORM}</li>
	 * <li>{@link #OVR_FORMAT_BC7_UNORM_SRGB OVR_FORMAT_BC7_UNORM_SRGB}</li>
	 * </ul>
	 */
	public static final int
		OVR_FORMAT_UNKNOWN              = 0,
		OVR_FORMAT_B5G6R5_UNORM         = 1,
		OVR_FORMAT_B5G5R5A1_UNORM       = 2,
		OVR_FORMAT_B4G4R4A4_UNORM       = 3,
		OVR_FORMAT_R8G8B8A8_UNORM       = 4,
		OVR_FORMAT_R8G8B8A8_UNORM_SRGB  = 5,
		OVR_FORMAT_B8G8R8A8_UNORM       = 6,
		OVR_FORMAT_B8G8R8A8_UNORM_SRGB  = 7,
		OVR_FORMAT_B8G8R8X8_UNORM       = 8,
		OVR_FORMAT_B8G8R8X8_UNORM_SRGB  = 9,
		OVR_FORMAT_R16G16B16A16_FLOAT   = 10,
		OVR_FORMAT_D16_UNORM            = 11,
		OVR_FORMAT_D24_UNORM_S8_UINT    = 12,
		OVR_FORMAT_D32_FLOAT            = 13,
		OVR_FORMAT_D32_FLOAT_S8X24_UINT = 14,
		OVR_FORMAT_BC1_UNORM            = 15,
		OVR_FORMAT_BC1_UNORM_SRGB       = 16,
		OVR_FORMAT_BC2_UNORM            = 17,
		OVR_FORMAT_BC2_UNORM_SRGB       = 18,
		OVR_FORMAT_BC3_UNORM            = 19,
		OVR_FORMAT_BC3_UNORM_SRGB       = 20,
		OVR_FORMAT_BC6H_UF16            = 21,
		OVR_FORMAT_BC6H_SF16            = 22,
		OVR_FORMAT_BC7_UNORM            = 23,
		OVR_FORMAT_BC7_UNORM_SRGB       = 24;

	/**
	 * Misc flags overriding particular behaviors of a texture swap chain. ({@code ovrTextureFlags})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTextureMisc_None TextureMisc_None}</li>
	 * <li>{@link #ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless} - 
	 * DX only: The underlying texture is created with a TYPELESS equivalent of the format specified in the texture desc. The SDK will still access the
	 * texture using the format specified in the texture desc, but the app can create views with different formats if this is specified.
	 * </li>
	 * <li>{@link #ovrTextureMisc_AllowGenerateMips TextureMisc_AllowGenerateMips} - DX only: Allow generation of the mip chain on the GPU via the GenerateMips call. This flag requires that RenderTarget binding also be specified.</li>
	 * <li>{@link #ovrTextureMisc_ProtectedContent TextureMisc_ProtectedContent} - 
	 * Texture swap chain contains protected content, and requires HDCP connection in order to display to HMD. Also prevents mirroring or other
	 * redirection of any frame containing this contents
	 * </li>
	 * </ul>
	 */
	public static final int
		ovrTextureMisc_None              = 0,
		ovrTextureMisc_DX_Typeless       = 0x1,
		ovrTextureMisc_AllowGenerateMips = 0x2,
		ovrTextureMisc_ProtectedContent  = 0x4;

	/**
	 * Button input types. ({@code ovrTouch})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrButton_A Button_A} - Button A</li>
	 * <li>{@link #ovrButton_B Button_B} - Button B</li>
	 * <li>{@link #ovrButton_RThumb Button_RThumb} - Button RThumb</li>
	 * <li>{@link #ovrButton_RShoulder Button_RShoulder} - Button RShoulder</li>
	 * <li>{@link #ovrButton_X Button_X} - Button X</li>
	 * <li>{@link #ovrButton_Y Button_Y} - Button Y</li>
	 * <li>{@link #ovrButton_LThumb Button_LThumb} - Button LThumb</li>
	 * <li>{@link #ovrButton_LShoulder Button_LShoulder} - Button LShoulder</li>
	 * <li>{@link #ovrButton_Up Button_Up} - Button Up</li>
	 * <li>{@link #ovrButton_Down Button_Down} - Button Down</li>
	 * <li>{@link #ovrButton_Left Button_Left} - Button Left</li>
	 * <li>{@link #ovrButton_Right Button_Right} - Button Right</li>
	 * <li>{@link #ovrButton_Enter Button_Enter} - Button Enter</li>
	 * <li>{@link #ovrButton_Back Button_Back} - Button Back</li>
	 * <li>{@link #ovrButton_VolUp Button_VolUp} - Button VolUp</li>
	 * <li>{@link #ovrButton_VolDown Button_VolDown} - Button VolDown</li>
	 * <li>{@link #ovrButton_Home Button_Home} - Button Home</li>
	 * <li>{@link #ovrButton_Private Button_Private}</li>
	 * <li>{@link #ovrButton_RMask Button_RMask} - Bit mask of all buttons on the right Touch controller</li>
	 * <li>{@link #ovrButton_LMask Button_LMask} - Bit mask of all buttons on the left Touch controller</li>
	 * </ul>
	 */
	public static final int
		ovrButton_A         = 0x1,
		ovrButton_B         = 0x2,
		ovrButton_RThumb    = 0x4,
		ovrButton_RShoulder = 0x8,
		ovrButton_X         = 0x100,
		ovrButton_Y         = 0x200,
		ovrButton_LThumb    = 0x400,
		ovrButton_LShoulder = 0x800,
		ovrButton_Up        = 0x10000,
		ovrButton_Down      = 0x20000,
		ovrButton_Left      = 0x40000,
		ovrButton_Right     = 0x80000,
		ovrButton_Enter     = 0x100000,
		ovrButton_Back      = 0x200000,
		ovrButton_VolUp     = 0x400000,
		ovrButton_VolDown   = 0x800000,
		ovrButton_Home      = 0x1000000,
		ovrButton_Private   = ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home,
		ovrButton_RMask     = ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder,
		ovrButton_LMask     = ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder | ovrButton_Enter;

	/**
	 * Touch input types.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTouch_A Touch_A} - Touch A</li>
	 * <li>{@link #ovrTouch_B Touch_B} - Touch B</li>
	 * <li>{@link #ovrTouch_RThumb Touch_RThumb} - Touch RThumb</li>
	 * <li>{@link #ovrTouch_RThumbRest Touch_RThumbRest} - Touch RThumbRest</li>
	 * <li>{@link #ovrTouch_RIndexTrigger Touch_RIndexTrigger} - Touch RIndexTrigger</li>
	 * <li>{@link #ovrTouch_RButtonMask Touch_RButtonMask} - Bit mask of all the button touches on the right controller</li>
	 * <li>{@link #ovrTouch_X Touch_X} - Touch X</li>
	 * <li>{@link #ovrTouch_Y Touch_Y} - Touch Y</li>
	 * <li>{@link #ovrTouch_LThumb Touch_LThumb} - Touch LThumb</li>
	 * <li>{@link #ovrTouch_LThumbRest Touch_LThumbRest} - Touch LThumbRest</li>
	 * <li>{@link #ovrTouch_LIndexTrigger Touch_LIndexTrigger} - Touch LIndexTrigger</li>
	 * <li>{@link #ovrTouch_LButtonMask Touch_LButtonMask} - Bit mask of all the button touches on the left controller</li>
	 * <li>{@link #ovrTouch_RIndexPointing Touch_RIndexPointing} - TouchRIndexPointing</li>
	 * <li>{@link #ovrTouch_RThumbUp Touch_RThumbUp} - Touch RThumbUp</li>
	 * <li>{@link #ovrTouch_RPoseMask Touch_RPoseMask} - Bit mask of all right controller poses</li>
	 * <li>{@link #ovrTouch_LIndexPointing Touch_LIndexPointing} - Touch LIndexPointing</li>
	 * <li>{@link #ovrTouch_LThumbUp Touch_LThumbUp} - Touch LThumbUp</li>
	 * <li>{@link #ovrTouch_LPoseMask Touch_LPoseMask} - Bit mask of all left controller poses.</li>
	 * </ul>
	 */
	public static final int
		ovrTouch_A              = ovrButton_A,
		ovrTouch_B              = ovrButton_B,
		ovrTouch_RThumb         = ovrButton_RThumb,
		ovrTouch_RThumbRest     = 0x8,
		ovrTouch_RIndexTrigger  = 0x10,
		ovrTouch_RButtonMask    = ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RThumbRest | ovrTouch_RIndexTrigger,
		ovrTouch_X              = ovrButton_X,
		ovrTouch_Y              = ovrButton_Y,
		ovrTouch_LThumb         = ovrButton_LThumb,
		ovrTouch_LThumbRest     = 0x800,
		ovrTouch_LIndexTrigger  = 0x1000,
		ovrTouch_LButtonMask    = ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LThumbRest | ovrTouch_LIndexTrigger,
		ovrTouch_RIndexPointing = 0x20,
		ovrTouch_RThumbUp       = 0x40,
		ovrTouch_RPoseMask      = ovrTouch_RIndexPointing | ovrTouch_RThumbUp,
		ovrTouch_LIndexPointing = 0x2000,
		ovrTouch_LThumbUp       = 0x4000,
		ovrTouch_LPoseMask      = ovrTouch_LIndexPointing | ovrTouch_LThumbUp;

	/**
	 * Which controller is connected; multiple can be connected at once. ({@code ovrControllerType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrControllerType_None ControllerType_None}</li>
	 * <li>{@link #ovrControllerType_LTouch ControllerType_LTouch}</li>
	 * <li>{@link #ovrControllerType_RTouch ControllerType_RTouch}</li>
	 * <li>{@link #ovrControllerType_Touch ControllerType_Touch}</li>
	 * <li>{@link #ovrControllerType_Remote ControllerType_Remote}</li>
	 * <li>{@link #ovrControllerType_XBox ControllerType_XBox}</li>
	 * <li>{@link #ovrControllerType_Active ControllerType_Active} - Operate on or query whichever controller is active.</li>
	 * </ul>
	 */
	public static final int
		ovrControllerType_None   = 0x0,
		ovrControllerType_LTouch = 0x1,
		ovrControllerType_RTouch = 0x2,
		ovrControllerType_Touch  = 0x3,
		ovrControllerType_Remote = 0x4,
		ovrControllerType_XBox   = 0x10,
		ovrControllerType_Active = 0xFF;

	/**
	 * Haptics buffer submit mode. ({@code ovrHapticsBufferSubmitMode})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrHapticsBufferSubmit_Enqueue HapticsBufferSubmit_Enqueue} - Enqueue buffer for later playback</li>
	 * </ul>
	 */
	public static final int ovrHapticsBufferSubmit_Enqueue = 0;

	/**
	 * Position tracked devices. ({@code ovrTrackedDeviceType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrTrackedDevice_HMD TrackedDevice_HMD}</li>
	 * <li>{@link #ovrTrackedDevice_LTouch TrackedDevice_LTouch}</li>
	 * <li>{@link #ovrTrackedDevice_RTouch TrackedDevice_RTouch}</li>
	 * <li>{@link #ovrTrackedDevice_Touch TrackedDevice_Touch}</li>
	 * <li>{@link #ovrTrackedDevice_All TrackedDevice_All}</li>
	 * </ul>
	 */
	public static final int
		ovrTrackedDevice_HMD    = 0x1,
		ovrTrackedDevice_LTouch = 0x2,
		ovrTrackedDevice_RTouch = 0x4,
		ovrTrackedDevice_Touch  = 0x6,
		ovrTrackedDevice_All    = 0xFFFF;

	/**
	 * Boundary types that specified while using the boundary system. ({@code ovrBoundaryType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrBoundary_Outer Boundary_Outer} - Outer boundary - closely represents user setup walls</li>
	 * <li>{@link #ovrBoundary_PlayArea Boundary_PlayArea} - Play area - safe rectangular area inside outer boundary which can optionally be used to restrict user interactions and motion.</li>
	 * </ul>
	 */
	public static final int
		ovrBoundary_Outer    = 0x1,
		ovrBoundary_PlayArea = 0x100;

	/**
	 * Names for the left and right hand array indexes. ({@code ovrHandType})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrHand_Left Hand_Left}</li>
	 * <li>{@link #ovrHand_Right Hand_Right}</li>
	 * <li>{@link #ovrHand_Count Hand_Count}</li>
	 * </ul>
	 */
	public static final int
		ovrHand_Left  = 0x0,
		ovrHand_Right = 0x1,
		ovrHand_Count = 0x2;

	/**
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrMaxProvidedFrameStats MaxProvidedFrameStats} - Maximum number of frames of performance stats provided back to the caller of {@link #ovr_GetPerfStats GetPerfStats}.</li>
	 * </ul>
	 */
	public static final int ovrMaxProvidedFrameStats = 0x5;

	/** Specifies the maximum number of layers supported by {@link #ovr_SubmitFrame SubmitFrame}. */
	public static final int ovrMaxLayerCount = 16;

	/**
	 * Describes layer types that can be passed to {@link #ovr_SubmitFrame SubmitFrame}. ({@code ovrLayerType})
	 * 
	 * <p>Each layer type has an associated struct, such as {@link OVRLayerEyeFov}.</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrLayerType_Disabled LayerType_Disabled} - Layer is disabled.</li>
	 * <li>{@link #ovrLayerType_EyeFov LayerType_EyeFov} - Described by {@link OVRLayerEyeFov}.</li>
	 * <li>{@link #ovrLayerType_Quad LayerType_Quad} - Described by {@link OVRLayerQuad}.</li>
	 * <li>{@link #ovrLayerType_EyeMatrix LayerType_EyeMatrix} - Described by {@link OVRLayerEyeMatrix}.</li>
	 * </ul>
	 */
	public static final int
		ovrLayerType_Disabled  = 0,
		ovrLayerType_EyeFov    = 1,
		ovrLayerType_Quad      = 3,
		ovrLayerType_EyeMatrix = 5;

	/**
	 * Identifies flags used by {@link OVRLayerHeader} and which are passed to {@link #ovr_SubmitFrame SubmitFrame}. ({@code ovrLayerFlags})
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrLayerFlag_HighQuality LayerFlag_HighQuality} - 
	 * Enables 4x anisotropic sampling during the composition of the layer. The benefits are mostly visible at the periphery for high-frequency &amp;
	 * high-contrast visuals. For best results consider combining this flag with an {@code ovrTextureSwapChain} that has mipmaps and instead of using
	 * arbitrary sized textures, prefer texture sizes that are powers-of-two. Actual rendered viewport and doesn't necessarily have to fill the whole
	 * texture.
	 * </li>
	 * <li>{@link #ovrLayerFlag_TextureOriginAtBottomLeft LayerFlag_TextureOriginAtBottomLeft} - the opposite is TopLeft. Generally this is false for D3D, true for OpenGL.</li>
	 * <li>{@link #ovrLayerFlag_HeadLocked LayerFlag_HeadLocked} - 
	 * Mark this surface as "headlocked", which means it is specified relative to the HMD and moves with it, rather than being specified relative to
	 * sensor/torso space and remaining still while the head moves. What used to be {@code ovrLayerType_QuadHeadLocked} is now {@link #ovrLayerType_Quad LayerType_Quad} plus this
	 * flag. However the flag can be applied to any layer type to achieve a similar effect.
	 * </li>
	 * </ul>
	 */
	public static final int
		ovrLayerFlag_HighQuality               = 0x1,
		ovrLayerFlag_TextureOriginAtBottomLeft = 0x2,
		ovrLayerFlag_HeadLocked                = 0x4;

	/**
	 * Performance HUD enables the HMD user to see information critical to the real-time operation of the VR application such as latency timing, and CPU & GPU
	 * performance metrics.
	 * 
	 * <p>App can toggle performance HUD modes as such:</p>
	 * 
	 * <pre><code>ovrPerfHudMode PerfHudMode = ovrPerfHud_LatencyTiming;
ovr_SetInt(session, OVR_PERF_HUD_MODE, (int)PerfHudMode);</code></pre>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrPerfHud_Off PerfHud_Off} - Turns off the performance HUD</li>
	 * <li>{@link #ovrPerfHud_PerfSummary PerfHud_PerfSummary} - Shows performance summary and headroom</li>
	 * <li>{@link #ovrPerfHud_LatencyTiming PerfHud_LatencyTiming} - Shows latency related timing info</li>
	 * <li>{@link #ovrPerfHud_AppRenderTiming PerfHud_AppRenderTiming} - Shows render timing info for application</li>
	 * <li>{@link #ovrPerfHud_CompRenderTiming PerfHud_CompRenderTiming} - Shows render timing info for OVR compositor</li>
	 * <li>{@link #ovrPerfHud_VersionInfo PerfHud_VersionInfo} - Shows SDK & HMD version Info</li>
	 * </ul>
	 */
	public static final int
		ovrPerfHud_Off              = 0,
		ovrPerfHud_PerfSummary      = 1,
		ovrPerfHud_LatencyTiming    = 2,
		ovrPerfHud_AppRenderTiming  = 3,
		ovrPerfHud_CompRenderTiming = 4,
		ovrPerfHud_VersionInfo      = 5;

	/**
	 * Layer HUD enables the HMD user to see information about a layer.
	 * 
	 * <p>App can toggle layer HUD modes as such:</p>
	 * 
	 * <pre><code>ovrLayerHudMode LayerHudMode = ovrLayerHud_Info;
ovr_SetInt(Hmd, OVR_LAYER_HUD_MODE, (int)LayerHudMode);</code></pre>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrLayerHud_Off LayerHud_Off} - Turns off the layer HUD</li>
	 * <li>{@link #ovrLayerHud_Info LayerHud_Info} - Shows info about a specific layer</li>
	 * </ul>
	 */
	public static final int
		ovrLayerHud_Off  = 0,
		ovrLayerHud_Info = 1;

	/**
	 * Debug HUD is provided to help developers gauge and debug the fidelity of their app's stereo rendering characteristics. Using the provided quad and
	 * crosshair guides, the developer can verify various aspects such as VR tracking units (e.g. meters), stereo camera-parallax properties (e.g. making sure
	 * objects at infinity are rendered with the proper separation), measuring VR geometry sizes and distances and more.
	 * 
	 * <p>App can toggle the debug HUD modes as such:</p>
	 * 
	 * <pre><code>ovrDebugHudStereoMode DebugHudMode = ovrDebugHudStereo_QuadWithCrosshair;
ovr_SetInt(session, OVR_DEBUG_HUD_STEREO_MODE, (int)DebugHudMode);</code></pre>
	 * 
	 * <p>The app can modify the visual properties of the stereo guide (i.e. quad, crosshair) using the {@link #ovr_SetFloatArray SetFloatArray} function. For a list of tweakable
	 * properties, see the {@code OVR_DEBUG_HUD_STEREO_GUIDE_*} keys in {@link OVRKeys}.</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #ovrDebugHudStereo_Off DebugHudStereo_Off} - Turns off the Stereo Debug HUD</li>
	 * <li>{@link #ovrDebugHudStereo_Quad DebugHudStereo_Quad} - Renders Quad in world for Stereo Debugging</li>
	 * <li>{@link #ovrDebugHudStereo_QuadWithCrosshair DebugHudStereo_QuadWithCrosshair} - Renders Quad+crosshair in world for Stereo Debugging</li>
	 * <li>{@link #ovrDebugHudStereo_CrosshairAtInfinity DebugHudStereo_CrosshairAtInfinity} - Renders screen-space crosshair at infinity for Stereo Debugging</li>
	 * </ul>
	 */
	public static final int
		ovrDebugHudStereo_Off                 = 0,
		ovrDebugHudStereo_Quad                = 1,
		ovrDebugHudStereo_QuadWithCrosshair   = 2,
		ovrDebugHudStereo_CrosshairAtInfinity = 3;

	static { LibOVR.initialize(); }

	protected OVR() {
		throw new UnsupportedOperationException();
	}

	// --- [ ovr_Initialize ] ---

	/** Unsafe version of: {@link #ovr_Initialize Initialize} */
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
	 * @param params specifies custom initialization options. May be {@code NULL} to indicate default options when using the CAPI shim. If you are directly calling the
	 *               LibOVRRT version of {@code ovr_Initialize} in the LibOVRRT DLL then this must be valid and include {@link #ovrInit_RequestVersion Init_RequestVersion}.
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
		return novr_Initialize(memAddressSafe(params));
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

	/** Unsafe version of: {@link #ovr_GetLastErrorInfo GetLastErrorInfo} */
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

	/** Unsafe version of: {@link #ovr_GetVersionString GetVersionString} */
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

	/** Unsafe version of: {@link #ovr_TraceMessage TraceMessage} */
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

	// --- [ ovr_IdentifyClient ] ---

	/** Unsafe version of: {@link #ovr_IdentifyClient IdentifyClient} */
	public static native int novr_IdentifyClient(long identity);

	/**
	 * Identifies client application info.
	 * 
	 * <p>The string is one or more newline-delimited lines of optional info indicating engine name, engine version, engine plugin name, engine plugin version,
	 * engine editor. The order of the lines is not relevant. Individual lines are optional. A newline is not necessary at the end of the last line. Call
	 * after {@link #ovr_Initialize Initialize} and before the first call to {@link #ovr_Create Create}. Each value is limited to 20 characters. Key names such as 'EngineName:', 'EngineVersion:'
	 * do not count towards this limit.</p>
	 * 
	 * <pre><code>EngineName: %s\n
EngineVersion: %s\n
EnginePluginName: %s\n
EnginePluginVersion: %s\n
EngineEditor: <boolean> ('true' or 'false')\n</code></pre>
	 * 
	 * <p>Example code:</p>
	 * 
	 * <pre><code>ovr_IdentifyClient(
    "EngineName: Unity\n" +
    "EngineVersion: 5.3.3\n" +
    "EnginePluginName: OVRPlugin\n" +
    "EnginePluginVersion: 1.2.0\n" +
    "EngineEditor: true");</code></pre>
	 *
	 * @param identity specifies one or more newline-delimited lines of optional info
	 */
	public static int ovr_IdentifyClient(ByteBuffer identity) {
		if ( CHECKS )
			checkNT1(identity);
		return novr_IdentifyClient(memAddress(identity));
	}

	/**
	 * Identifies client application info.
	 * 
	 * <p>The string is one or more newline-delimited lines of optional info indicating engine name, engine version, engine plugin name, engine plugin version,
	 * engine editor. The order of the lines is not relevant. Individual lines are optional. A newline is not necessary at the end of the last line. Call
	 * after {@link #ovr_Initialize Initialize} and before the first call to {@link #ovr_Create Create}. Each value is limited to 20 characters. Key names such as 'EngineName:', 'EngineVersion:'
	 * do not count towards this limit.</p>
	 * 
	 * <pre><code>EngineName: %s\n
EngineVersion: %s\n
EnginePluginName: %s\n
EnginePluginVersion: %s\n
EngineEditor: <boolean> ('true' or 'false')\n</code></pre>
	 * 
	 * <p>Example code:</p>
	 * 
	 * <pre><code>ovr_IdentifyClient(
    "EngineName: Unity\n" +
    "EngineVersion: 5.3.3\n" +
    "EnginePluginName: OVRPlugin\n" +
    "EnginePluginVersion: 1.2.0\n" +
    "EngineEditor: true");</code></pre>
	 *
	 * @param identity specifies one or more newline-delimited lines of optional info
	 */
	public static int ovr_IdentifyClient(CharSequence identity) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer identityEncoded = stack.UTF8(identity);
			return novr_IdentifyClient(memAddress(identityEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ovr_GetHmdDesc ] ---

	/** Unsafe version of: {@link #ovr_GetHmdDesc GetHmdDesc} */
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

	/** Unsafe version of: {@link #ovr_GetTrackerCount GetTrackerCount} */
	public static native int novr_GetTrackerCount(long session);

	/**
	 * Returns the number of attached trackers.
	 * 
	 * <p>The number of trackers may change at any time, so this function should be called before use as opposed to once on startup.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static int ovr_GetTrackerCount(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetTrackerCount(session);
	}

	// --- [ ovr_GetTrackerDesc ] ---

	/** Unsafe version of: {@link #ovr_GetTrackerDesc GetTrackerDesc} */
	public static native void novr_GetTrackerDesc(long session, int trackerDescIndex, long __result);

	/**
	 * Returns a given attached tracker description.
	 * 
	 * <p>{@link #ovr_Initialize Initialize} must have first been called in order for this to succeed, otherwise the returned {@code trackerDescArray} will be zero-initialized. The
	 * data returned by this function can change at runtime.</p>
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerDescIndex a tracker index. The valid indexes are in the range of 0 to the tracker count returned by {@link #ovr_GetTrackerCount GetTrackerCount}.
	 * @param __result         an {@link OVRTrackerDesc}. An empty {@code OVRTrackerDesc} will be returned if {@code trackerDescIndex} is out of range.
	 */
	public static OVRTrackerDesc ovr_GetTrackerDesc(long session, int trackerDescIndex, OVRTrackerDesc __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackerDesc(session, trackerDescIndex, __result.address());
		return __result;
	}

	// --- [ ovr_Create ] ---

	/** Unsafe version of: {@link #ovr_Create Create} */
	public static native int novr_Create(long pSession, long luid);

	/**
	 * Creates a handle to a VR session.
	 * 
	 * <p>Upon success the returned {@code ovrSession} must be eventually freed with {@link #ovr_Destroy Destroy} when it is no longer needed. A second call to {@link #ovr_Create Create} will result
	 * in an error return value if the previous session has not been destroyed.</p>
	 *
	 * @param pSession a pointer to an {@code ovrSession} which will be written to upon success
	 * @param luid     a system specific graphics adapter identifier that locates which graphics adapter has the HMD attached. This must match the adapter used by the
	 *                 application or no rendering output will be possible. This is important for stability on multi-adapter systems. An application that simply chooses
	 *                 the default adapter will not run reliably on multi-adapter systems.
	 *
	 * @return an {@code ovrResult} indicating success or failure. Upon failure the returned {@code ovrSession} will be {@code NULL}.
	 */
	public static int ovr_Create(PointerBuffer pSession, OVRGraphicsLuid luid) {
		if ( CHECKS )
			checkBuffer(pSession, 1);
		return novr_Create(memAddress(pSession), luid.address());
	}

	// --- [ ovr_Destroy ] ---

	/** Unsafe version of: {@link #ovr_Destroy Destroy} */
	public static native void novr_Destroy(long session);

	/**
	 * Destroys the session.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 */
	public static void ovr_Destroy(long session) {
		if ( CHECKS )
			checkPointer(session);
		novr_Destroy(session);
	}

	// --- [ ovr_GetSessionStatus ] ---

	/** Unsafe version of: {@link #ovr_GetSessionStatus GetSessionStatus} */
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

	/** Unsafe version of: {@link #ovr_SetTrackingOriginType SetTrackingOriginType} */
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

	/** Unsafe version of: {@link #ovr_GetTrackingOriginType GetTrackingOriginType} */
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

	/** Unsafe version of: {@link #ovr_RecenterTrackingOrigin RecenterTrackingOrigin} */
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

	/** Unsafe version of: {@link #ovr_ClearShouldRecenterFlag ClearShouldRecenterFlag} */
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

	/** Unsafe version of: {@link #ovr_GetTrackingState GetTrackingState} */
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
	 *                      "SensorSampleTime", that will override the value stored here.
	 * @param __result      the {@link OVRTrackingState} that is predicted for the given {@code absTime}
	 */
	public static OVRTrackingState ovr_GetTrackingState(long session, double absTime, boolean latencyMarker, OVRTrackingState __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackingState(session, absTime, latencyMarker, __result.address());
		return __result;
	}

	// --- [ ovr_GetTrackerPose ] ---

	/** Unsafe version of: {@link #ovr_GetTrackerPose GetTrackerPose} */
	public static native void novr_GetTrackerPose(long session, int trackerPoseIndex, long __result);

	/**
	 * Returns the {@link OVRTrackerPose} for the given attached tracker.
	 *
	 * @param session          an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param trackerPoseIndex index of the tracker being requested.
	 */
	public static OVRTrackerPose ovr_GetTrackerPose(long session, int trackerPoseIndex, OVRTrackerPose __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTrackerPose(session, trackerPoseIndex, __result.address());
		return __result;
	}

	// --- [ ovr_GetInputState ] ---

	/** Unsafe version of: {@link #ovr_GetInputState GetInputState} */
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

	/** Unsafe version of: {@link #ovr_GetConnectedControllerTypes GetConnectedControllerTypes} */
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

	// --- [ ovr_GetTouchHapticsDesc ] ---

	/** Unsafe version of: {@link #ovr_GetTouchHapticsDesc GetTouchHapticsDesc} */
	public static native void novr_GetTouchHapticsDesc(long session, int controllerType, long __result);

	/**
	 * Gets information about Haptics engine for the specified Touch controller.
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller to retrieve the information from
	 * @param __result       an {@link OVRTouchHapticsDesc}
	 */
	public static OVRTouchHapticsDesc ovr_GetTouchHapticsDesc(long session, int controllerType, OVRTouchHapticsDesc __result) {
		if ( CHECKS )
			checkPointer(session);
		novr_GetTouchHapticsDesc(session, controllerType, __result.address());
		return __result;
	}

	// --- [ ovr_SetControllerVibration ] ---

	/** Unsafe version of: {@link #ovr_SetControllerVibration SetControllerVibration} */
	public static native int novr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude);

	/**
	 * Sets constant vibration (with specified frequency and amplitude) to a controller.
	 * 
	 * <p>Note: {@code ovr_SetControllerVibration} cannot be used interchangeably with {@link #ovr_SubmitControllerVibration SubmitControllerVibration}.</p>
	 * 
	 * <p>This method should be called periodically, vibration lasts for a maximum of 2.5 seconds.</p>
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller to set the vibration to
	 * @param frequency      the vibration frequency. Supported values are: 0.0 (disabled), 0.5 and 1.0. Non valid values will be clamped.
	 * @param amplitude      the vibration amplitude in the {@code [0.0, 1.0]} range
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
	 *         </ul>
	 */
	public static int ovr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude) {
		if ( CHECKS )
			checkPointer(session);
		return novr_SetControllerVibration(session, controllerType, frequency, amplitude);
	}

	// --- [ ovr_SubmitControllerVibration ] ---

	/** Unsafe version of: {@link #ovr_SubmitControllerVibration SubmitControllerVibration} */
	public static native int novr_SubmitControllerVibration(long session, int controllerType, long buffer);

	/**
	 * Submits a Haptics buffer (used for vibration) to Touch (only) controllers.
	 * 
	 * <p>Note: {@code ovr_SubmitControllerVibration} cannot be used interchangeably with {@link #ovr_SetControllerVibration SetControllerVibration}.</p>
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller where the Haptics buffer will be played
	 * @param buffer         the Haptics buffer containing amplitude samples to be played
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
	 *         </ul>
	 */
	public static int ovr_SubmitControllerVibration(long session, int controllerType, OVRHapticsBuffer buffer) {
		if ( CHECKS ) {
			checkPointer(session);
			OVRHapticsBuffer.validate(buffer.address());
		}
		return novr_SubmitControllerVibration(session, controllerType, buffer.address());
	}

	// --- [ ovr_GetControllerVibrationState ] ---

	/** Unsafe version of: {@link #ovr_GetControllerVibrationState GetControllerVibrationState} */
	public static native int novr_GetControllerVibrationState(long session, int controllerType, long outState);

	/**
	 * Gets the Haptics engine playback state of a specific Touch controller.
	 *
	 * @param session        an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param controllerType the controller where the Haptics buffer will be played
	 * @param outState       the state of the haptics engine
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code controllerType} is not available.</li>
	 *         </ul>
	 */
	public static int ovr_GetControllerVibrationState(long session, int controllerType, OVRHapticsPlaybackState outState) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetControllerVibrationState(session, controllerType, outState.address());
	}

	// --- [ ovr_TestBoundary ] ---

	/** Unsafe version of: {@link #ovr_TestBoundary TestBoundary} */
	public static native int novr_TestBoundary(long session, int deviceBitmask, int boundaryType, long outTestResult);

	/**
	 * Tests collision/proximity of position tracked devices (e.g. HMD and/or Touch) against the Boundary System.
	 * 
	 * <p>Note: this method is similar to {@link #ovr_BoundaryTestPoint BoundaryTestPoint} but can be more precise as it may take into account device acceleration/momentum.</p>
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param deviceBitmask bitmask of one or more tracked devices to test. One or more of:<br><table><tr><td>{@link #ovrTrackedDevice_HMD TrackedDevice_HMD}</td><td>{@link #ovrTrackedDevice_LTouch TrackedDevice_LTouch}</td><td>{@link #ovrTrackedDevice_RTouch TrackedDevice_RTouch}</td><td>{@link #ovrTrackedDevice_Touch TrackedDevice_Touch}</td></tr><tr><td>{@link #ovrTrackedDevice_All TrackedDevice_All}</td></tr></table>
	 * @param boundaryType  the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
	 * @param outTestResult result of collision/proximity test, contains information such as distance and closest point
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_DeviceUnavailable Success_DeviceUnavailable}: The call succeeded but the device referred to by {@code deviceBitmask} is not available.</li>
	 *         </ul>
	 */
	public static int ovr_TestBoundary(long session, int deviceBitmask, int boundaryType, OVRBoundaryTestResult outTestResult) {
		if ( CHECKS )
			checkPointer(session);
		return novr_TestBoundary(session, deviceBitmask, boundaryType, outTestResult.address());
	}

	// --- [ ovr_TestBoundaryPoint ] ---

	/** Unsafe version of: {@link #ovr_TestBoundaryPoint TestBoundaryPoint} */
	public static native int novr_TestBoundaryPoint(long session, long point, int singleBoundaryType, long outTestResult);

	/**
	 * Tests collision/proximity of a 3D point against the Boundary System.
	 *
	 * @param session            an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param point              the 3D point to test
	 * @param singleBoundaryType the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
	 * @param outTestResult      result of collision/proximity test, contains information such as distance and closest point
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
	 *         </ul>
	 */
	public static int ovr_TestBoundaryPoint(long session, OVRVector3f point, int singleBoundaryType, OVRBoundaryTestResult outTestResult) {
		if ( CHECKS )
			checkPointer(session);
		return novr_TestBoundaryPoint(session, point.address(), singleBoundaryType, outTestResult.address());
	}

	// --- [ ovr_SetBoundaryLookAndFeel ] ---

	/** Unsafe version of: {@link #ovr_SetBoundaryLookAndFeel SetBoundaryLookAndFeel} */
	public static native int novr_SetBoundaryLookAndFeel(long session, long lookAndFeel);

	/**
	 * Sets the look and feel of the Boundary System.
	 *
	 * @param session     an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param lookAndFeel the look and feel parameters
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static int ovr_SetBoundaryLookAndFeel(long session, OVRBoundaryLookAndFeel lookAndFeel) {
		if ( CHECKS )
			checkPointer(session);
		return novr_SetBoundaryLookAndFeel(session, lookAndFeel.address());
	}

	// --- [ ovr_ResetBoundaryLookAndFeel ] ---

	/** Unsafe version of: {@link #ovr_ResetBoundaryLookAndFeel ResetBoundaryLookAndFeel} */
	public static native int novr_ResetBoundaryLookAndFeel(long session);

	/**
	 * Resets the look and feel of the Boundary System to its default state.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static int ovr_ResetBoundaryLookAndFeel(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_ResetBoundaryLookAndFeel(session);
	}

	// --- [ ovr_GetBoundaryGeometry ] ---

	/** Unsafe version of: {@link #ovr_GetBoundaryGeometry GetBoundaryGeometry} */
	public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, long outFloorPointsCount);

	/**
	 * Gets the geometry of the Boundary System's "play area" or "outer boundary" as 3D floor points.
	 *
	 * @param session             an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param boundaryType        the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
	 * @param outFloorPoints      an array of 3D points (in clockwise order) defining the boundary at floor height (can be {@code NULL} to retrieve only the number of points)
	 * @param outFloorPointsCount the number of 3D points returned in the array
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
	 *         </ul>
	 */
	public static int ovr_GetBoundaryGeometry(long session, int boundaryType, OVRVector3f outFloorPoints, IntBuffer outFloorPointsCount) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), memAddressSafe(outFloorPointsCount));
	}

	// --- [ ovr_GetBoundaryDimensions ] ---

	/** Unsafe version of: {@link #ovr_GetBoundaryDimensions GetBoundaryDimensions} */
	public static native int novr_GetBoundaryDimensions(long session, int boundaryType, long outDimensions);

	/**
	 * Gets the dimension of the Boundary System's "play area" or "outer boundary".
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param boundaryType  the boundary type. One of:<br><table><tr><td>{@link #ovrBoundary_Outer Boundary_Outer}</td><td>{@link #ovrBoundary_PlayArea Boundary_PlayArea}</td></tr></table>
	 * @param outDimensions dimensions of the axis aligned bounding box that encloses the area in meters (width, height and length)
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
	 *         </ul>
	 */
	public static int ovr_GetBoundaryDimensions(long session, int boundaryType, OVRVector3f outDimensions) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetBoundaryDimensions(session, boundaryType, outDimensions.address());
	}

	// --- [ ovr_GetBoundaryVisible ] ---

	/** Unsafe version of: {@link #ovr_GetBoundaryVisible GetBoundaryVisible} */
	public static native int novr_GetBoundaryVisible(long session, long outIsVisible);

	/**
	 * Returns if the boundary is currently visible.
	 * 
	 * <p>Note: visibility is false if the user has turned off boundaries, otherwise, it's true if the app has requested boundaries to be visible or if any
	 * tracked device is currently triggering it. This may not exactly match rendering due to fade-in and fade-out effects.</p>
	 *
	 * @param session      an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param outIsVisible {@link #ovrTrue True}, if the boundary is visible
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success. Return values include but aren't limited to:
	 *         
	 *         <ul>
	 *         <li>{@link OVRErrorCode#ovrSuccess Success}: The call succeeded and a result was returned.</li>
	 *         <li>{@link OVRErrorCode#ovrSuccess_BoundaryInvalid Success_BoundaryInvalid}: The call succeeded but the result is not a valid boundary due to not being set up.</li>
	 *         </ul>
	 */
	public static int ovr_GetBoundaryVisible(long session, ByteBuffer outIsVisible) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetBoundaryVisible(session, memAddress(outIsVisible));
	}

	// --- [ ovr_RequestBoundaryVisible ] ---

	/** Unsafe version of: {@link #ovr_RequestBoundaryVisible RequestBoundaryVisible} */
	public static native int novr_RequestBoundaryVisible(long session, boolean visible);

	/**
	 * Requests boundary to be visible.
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param visible forces the outer boundary to be visible. An application can't force it to be invisible, but can cancel its request by passing false.
	 *
	 * @return {@link OVRErrorCode#ovrSuccess Success} upon success
	 */
	public static int ovr_RequestBoundaryVisible(long session, boolean visible) {
		if ( CHECKS )
			checkPointer(session);
		return novr_RequestBoundaryVisible(session, visible);
	}

	// --- [ ovr_GetTextureSwapChainLength ] ---

	/** Unsafe version of: {@link #ovr_GetTextureSwapChainLength GetTextureSwapChainLength} */
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

	/** Unsafe version of: {@link #ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex} */
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

	/** Unsafe version of: {@link #ovr_GetTextureSwapChainDesc GetTextureSwapChainDesc} */
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

	/** Unsafe version of: {@link #ovr_CommitTextureSwapChain CommitTextureSwapChain} */
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

	/** Unsafe version of: {@link #ovr_DestroyTextureSwapChain DestroyTextureSwapChain} */
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

	/** Unsafe version of: {@link #ovr_DestroyMirrorTexture DestroyMirrorTexture} */
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

	/** Unsafe version of: {@link #ovr_GetFovTextureSize GetFovTextureSize} */
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

	/** Unsafe version of: {@link #ovr_GetRenderDesc GetRenderDesc} */
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
	 * Unsafe version of: {@link #ovr_SubmitFrame SubmitFrame}
	 *
	 * @param layerCount the number of valid elements in {@code layerPtrList}. The maximum supported {@code layerCount} is not currently specified, but may be specified in
	 *                   a future version.
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
ovrResult result = ovr_SubmitFrame(session, frameIndex, nullptr, layers, 2);</code></pre>
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
		return novr_SubmitFrame(session, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
	}

	// --- [ ovr_GetPerfStats ] ---

	/** Unsafe version of: {@link #ovr_GetPerfStats GetPerfStats} */
	public static native int novr_GetPerfStats(long session, long outStats);

	/**
	 * Retrieves performance stats for the VR app as well as the SDK compositor.
	 * 
	 * <p>If the app calling this function is not the one in focus (i.e. not visible in the HMD), then {@code outStats} will be zero'd out. New stats are
	 * populated after each successive call to {@link #ovr_SubmitFrame SubmitFrame}. So the app should call this function on the same thread it calls {@link #ovr_SubmitFrame SubmitFrame}, preferably
	 * immediately afterwards.</p>
	 *
	 * @param session  an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 * @param outStats contains the performance stats for the application and SDK compositor
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success
	 */
	public static int ovr_GetPerfStats(long session, OVRPerfStats outStats) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetPerfStats(session, outStats.address());
	}

	// --- [ ovr_ResetPerfStats ] ---

	/** Unsafe version of: {@link #ovr_ResetPerfStats ResetPerfStats} */
	public static native int novr_ResetPerfStats(long session);

	/**
	 * Resets the accumulated stats reported in each {@link OVRPerfStatsPerCompositorFrame} back to zero.
	 * 
	 * <p>Only the integer values such as {@code HmdVsyncIndex}, {@code AppDroppedFrameCount} etc. will be reset as the other fields such as
	 * {@code AppMotionToPhotonLatency} are independent timing values updated per-frame.</p>
	 *
	 * @param session an {@code ovrSession} previously returned by {@link #ovr_Create Create}
	 *
	 * @return an {@code ovrResult} for which {@code OVR_SUCCESS(result)} is false upon error and true upon success
	 */
	public static int ovr_ResetPerfStats(long session) {
		if ( CHECKS )
			checkPointer(session);
		return novr_ResetPerfStats(session);
	}

	// --- [ ovr_GetPredictedDisplayTime ] ---

	/** Unsafe version of: {@link #ovr_GetPredictedDisplayTime GetPredictedDisplayTime} */
	public static native double novr_GetPredictedDisplayTime(long session, long frameIndex);

	/**
	 * Gets the time of the specified frame midpoint.
	 * 
	 * <p>Predicts the time at which the given frame will be displayed. The predicted time is the middle of the time period during which the corresponding eye
	 * images will be displayed.</p>
	 * 
	 * <p>The application should increment frameIndex for each successively targeted frame, and pass that index to any relevant OVR functions that need to apply
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

	/** Unsafe version of: {@link #ovr_GetBool GetBool} */
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

	/** Unsafe version of: {@link #ovr_SetBool SetBool} */
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

	/** Unsafe version of: {@link #ovr_GetInt GetInt} */
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

	/** Unsafe version of: {@link #ovr_SetInt SetInt} */
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

	/** Unsafe version of: {@link #ovr_GetFloat GetFloat} */
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

	/** Unsafe version of: {@link #ovr_SetFloat SetFloat} */
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
	 * Unsafe version of: {@link #ovr_GetFloatArray GetFloatArray}
	 *
	 * @param valuesCapacity the maximum number of elements to write to the values array
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
	 * Unsafe version of: {@link #ovr_SetFloatArray SetFloatArray}
	 *
	 * @param valuesSize the number of elements to write
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

	/** Unsafe version of: {@link #ovr_GetString GetString} */
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
			checkNT1Safe(defaultVal);
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

	/** Unsafe version of: {@link #ovr_SetString SetString} */
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

	/** Array version of: {@link #novr_GetBoundaryGeometry} */
	public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, int[] outFloorPointsCount);

	/** Array version of: {@link #ovr_GetBoundaryGeometry GetBoundaryGeometry} */
	public static int ovr_GetBoundaryGeometry(long session, int boundaryType, OVRVector3f outFloorPoints, int[] outFloorPointsCount) {
		if ( CHECKS )
			checkPointer(session);
		return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), outFloorPointsCount);
	}

	/** Array version of: {@link #novr_GetTextureSwapChainLength} */
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

	/** Array version of: {@link #novr_GetTextureSwapChainCurrentIndex} */
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

	/** Array version of: {@link #novr_GetFloatArray} */
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

	/** Array version of: {@link #novr_SetFloatArray} */
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