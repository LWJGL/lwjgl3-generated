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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code prop} &ndash; one of:<br><table><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Invalid}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingSystemName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModelNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SerialNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RenderModelName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ManufacturerName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VRCVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RadioVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DongleVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceClass_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasCamera_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ParentDriver_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFrequency_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserIpdMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IsOnDesktop_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidVendorID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageRight_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidProductID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCImage_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UsesDriverDirectMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AttachedDeviceId_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SupportedButtons_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis0Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis1Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis2Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis3Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis4Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModeLabel_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IconPathName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserConfigPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_InstallPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Property_t {
    PropertyContainerHandle_t container;
    ETrackedDeviceProperty prop;
}</code></pre>
 */
public class VREventProperty extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CONTAINER,
		PROP;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CONTAINER = layout.offsetof(0);
		PROP = layout.offsetof(1);
	}

	VREventProperty(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventProperty(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code container} field. */
	public long container() { return ncontainer(address()); }
	/** Returns the value of the {@code prop} field. */
	public int prop() { return nprop(address()); }

	/** Sets the specified value to the {@code container} field. */
	public VREventProperty container(long value) { ncontainer(address(), value); return this; }
	/** Sets the specified value to the {@code prop} field. */
	public VREventProperty prop(int value) { nprop(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VREventProperty set(
		long container,
		int prop
	) {
		container(container);
		prop(prop);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventProperty set(VREventProperty src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventProperty} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventProperty malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventProperty} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventProperty calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventProperty} instance allocated with {@link BufferUtils}. */
	public static VREventProperty create() {
		return new VREventProperty(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventProperty} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventProperty create(long address) {
		return address == NULL ? null : new VREventProperty(address, null);
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventProperty.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventProperty} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventProperty mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventProperty} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventProperty callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventProperty} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventProperty mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventProperty} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventProperty callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventProperty.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #container}. */
	public static long ncontainer(long struct) { return memGetLong(struct + VREventProperty.CONTAINER); }
	/** Unsafe version of {@link #prop}. */
	public static int nprop(long struct) { return memGetInt(struct + VREventProperty.PROP); }

	/** Unsafe version of {@link #container(long) container}. */
	public static void ncontainer(long struct, long value) { memPutLong(struct + VREventProperty.CONTAINER, value); }
	/** Unsafe version of {@link #prop(int) prop}. */
	public static void nprop(long struct, int value) { memPutInt(struct + VREventProperty.PROP, value); }

	// -----------------------------------

	/** An array of {@link VREventProperty} structs. */
	public static class Buffer extends StructBuffer<VREventProperty, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventProperty.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventProperty#SIZEOF}, and its mark will be undefined.
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
		protected VREventProperty newInstance(long address) {
			return new VREventProperty(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code container} field. */
		public long container() { return VREventProperty.ncontainer(address()); }
		/** Returns the value of the {@code prop} field. */
		public int prop() { return VREventProperty.nprop(address()); }

		/** Sets the specified value to the {@code container} field. */
		public VREventProperty.Buffer container(long value) { VREventProperty.ncontainer(address(), value); return this; }
		/** Sets the specified value to the {@code prop} field. */
		public VREventProperty.Buffer prop(int value) { VREventProperty.nprop(address(), value); return this; }

	}

}