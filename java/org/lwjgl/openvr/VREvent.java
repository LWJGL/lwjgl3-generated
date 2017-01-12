/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An event posted by the server to all running applications.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code eventType} &ndash; the type of the event. One of:<br><table><tr><td>{@link VR#EVREventType_VREvent_None}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionEnded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_IpdChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnterStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LeaveStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceRoleChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WatchdogWakeUpRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LensDistortionChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonPress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUnpress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonTouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUntouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonDown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonUp}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusEnter}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusLeave}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Scroll}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TouchPadMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusCaptured}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusReleased}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusLost}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusGained}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardThumbSelected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ResetDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RenderToast}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageLoaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusGained}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusLost}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlaySharedTextureChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardGuideButtonDown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardGuideButtonUp}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTriggered}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardOverlayCreated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RequestScreenshot}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTaken}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SubmitScreenshotToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotProgressToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Shown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Hidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_BeginInteraction}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Destroyed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Quit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_QuitAborted_UserPrompt}</td></tr><tr><td>{@link VR#EVREventType_VREvent_QuitAcknowledged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DriverRequestedQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneUniverseHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneTempDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SeatedZeroPoseReset}</td></tr><tr><td>{@link VR#EVREventType_VREvent_AudioSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_BackgroundSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_CameraSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ReprojectionSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ModelSkinSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnvironmentSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PowerSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_StatusUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MCImageUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateFinished}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardCharInput}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardDone}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionAborted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionNewAppStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationListUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationMimeTypeLoad}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_MirrorWindowShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_MirrorWindowHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StartVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StopVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_PauseVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_ResumeVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_EditingSurface}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_EnableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_DisableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_FidelityLevel}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MessageOverlay_Closed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_End}</td></tr></table></li>
 * <li>{@code trackedDeviceIndex} &ndash; the tracked device index of the event. For events that aren't connected to a tracked device this is {@link VR#k_unTrackedDeviceIndexInvalid}.</li>
 * <li>{@code eventAgeSeconds} &ndash; the age of the event in seconds</li>
 * <li>{@code data} &ndash; 
 * more information about the event. This is a union of several structs. See the event type enum for information about which union member to look at for
 * each event.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_t {
    uint32_t eventType;
    TrackedDeviceIndex_t trackedDeviceIndex;
    float eventAgeSeconds;
    {@link VREventData VREvent_Data_t} data;
}</code></pre>
 */
public class VREvent extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		EVENTTYPE,
		TRACKEDDEVICEINDEX,
		EVENTAGESECONDS,
		DATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(VREventData.SIZEOF, VREventData.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		EVENTTYPE = layout.offsetof(0);
		TRACKEDDEVICEINDEX = layout.offsetof(1);
		EVENTAGESECONDS = layout.offsetof(2);
		DATA = layout.offsetof(3);
	}

	VREvent(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREvent(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code eventType} field. */
	public int eventType() { return neventType(address()); }
	/** Returns the value of the {@code trackedDeviceIndex} field. */
	public int trackedDeviceIndex() { return ntrackedDeviceIndex(address()); }
	/** Returns the value of the {@code eventAgeSeconds} field. */
	public float eventAgeSeconds() { return neventAgeSeconds(address()); }
	/** Returns a {@link VREventData} view of the {@code data} field. */
	public VREventData data() { return ndata(address()); }

	/** Sets the specified value to the {@code eventType} field. */
	public VREvent eventType(int value) { neventType(address(), value); return this; }
	/** Sets the specified value to the {@code trackedDeviceIndex} field. */
	public VREvent trackedDeviceIndex(int value) { ntrackedDeviceIndex(address(), value); return this; }
	/** Sets the specified value to the {@code eventAgeSeconds} field. */
	public VREvent eventAgeSeconds(float value) { neventAgeSeconds(address(), value); return this; }
	/** Copies the specified {@link VREventData} to the {@code data} field. */
	public VREvent data(VREventData value) { ndata(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VREvent set(
		int eventType,
		int trackedDeviceIndex,
		float eventAgeSeconds,
		VREventData data
	) {
		eventType(eventType);
		trackedDeviceIndex(trackedDeviceIndex);
		eventAgeSeconds(eventAgeSeconds);
		data(data);

		return this;
	}

	/** Unsafe version of {@link #set(VREvent) set}. */
	public VREvent nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREvent set(VREvent src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VREvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREvent malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREvent calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREvent} instance allocated with {@link BufferUtils}. */
	public static VREvent create() {
		return new VREvent(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREvent} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREvent create(long address) {
		return address == NULL ? null : new VREvent(address, null);
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREvent.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREvent} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREvent mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREvent callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREvent} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREvent mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREvent callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #eventType}. */
	public static int neventType(long struct) { return memGetInt(struct + VREvent.EVENTTYPE); }
	/** Unsafe version of {@link #trackedDeviceIndex}. */
	public static int ntrackedDeviceIndex(long struct) { return memGetInt(struct + VREvent.TRACKEDDEVICEINDEX); }
	/** Unsafe version of {@link #eventAgeSeconds}. */
	public static float neventAgeSeconds(long struct) { return memGetFloat(struct + VREvent.EVENTAGESECONDS); }
	/** Unsafe version of {@link #data}. */
	public static VREventData ndata(long struct) { return VREventData.create(struct + VREvent.DATA); }

	/** Unsafe version of {@link #eventType(int) eventType}. */
	public static void neventType(long struct, int value) { memPutInt(struct + VREvent.EVENTTYPE, value); }
	/** Unsafe version of {@link #trackedDeviceIndex(int) trackedDeviceIndex}. */
	public static void ntrackedDeviceIndex(long struct, int value) { memPutInt(struct + VREvent.TRACKEDDEVICEINDEX, value); }
	/** Unsafe version of {@link #eventAgeSeconds(float) eventAgeSeconds}. */
	public static void neventAgeSeconds(long struct, float value) { memPutFloat(struct + VREvent.EVENTAGESECONDS, value); }
	/** Unsafe version of {@link #data(VREventData) data}. */
	public static void ndata(long struct, VREventData value) { memCopy(value.address(), struct + VREvent.DATA, VREventData.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VREvent} structs. */
	public static class Buffer extends StructBuffer<VREvent, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREvent.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREvent#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected VREvent newInstance(long address) {
			return new VREvent(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code eventType} field. */
		public int eventType() { return VREvent.neventType(address()); }
		/** Returns the value of the {@code trackedDeviceIndex} field. */
		public int trackedDeviceIndex() { return VREvent.ntrackedDeviceIndex(address()); }
		/** Returns the value of the {@code eventAgeSeconds} field. */
		public float eventAgeSeconds() { return VREvent.neventAgeSeconds(address()); }
		/** Returns a {@link VREventData} view of the {@code data} field. */
		public VREventData data() { return VREvent.ndata(address()); }

		/** Sets the specified value to the {@code eventType} field. */
		public VREvent.Buffer eventType(int value) { VREvent.neventType(address(), value); return this; }
		/** Sets the specified value to the {@code trackedDeviceIndex} field. */
		public VREvent.Buffer trackedDeviceIndex(int value) { VREvent.ntrackedDeviceIndex(address(), value); return this; }
		/** Sets the specified value to the {@code eventAgeSeconds} field. */
		public VREvent.Buffer eventAgeSeconds(float value) { VREvent.neventAgeSeconds(address(), value); return this; }
		/** Copies the specified {@link VREventData} to the {@code data} field. */
		public VREvent.Buffer data(VREventData value) { VREvent.ndata(address(), value); return this; }

	}

}