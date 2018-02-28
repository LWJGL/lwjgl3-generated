/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code prop} &ndash; one of:<br><table><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Invalid}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingSystemName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModelNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SerialNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RenderModelName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ManufacturerName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VRCVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RadioVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DongleVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceClass_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasCamera_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ParentDriver_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ResourceRoot_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RegisteredDeviceType_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_InputProfilePath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NeverTracked_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFrequency_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserIpdMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IsOnDesktop_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidVendorID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageRight_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidProductID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCImage_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DistortionMeshResolution_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_MinimumIpdStepMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AudioBridgeFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImageBridgeFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AttachedDeviceId_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SupportedButtons_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis0Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis1Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis2Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis3Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis4Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModeLabel_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IconPathName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ParentContainer}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserConfigPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_InstallPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasControllerComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasCameraComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerType_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LegacyInputProfile_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Property_t {
 *     PropertyContainerHandle_t container;
 *     ETrackedDeviceProperty prop;
 * }</pre></code>
 */
@NativeType("struct VREvent_Property_t")
public class VREventProperty extends Struct {

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

    VREventProperty(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventProperty(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code container} field. */
    @NativeType("PropertyContainerHandle_t")
    public long container() { return ncontainer(address()); }
    /** Returns the value of the {@code prop} field. */
    @NativeType("ETrackedDeviceProperty")
    public int prop() { return nprop(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventProperty} instance for the specified memory address. */
    public static VREventProperty create(long address) {
        return new VREventProperty(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProperty createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventProperty.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProperty.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #container}. */
    public static long ncontainer(long struct) { return memGetLong(struct + VREventProperty.CONTAINER); }
    /** Unsafe version of {@link #prop}. */
    public static int nprop(long struct) { return memGetInt(struct + VREventProperty.PROP); }

    // -----------------------------------

    /** An array of {@link VREventProperty} structs. */
    public static class Buffer extends StructBuffer<VREventProperty, Buffer> {

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

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventProperty newInstance(long address) {
            return new VREventProperty(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code container} field. */
        @NativeType("PropertyContainerHandle_t")
        public long container() { return VREventProperty.ncontainer(address()); }
        /** Returns the value of the {@code prop} field. */
        @NativeType("ETrackedDeviceProperty")
        public int prop() { return VREventProperty.nprop(address()); }

    }

}