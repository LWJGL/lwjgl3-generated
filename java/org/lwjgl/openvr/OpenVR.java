/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.lwjgl.system.*;
import java.util.Set;
import java.nio.*;
import java.util.function.*;
import org.lwjgl.*;

import static org.lwjgl.openvr.VR.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The OpenVR function tables. */
public final class OpenVR {

	public static IVRSystem VRSystem;
	public static IVRApplications VRApplications;
	public static IVRChaperone VRChaperone;
	public static IVRChaperoneSetup VRChaperoneSetup;
	public static IVRCompositor VRCompositor;
	public static IVRExtendedDisplay VRExtendedDisplay;
	public static IVRNotifications VRNotifications;
	public static IVROverlay VROverlay;
	public static IVRRenderModels VRRenderModels;
	public static IVRResources VRResources;
	public static IVRScreenshots VRScreenshots;
	public static IVRSettings VRSettings;
	public static IVRTrackedCamera VRTrackedCamera;

	private static int token;

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_openvr");
		Library.loadSystem(System::load, System::loadLibrary, OpenVR.class, libName);
	}

	private OpenVR() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

	public static void create(int token) {
		OpenVR.token = token;

		VRSystem = getGenericInterface(IVRSystem_Version, IVRSystem::new);
		VRApplications = getGenericInterface(IVRApplications_Version, IVRApplications::new);
		VRChaperone = getGenericInterface(IVRChaperone_Version, IVRChaperone::new);
		VRChaperoneSetup = getGenericInterface(IVRChaperoneSetup_Version, IVRChaperoneSetup::new);
		VRCompositor = getGenericInterface(IVRCompositor_Version, IVRCompositor::new);
		VRExtendedDisplay = getGenericInterface(IVRExtendedDisplay_Version, IVRExtendedDisplay::new);
		VRNotifications = getGenericInterface(IVRNotifications_Version, IVRNotifications::new);
		VROverlay = getGenericInterface(IVROverlay_Version, IVROverlay::new);
		VRRenderModels = getGenericInterface(IVRRenderModels_Version, IVRRenderModels::new);
		VRResources = getGenericInterface(IVRResources_Version, IVRResources::new);
		VRScreenshots = getGenericInterface(IVRScreenshots_Version, IVRScreenshots::new);
		VRSettings = getGenericInterface(IVRSettings_Version, IVRSettings::new);
		VRTrackedCamera = getGenericInterface(IVRTrackedCamera_Version, IVRTrackedCamera::new);
	}

	private static <T> T getGenericInterface(String interfaceNameVersion, LongFunction<T> supplier) {
		try ( MemoryStack stack = stackPush() ) {
			IntBuffer peError = stack.mallocInt(1);
			long ivr = VR_GetGenericInterface("FnTable:" + interfaceNameVersion, peError);
			return ivr != NULL && peError.get(0) == EVRInitError_VRInitError_None ? supplier.apply(ivr) : null;
		}
	}

	public static void checkInitToken() {
		if ( token == 0 )
			throw new IllegalStateException("The OpenVR API must be initialized first.");

		int initToken = VR_GetInitToken();
		if ( token != initToken ) {
			destroy();
			create(initToken);
		}
	}

	public static void destroy() {
		token = 0;

		VRSystem = null;
		VRApplications = null;
		VRChaperone = null;
		VRChaperoneSetup = null;
		VRCompositor = null;
		VRExtendedDisplay = null;
		VRNotifications = null;
		VROverlay = null;
		VRRenderModels = null;
		VRResources = null;
		VRScreenshots = null;
		VRSettings = null;
		VRTrackedCamera = null;
	}

	public static final class IVRSystem {

		public final long
			GetRecommendedRenderTargetSize,
			GetProjectionMatrix,
			GetProjectionRaw,
			ComputeDistortion,
			GetEyeToHeadTransform,
			GetTimeSinceLastVsync,
			GetD3D9AdapterIndex,
			GetDXGIOutputInfo,
			IsDisplayOnDesktop,
			SetDisplayVisibility,
			GetDeviceToAbsoluteTrackingPose,
			ResetSeatedZeroPose,
			GetSeatedZeroPoseToStandingAbsoluteTrackingPose,
			GetRawZeroPoseToStandingAbsoluteTrackingPose,
			GetSortedTrackedDeviceIndicesOfClass,
			GetTrackedDeviceActivityLevel,
			ApplyTransform,
			GetTrackedDeviceIndexForControllerRole,
			GetControllerRoleForTrackedDeviceIndex,
			GetTrackedDeviceClass,
			IsTrackedDeviceConnected,
			GetBoolTrackedDeviceProperty,
			GetFloatTrackedDeviceProperty,
			GetInt32TrackedDeviceProperty,
			GetUint64TrackedDeviceProperty,
			GetMatrix34TrackedDeviceProperty,
			GetStringTrackedDeviceProperty,
			GetPropErrorNameFromEnum,
			PollNextEvent,
			PollNextEventWithPose,
			GetEventTypeNameFromEnum,
			GetHiddenAreaMesh,
			GetControllerState,
			GetControllerStateWithPose,
			TriggerHapticPulse,
			GetButtonIdNameFromEnum,
			GetControllerAxisTypeNameFromEnum,
			CaptureInputFocus,
			ReleaseInputFocus,
			IsInputFocusCapturedByAnotherProcess,
			DriverDebugRequest,
			PerformFirmwareUpdate,
			AcknowledgeQuit_Exiting,
			AcknowledgeQuit_UserPrompt;

		public IVRSystem(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 44);
			GetRecommendedRenderTargetSize = table.get(0);
			GetProjectionMatrix = table.get(1);
			GetProjectionRaw = table.get(2);
			ComputeDistortion = table.get(3);
			GetEyeToHeadTransform = table.get(4);
			GetTimeSinceLastVsync = table.get(5);
			GetD3D9AdapterIndex = table.get(6);
			GetDXGIOutputInfo = table.get(7);
			IsDisplayOnDesktop = table.get(8);
			SetDisplayVisibility = table.get(9);
			GetDeviceToAbsoluteTrackingPose = table.get(10);
			ResetSeatedZeroPose = table.get(11);
			GetSeatedZeroPoseToStandingAbsoluteTrackingPose = table.get(12);
			GetRawZeroPoseToStandingAbsoluteTrackingPose = table.get(13);
			GetSortedTrackedDeviceIndicesOfClass = table.get(14);
			GetTrackedDeviceActivityLevel = table.get(15);
			ApplyTransform = table.get(16);
			GetTrackedDeviceIndexForControllerRole = table.get(17);
			GetControllerRoleForTrackedDeviceIndex = table.get(18);
			GetTrackedDeviceClass = table.get(19);
			IsTrackedDeviceConnected = table.get(20);
			GetBoolTrackedDeviceProperty = table.get(21);
			GetFloatTrackedDeviceProperty = table.get(22);
			GetInt32TrackedDeviceProperty = table.get(23);
			GetUint64TrackedDeviceProperty = table.get(24);
			GetMatrix34TrackedDeviceProperty = table.get(25);
			GetStringTrackedDeviceProperty = table.get(26);
			GetPropErrorNameFromEnum = table.get(27);
			PollNextEvent = table.get(28);
			PollNextEventWithPose = table.get(29);
			GetEventTypeNameFromEnum = table.get(30);
			GetHiddenAreaMesh = table.get(31);
			GetControllerState = table.get(32);
			GetControllerStateWithPose = table.get(33);
			TriggerHapticPulse = table.get(34);
			GetButtonIdNameFromEnum = table.get(35);
			GetControllerAxisTypeNameFromEnum = table.get(36);
			CaptureInputFocus = table.get(37);
			ReleaseInputFocus = table.get(38);
			IsInputFocusCapturedByAnotherProcess = table.get(39);
			DriverDebugRequest = table.get(40);
			PerformFirmwareUpdate = table.get(41);
			AcknowledgeQuit_Exiting = table.get(42);
			AcknowledgeQuit_UserPrompt = table.get(43);
		}

	}

	public static final class IVRApplications {

		public final long
			AddApplicationManifest,
			RemoveApplicationManifest,
			IsApplicationInstalled,
			GetApplicationCount,
			GetApplicationKeyByIndex,
			GetApplicationKeyByProcessId,
			LaunchApplication,
			LaunchTemplateApplication,
			LaunchApplicationFromMimeType,
			LaunchDashboardOverlay,
			CancelApplicationLaunch,
			IdentifyApplication,
			GetApplicationProcessId,
			GetApplicationsErrorNameFromEnum,
			GetApplicationPropertyString,
			GetApplicationPropertyBool,
			GetApplicationPropertyUint64,
			SetApplicationAutoLaunch,
			GetApplicationAutoLaunch,
			SetDefaultApplicationForMimeType,
			GetDefaultApplicationForMimeType,
			GetApplicationSupportedMimeTypes,
			GetApplicationsThatSupportMimeType,
			GetApplicationLaunchArguments,
			GetStartingApplication,
			GetTransitionState,
			PerformApplicationPrelaunchCheck,
			GetApplicationsTransitionStateNameFromEnum,
			IsQuitUserPromptRequested,
			LaunchInternalProcess,
			GetCurrentSceneProcessId;

		public IVRApplications(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 31);
			AddApplicationManifest = table.get(0);
			RemoveApplicationManifest = table.get(1);
			IsApplicationInstalled = table.get(2);
			GetApplicationCount = table.get(3);
			GetApplicationKeyByIndex = table.get(4);
			GetApplicationKeyByProcessId = table.get(5);
			LaunchApplication = table.get(6);
			LaunchTemplateApplication = table.get(7);
			LaunchApplicationFromMimeType = table.get(8);
			LaunchDashboardOverlay = table.get(9);
			CancelApplicationLaunch = table.get(10);
			IdentifyApplication = table.get(11);
			GetApplicationProcessId = table.get(12);
			GetApplicationsErrorNameFromEnum = table.get(13);
			GetApplicationPropertyString = table.get(14);
			GetApplicationPropertyBool = table.get(15);
			GetApplicationPropertyUint64 = table.get(16);
			SetApplicationAutoLaunch = table.get(17);
			GetApplicationAutoLaunch = table.get(18);
			SetDefaultApplicationForMimeType = table.get(19);
			GetDefaultApplicationForMimeType = table.get(20);
			GetApplicationSupportedMimeTypes = table.get(21);
			GetApplicationsThatSupportMimeType = table.get(22);
			GetApplicationLaunchArguments = table.get(23);
			GetStartingApplication = table.get(24);
			GetTransitionState = table.get(25);
			PerformApplicationPrelaunchCheck = table.get(26);
			GetApplicationsTransitionStateNameFromEnum = table.get(27);
			IsQuitUserPromptRequested = table.get(28);
			LaunchInternalProcess = table.get(29);
			GetCurrentSceneProcessId = table.get(30);
		}

	}

	public static final class IVRChaperone {

		public final long
			GetCalibrationState,
			GetPlayAreaSize,
			GetPlayAreaRect,
			ReloadInfo,
			SetSceneColor,
			GetBoundsColor,
			AreBoundsVisible,
			ForceBoundsVisible;

		public IVRChaperone(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 8);
			GetCalibrationState = table.get(0);
			GetPlayAreaSize = table.get(1);
			GetPlayAreaRect = table.get(2);
			ReloadInfo = table.get(3);
			SetSceneColor = table.get(4);
			GetBoundsColor = table.get(5);
			AreBoundsVisible = table.get(6);
			ForceBoundsVisible = table.get(7);
		}

	}

	public static final class IVRChaperoneSetup {

		public final long
			CommitWorkingCopy,
			RevertWorkingCopy,
			GetWorkingPlayAreaSize,
			GetWorkingPlayAreaRect,
			GetWorkingCollisionBoundsInfo,
			GetLiveCollisionBoundsInfo,
			GetWorkingSeatedZeroPoseToRawTrackingPose,
			GetWorkingStandingZeroPoseToRawTrackingPose,
			SetWorkingPlayAreaSize,
			SetWorkingCollisionBoundsInfo,
			SetWorkingSeatedZeroPoseToRawTrackingPose,
			SetWorkingStandingZeroPoseToRawTrackingPose,
			ReloadFromDisk,
			GetLiveSeatedZeroPoseToRawTrackingPose,
			SetWorkingCollisionBoundsTagsInfo,
			GetLiveCollisionBoundsTagsInfo,
			SetWorkingPhysicalBoundsInfo,
			GetLivePhysicalBoundsInfo,
			ExportLiveToBuffer,
			ImportFromBufferToWorking;

		public IVRChaperoneSetup(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 20);
			CommitWorkingCopy = table.get(0);
			RevertWorkingCopy = table.get(1);
			GetWorkingPlayAreaSize = table.get(2);
			GetWorkingPlayAreaRect = table.get(3);
			GetWorkingCollisionBoundsInfo = table.get(4);
			GetLiveCollisionBoundsInfo = table.get(5);
			GetWorkingSeatedZeroPoseToRawTrackingPose = table.get(6);
			GetWorkingStandingZeroPoseToRawTrackingPose = table.get(7);
			SetWorkingPlayAreaSize = table.get(8);
			SetWorkingCollisionBoundsInfo = table.get(9);
			SetWorkingSeatedZeroPoseToRawTrackingPose = table.get(10);
			SetWorkingStandingZeroPoseToRawTrackingPose = table.get(11);
			ReloadFromDisk = table.get(12);
			GetLiveSeatedZeroPoseToRawTrackingPose = table.get(13);
			SetWorkingCollisionBoundsTagsInfo = table.get(14);
			GetLiveCollisionBoundsTagsInfo = table.get(15);
			SetWorkingPhysicalBoundsInfo = table.get(16);
			GetLivePhysicalBoundsInfo = table.get(17);
			ExportLiveToBuffer = table.get(18);
			ImportFromBufferToWorking = table.get(19);
		}

	}

	public static final class IVRCompositor {

		public final long
			SetTrackingSpace,
			GetTrackingSpace,
			WaitGetPoses,
			GetLastPoses,
			GetLastPoseForTrackedDeviceIndex,
			Submit,
			ClearLastSubmittedFrame,
			PostPresentHandoff,
			GetFrameTiming,
			GetFrameTimings,
			GetFrameTimeRemaining,
			GetCumulativeStats,
			FadeToColor,
			GetCurrentFadeColor,
			FadeGrid,
			GetCurrentGridAlpha,
			SetSkyboxOverride,
			ClearSkyboxOverride,
			CompositorBringToFront,
			CompositorGoToBack,
			CompositorQuit,
			IsFullscreen,
			GetCurrentSceneFocusProcess,
			GetLastFrameRenderer,
			CanRenderScene,
			ShowMirrorWindow,
			HideMirrorWindow,
			IsMirrorWindowVisible,
			CompositorDumpImages,
			ShouldAppRenderWithLowResources,
			ForceInterleavedReprojectionOn,
			ForceReconnectProcess,
			SuspendRendering,
			GetMirrorTextureD3D11,
			ReleaseMirrorTextureD3D11,
			GetMirrorTextureGL,
			ReleaseSharedGLTexture,
			LockGLSharedTextureForAccess,
			UnlockGLSharedTextureForAccess,
			GetVulkanInstanceExtensionsRequired,
			GetVulkanDeviceExtensionsRequired;

		public IVRCompositor(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 41);
			SetTrackingSpace = table.get(0);
			GetTrackingSpace = table.get(1);
			WaitGetPoses = table.get(2);
			GetLastPoses = table.get(3);
			GetLastPoseForTrackedDeviceIndex = table.get(4);
			Submit = table.get(5);
			ClearLastSubmittedFrame = table.get(6);
			PostPresentHandoff = table.get(7);
			GetFrameTiming = table.get(8);
			GetFrameTimings = table.get(9);
			GetFrameTimeRemaining = table.get(10);
			GetCumulativeStats = table.get(11);
			FadeToColor = table.get(12);
			GetCurrentFadeColor = table.get(13);
			FadeGrid = table.get(14);
			GetCurrentGridAlpha = table.get(15);
			SetSkyboxOverride = table.get(16);
			ClearSkyboxOverride = table.get(17);
			CompositorBringToFront = table.get(18);
			CompositorGoToBack = table.get(19);
			CompositorQuit = table.get(20);
			IsFullscreen = table.get(21);
			GetCurrentSceneFocusProcess = table.get(22);
			GetLastFrameRenderer = table.get(23);
			CanRenderScene = table.get(24);
			ShowMirrorWindow = table.get(25);
			HideMirrorWindow = table.get(26);
			IsMirrorWindowVisible = table.get(27);
			CompositorDumpImages = table.get(28);
			ShouldAppRenderWithLowResources = table.get(29);
			ForceInterleavedReprojectionOn = table.get(30);
			ForceReconnectProcess = table.get(31);
			SuspendRendering = table.get(32);
			GetMirrorTextureD3D11 = table.get(33);
			ReleaseMirrorTextureD3D11 = table.get(34);
			GetMirrorTextureGL = table.get(35);
			ReleaseSharedGLTexture = table.get(36);
			LockGLSharedTextureForAccess = table.get(37);
			UnlockGLSharedTextureForAccess = table.get(38);
			GetVulkanInstanceExtensionsRequired = table.get(39);
			GetVulkanDeviceExtensionsRequired = table.get(40);
		}

	}

	public static final class IVRExtendedDisplay {

		public final long
			GetWindowBounds,
			GetEyeOutputViewport,
			GetDXGIOutputInfo;

		public IVRExtendedDisplay(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 3);
			GetWindowBounds = table.get(0);
			GetEyeOutputViewport = table.get(1);
			GetDXGIOutputInfo = table.get(2);
		}

	}

	public static final class IVRNotifications {

		public final long
			CreateNotification,
			RemoveNotification;

		public IVRNotifications(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 2);
			CreateNotification = table.get(0);
			RemoveNotification = table.get(1);
		}

	}

	public static final class IVROverlay {

		public final long
			FindOverlay,
			CreateOverlay,
			DestroyOverlay,
			SetHighQualityOverlay,
			GetHighQualityOverlay,
			GetOverlayKey,
			GetOverlayName,
			SetOverlayName,
			GetOverlayImageData,
			GetOverlayErrorNameFromEnum,
			SetOverlayRenderingPid,
			GetOverlayRenderingPid,
			SetOverlayFlag,
			GetOverlayFlag,
			SetOverlayColor,
			GetOverlayColor,
			SetOverlayAlpha,
			GetOverlayAlpha,
			SetOverlayTexelAspect,
			GetOverlayTexelAspect,
			SetOverlaySortOrder,
			GetOverlaySortOrder,
			SetOverlayWidthInMeters,
			GetOverlayWidthInMeters,
			SetOverlayAutoCurveDistanceRangeInMeters,
			GetOverlayAutoCurveDistanceRangeInMeters,
			SetOverlayTextureColorSpace,
			GetOverlayTextureColorSpace,
			SetOverlayTextureBounds,
			GetOverlayTextureBounds,
			GetOverlayRenderModel,
			SetOverlayRenderModel,
			GetOverlayTransformType,
			SetOverlayTransformAbsolute,
			GetOverlayTransformAbsolute,
			SetOverlayTransformTrackedDeviceRelative,
			GetOverlayTransformTrackedDeviceRelative,
			SetOverlayTransformTrackedDeviceComponent,
			GetOverlayTransformTrackedDeviceComponent,
			GetOverlayTransformOverlayRelative,
			SetOverlayTransformOverlayRelative,
			ShowOverlay,
			HideOverlay,
			IsOverlayVisible,
			GetTransformForOverlayCoordinates,
			PollNextOverlayEvent,
			GetOverlayInputMethod,
			SetOverlayInputMethod,
			GetOverlayMouseScale,
			SetOverlayMouseScale,
			ComputeOverlayIntersection,
			HandleControllerOverlayInteractionAsMouse,
			IsHoverTargetOverlay,
			GetGamepadFocusOverlay,
			SetGamepadFocusOverlay,
			SetOverlayNeighbor,
			MoveGamepadFocusToNeighbor,
			SetOverlayTexture,
			ClearOverlayTexture,
			SetOverlayRaw,
			SetOverlayFromFile,
			GetOverlayTexture,
			ReleaseNativeOverlayHandle,
			GetOverlayTextureSize,
			CreateDashboardOverlay,
			IsDashboardVisible,
			IsActiveDashboardOverlay,
			SetDashboardOverlaySceneProcess,
			GetDashboardOverlaySceneProcess,
			ShowDashboard,
			GetPrimaryDashboardDevice,
			ShowKeyboard,
			ShowKeyboardForOverlay,
			GetKeyboardText,
			HideKeyboard,
			SetKeyboardTransformAbsolute,
			SetKeyboardPositionForOverlay,
			SetOverlayIntersectionMask,
			GetOverlayFlags,
			ShowMessageOverlay;

		public IVROverlay(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 80);
			FindOverlay = table.get(0);
			CreateOverlay = table.get(1);
			DestroyOverlay = table.get(2);
			SetHighQualityOverlay = table.get(3);
			GetHighQualityOverlay = table.get(4);
			GetOverlayKey = table.get(5);
			GetOverlayName = table.get(6);
			SetOverlayName = table.get(7);
			GetOverlayImageData = table.get(8);
			GetOverlayErrorNameFromEnum = table.get(9);
			SetOverlayRenderingPid = table.get(10);
			GetOverlayRenderingPid = table.get(11);
			SetOverlayFlag = table.get(12);
			GetOverlayFlag = table.get(13);
			SetOverlayColor = table.get(14);
			GetOverlayColor = table.get(15);
			SetOverlayAlpha = table.get(16);
			GetOverlayAlpha = table.get(17);
			SetOverlayTexelAspect = table.get(18);
			GetOverlayTexelAspect = table.get(19);
			SetOverlaySortOrder = table.get(20);
			GetOverlaySortOrder = table.get(21);
			SetOverlayWidthInMeters = table.get(22);
			GetOverlayWidthInMeters = table.get(23);
			SetOverlayAutoCurveDistanceRangeInMeters = table.get(24);
			GetOverlayAutoCurveDistanceRangeInMeters = table.get(25);
			SetOverlayTextureColorSpace = table.get(26);
			GetOverlayTextureColorSpace = table.get(27);
			SetOverlayTextureBounds = table.get(28);
			GetOverlayTextureBounds = table.get(29);
			GetOverlayRenderModel = table.get(30);
			SetOverlayRenderModel = table.get(31);
			GetOverlayTransformType = table.get(32);
			SetOverlayTransformAbsolute = table.get(33);
			GetOverlayTransformAbsolute = table.get(34);
			SetOverlayTransformTrackedDeviceRelative = table.get(35);
			GetOverlayTransformTrackedDeviceRelative = table.get(36);
			SetOverlayTransformTrackedDeviceComponent = table.get(37);
			GetOverlayTransformTrackedDeviceComponent = table.get(38);
			GetOverlayTransformOverlayRelative = table.get(39);
			SetOverlayTransformOverlayRelative = table.get(40);
			ShowOverlay = table.get(41);
			HideOverlay = table.get(42);
			IsOverlayVisible = table.get(43);
			GetTransformForOverlayCoordinates = table.get(44);
			PollNextOverlayEvent = table.get(45);
			GetOverlayInputMethod = table.get(46);
			SetOverlayInputMethod = table.get(47);
			GetOverlayMouseScale = table.get(48);
			SetOverlayMouseScale = table.get(49);
			ComputeOverlayIntersection = table.get(50);
			HandleControllerOverlayInteractionAsMouse = table.get(51);
			IsHoverTargetOverlay = table.get(52);
			GetGamepadFocusOverlay = table.get(53);
			SetGamepadFocusOverlay = table.get(54);
			SetOverlayNeighbor = table.get(55);
			MoveGamepadFocusToNeighbor = table.get(56);
			SetOverlayTexture = table.get(57);
			ClearOverlayTexture = table.get(58);
			SetOverlayRaw = table.get(59);
			SetOverlayFromFile = table.get(60);
			GetOverlayTexture = table.get(61);
			ReleaseNativeOverlayHandle = table.get(62);
			GetOverlayTextureSize = table.get(63);
			CreateDashboardOverlay = table.get(64);
			IsDashboardVisible = table.get(65);
			IsActiveDashboardOverlay = table.get(66);
			SetDashboardOverlaySceneProcess = table.get(67);
			GetDashboardOverlaySceneProcess = table.get(68);
			ShowDashboard = table.get(69);
			GetPrimaryDashboardDevice = table.get(70);
			ShowKeyboard = table.get(71);
			ShowKeyboardForOverlay = table.get(72);
			GetKeyboardText = table.get(73);
			HideKeyboard = table.get(74);
			SetKeyboardTransformAbsolute = table.get(75);
			SetKeyboardPositionForOverlay = table.get(76);
			SetOverlayIntersectionMask = table.get(77);
			GetOverlayFlags = table.get(78);
			ShowMessageOverlay = table.get(79);
		}

	}

	public static final class IVRRenderModels {

		public final long
			LoadRenderModel_Async,
			FreeRenderModel,
			LoadTexture_Async,
			FreeTexture,
			LoadTextureD3D11_Async,
			LoadIntoTextureD3D11_Async,
			FreeTextureD3D11,
			GetRenderModelName,
			GetRenderModelCount,
			GetComponentCount,
			GetComponentName,
			GetComponentButtonMask,
			GetComponentRenderModelName,
			GetComponentState,
			RenderModelHasComponent,
			GetRenderModelThumbnailURL,
			GetRenderModelOriginalPath,
			GetRenderModelErrorNameFromEnum;

		public IVRRenderModels(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 18);
			LoadRenderModel_Async = table.get(0);
			FreeRenderModel = table.get(1);
			LoadTexture_Async = table.get(2);
			FreeTexture = table.get(3);
			LoadTextureD3D11_Async = table.get(4);
			LoadIntoTextureD3D11_Async = table.get(5);
			FreeTextureD3D11 = table.get(6);
			GetRenderModelName = table.get(7);
			GetRenderModelCount = table.get(8);
			GetComponentCount = table.get(9);
			GetComponentName = table.get(10);
			GetComponentButtonMask = table.get(11);
			GetComponentRenderModelName = table.get(12);
			GetComponentState = table.get(13);
			RenderModelHasComponent = table.get(14);
			GetRenderModelThumbnailURL = table.get(15);
			GetRenderModelOriginalPath = table.get(16);
			GetRenderModelErrorNameFromEnum = table.get(17);
		}

	}

	public static final class IVRResources {

		public final long
			LoadSharedResource,
			GetResourceFullPath;

		public IVRResources(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 2);
			LoadSharedResource = table.get(0);
			GetResourceFullPath = table.get(1);
		}

	}

	public static final class IVRScreenshots {

		public final long
			RequestScreenshot,
			HookScreenshot,
			GetScreenshotPropertyType,
			GetScreenshotPropertyFilename,
			UpdateScreenshotProgress,
			TakeStereoScreenshot,
			SubmitScreenshot;

		public IVRScreenshots(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 7);
			RequestScreenshot = table.get(0);
			HookScreenshot = table.get(1);
			GetScreenshotPropertyType = table.get(2);
			GetScreenshotPropertyFilename = table.get(3);
			UpdateScreenshotProgress = table.get(4);
			TakeStereoScreenshot = table.get(5);
			SubmitScreenshot = table.get(6);
		}

	}

	public static final class IVRSettings {

		public final long
			GetSettingsErrorNameFromEnum,
			Sync,
			SetBool,
			SetInt32,
			SetFloat,
			SetString,
			GetBool,
			GetInt32,
			GetFloat,
			GetString,
			RemoveSection,
			RemoveKeyInSection;

		public IVRSettings(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 12);
			GetSettingsErrorNameFromEnum = table.get(0);
			Sync = table.get(1);
			SetBool = table.get(2);
			SetInt32 = table.get(3);
			SetFloat = table.get(4);
			SetString = table.get(5);
			GetBool = table.get(6);
			GetInt32 = table.get(7);
			GetFloat = table.get(8);
			GetString = table.get(9);
			RemoveSection = table.get(10);
			RemoveKeyInSection = table.get(11);
		}

	}

	public static final class IVRTrackedCamera {

		public final long
			GetCameraErrorNameFromEnum,
			HasCamera,
			GetCameraFrameSize,
			GetCameraIntrinsics,
			GetCameraProjection,
			AcquireVideoStreamingService,
			ReleaseVideoStreamingService,
			GetVideoStreamFrameBuffer,
			GetVideoStreamTextureSize,
			GetVideoStreamTextureD3D11,
			GetVideoStreamTextureGL,
			ReleaseVideoStreamTextureGL;

		public IVRTrackedCamera(long tableAddress) {
			PointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, 12);
			GetCameraErrorNameFromEnum = table.get(0);
			HasCamera = table.get(1);
			GetCameraFrameSize = table.get(2);
			GetCameraIntrinsics = table.get(3);
			GetCameraProjection = table.get(4);
			AcquireVideoStreamingService = table.get(5);
			ReleaseVideoStreamingService = table.get(6);
			GetVideoStreamFrameBuffer = table.get(7);
			GetVideoStreamTextureSize = table.get(8);
			GetVideoStreamTextureD3D11 = table.get(9);
			GetVideoStreamTextureGL = table.get(10);
			ReleaseVideoStreamTextureGL = table.get(11);
		}

	}

}