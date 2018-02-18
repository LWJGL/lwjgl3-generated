/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * A complete descriptor of the HMD.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Type} &ndash; this HMD's type. One of:<br><table><tr><td>{@link OVR#ovrHmd_None Hmd_None}</td><td>{@link OVR#ovrHmd_DK1 Hmd_DK1}</td><td>{@link OVR#ovrHmd_DKHD Hmd_DKHD}</td><td>{@link OVR#ovrHmd_DK2 Hmd_DK2}</td><td>{@link OVR#ovrHmd_CB Hmd_CB}</td><td>{@link OVR#ovrHmd_Other Hmd_Other}</td><td>{@link OVR#ovrHmd_E3_2015 Hmd_E3_2015}</td><td>{@link OVR#ovrHmd_ES06 Hmd_ES06}</td><td>{@link OVR#ovrHmd_ES09 Hmd_ES09}</td><td>{@link OVR#ovrHmd_ES11 Hmd_ES11}</td></tr><tr><td>{@link OVR#ovrHmd_CV1 Hmd_CV1}</td></tr></table></li>
 * <li>{@code ProductName} &ndash; name string describing the product: "Oculus Rift DK1", etc.</li>
 * <li>{@code Manufacturer} &ndash; string describing the manufacturer. Usually "Oculus".</li>
 * <li>{@code VendorId} &ndash; HID Vendor ID of the device</li>
 * <li>{@code ProductId} &ndash; HID Product ID of the device</li>
 * <li>{@code SerialNumber} &ndash; HMD serial number</li>
 * <li>{@code FirmwareMajor} &ndash; HMD firmware major version number</li>
 * <li>{@code FirmwareMinor} &ndash; HMD firmware minor version number</li>
 * <li>{@code AvailableHmdCaps} &ndash; available {@code ovrHmdCaps} bits</li>
 * <li>{@code DefaultHmdCaps} &ndash; default {@code ovrHmdCaps} bits</li>
 * <li>{@code AvailableTrackingCaps} &ndash; available {@code ovrTrackingCaps} bits</li>
 * <li>{@code DefaultTrackingCaps} &ndash; default {@code ovrTrackingCaps} bits</li>
 * <li>{@code DefaultEyeFov} &ndash; the recommended optical FOV for the HMD</li>
 * <li>{@code MaxEyeFov} &ndash; the maximum optical FOV for the HMD</li>
 * <li>{@code Resolution} &ndash; resolution of the full HMD screen (both eyes) in pixels</li>
 * <li>{@code DisplayRefreshRate} &ndash; refresh rate of the display in cycles per second at the time of HMD creation</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrHmdDesc {
 *     ovrHmdType Type;
 *     char[4];
 *     char ProductName[64];
 *     char Manufacturer[64];
 *     short VendorId;
 *     short ProductId;
 *     char SerialNumber[24];
 *     short FirmwareMajor;
 *     short FirmwareMinor;
 *     unsigned int AvailableHmdCaps;
 *     unsigned int DefaultHmdCaps;
 *     unsigned int AvailableTrackingCaps;
 *     unsigned int DefaultTrackingCaps;
 *     {@link OVRFovPort ovrFovPort} DefaultEyeFov[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} MaxEyeFov[ovrEye_Count];
 *     {@link OVRSizei ovrSizei} Resolution;
 *     float DisplayRefreshRate;
 *     char[4];
 * }</pre></code>
 */
@NativeType("struct ovrHmdDesc")
public class OVRHmdDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        PRODUCTNAME,
        MANUFACTURER,
        VENDORID,
        PRODUCTID,
        SERIALNUMBER,
        FIRMWAREMAJOR,
        FIRMWAREMINOR,
        AVAILABLEHMDCAPS,
        DEFAULTHMDCAPS,
        AVAILABLETRACKINGCAPS,
        DEFAULTTRACKINGCAPS,
        DEFAULTEYEFOV,
        MAXEYEFOV,
        RESOLUTION,
        DISPLAYREFRESHRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __padding(4, Pointer.BITS64),
            __array(1, 64),
            __array(1, 64),
            __member(2),
            __member(2),
            __array(1, 24),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __member(OVRSizei.SIZEOF, OVRSizei.ALIGNOF),
            __member(4),
            __padding(4, Pointer.BITS64)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        PRODUCTNAME = layout.offsetof(2);
        MANUFACTURER = layout.offsetof(3);
        VENDORID = layout.offsetof(4);
        PRODUCTID = layout.offsetof(5);
        SERIALNUMBER = layout.offsetof(6);
        FIRMWAREMAJOR = layout.offsetof(7);
        FIRMWAREMINOR = layout.offsetof(8);
        AVAILABLEHMDCAPS = layout.offsetof(9);
        DEFAULTHMDCAPS = layout.offsetof(10);
        AVAILABLETRACKINGCAPS = layout.offsetof(11);
        DEFAULTTRACKINGCAPS = layout.offsetof(12);
        DEFAULTEYEFOV = layout.offsetof(13);
        MAXEYEFOV = layout.offsetof(14);
        RESOLUTION = layout.offsetof(15);
        DISPLAYREFRESHRATE = layout.offsetof(16);
    }

    OVRHmdDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRHmdDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHmdDesc(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Type} field. */
    @NativeType("ovrHmdType")
    public int Type() { return nType(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code ProductName} field. */
    @NativeType("char[64]")
    public ByteBuffer ProductName() { return nProductName(address()); }
    /** Decodes the null-terminated string stored in the {@code ProductName} field. */
    @NativeType("char[64]")
    public String ProductNameString() { return nProductNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code Manufacturer} field. */
    @NativeType("char[64]")
    public ByteBuffer Manufacturer() { return nManufacturer(address()); }
    /** Decodes the null-terminated string stored in the {@code Manufacturer} field. */
    @NativeType("char[64]")
    public String ManufacturerString() { return nManufacturerString(address()); }
    /** Returns the value of the {@code VendorId} field. */
    public short VendorId() { return nVendorId(address()); }
    /** Returns the value of the {@code ProductId} field. */
    public short ProductId() { return nProductId(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code SerialNumber} field. */
    @NativeType("char[24]")
    public ByteBuffer SerialNumber() { return nSerialNumber(address()); }
    /** Decodes the null-terminated string stored in the {@code SerialNumber} field. */
    @NativeType("char[24]")
    public String SerialNumberString() { return nSerialNumberString(address()); }
    /** Returns the value of the {@code FirmwareMajor} field. */
    public short FirmwareMajor() { return nFirmwareMajor(address()); }
    /** Returns the value of the {@code FirmwareMinor} field. */
    public short FirmwareMinor() { return nFirmwareMinor(address()); }
    /** Returns the value of the {@code AvailableHmdCaps} field. */
    @NativeType("unsigned int")
    public int AvailableHmdCaps() { return nAvailableHmdCaps(address()); }
    /** Returns the value of the {@code DefaultHmdCaps} field. */
    @NativeType("unsigned int")
    public int DefaultHmdCaps() { return nDefaultHmdCaps(address()); }
    /** Returns the value of the {@code AvailableTrackingCaps} field. */
    @NativeType("unsigned int")
    public int AvailableTrackingCaps() { return nAvailableTrackingCaps(address()); }
    /** Returns the value of the {@code DefaultTrackingCaps} field. */
    @NativeType("unsigned int")
    public int DefaultTrackingCaps() { return nDefaultTrackingCaps(address()); }
    /** Returns a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer DefaultEyeFov() { return nDefaultEyeFov(address()); }
    /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort DefaultEyeFov(int index) { return nDefaultEyeFov(address(), index); }
    /** Returns a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer MaxEyeFov() { return nMaxEyeFov(address()); }
    /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort MaxEyeFov(int index) { return nMaxEyeFov(address(), index); }
    /** Returns a {@link OVRSizei} view of the {@code Resolution} field. */
    @NativeType("ovrSizei")
    public OVRSizei Resolution() { return nResolution(address()); }
    /** Returns the value of the {@code DisplayRefreshRate} field. */
    public float DisplayRefreshRate() { return nDisplayRefreshRate(address()); }

    // -----------------------------------

    /** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHmdDesc malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRHmdDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHmdDesc calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRHmdDesc} instance allocated with {@link BufferUtils}. */
    public static OVRHmdDesc create() {
        return new OVRHmdDesc(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRHmdDesc} instance for the specified memory address. */
    public static OVRHmdDesc create(long address) {
        return new OVRHmdDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHmdDesc createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRHmdDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHmdDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRHmdDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRHmdDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRHmdDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRHmdDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRHmdDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHmdDesc mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHmdDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHmdDesc callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHmdDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHmdDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Type}. */
    public static int nType(long struct) { return memGetInt(struct + OVRHmdDesc.TYPE); }
    /** Unsafe version of {@link #ProductName}. */
    public static ByteBuffer nProductName(long struct) { return memByteBuffer(struct + OVRHmdDesc.PRODUCTNAME, 64); }
    /** Unsafe version of {@link #ProductNameString}. */
    public static String nProductNameString(long struct) { return memUTF8(struct + OVRHmdDesc.PRODUCTNAME); }
    /** Unsafe version of {@link #Manufacturer}. */
    public static ByteBuffer nManufacturer(long struct) { return memByteBuffer(struct + OVRHmdDesc.MANUFACTURER, 64); }
    /** Unsafe version of {@link #ManufacturerString}. */
    public static String nManufacturerString(long struct) { return memUTF8(struct + OVRHmdDesc.MANUFACTURER); }
    /** Unsafe version of {@link #VendorId}. */
    public static short nVendorId(long struct) { return memGetShort(struct + OVRHmdDesc.VENDORID); }
    /** Unsafe version of {@link #ProductId}. */
    public static short nProductId(long struct) { return memGetShort(struct + OVRHmdDesc.PRODUCTID); }
    /** Unsafe version of {@link #SerialNumber}. */
    public static ByteBuffer nSerialNumber(long struct) { return memByteBuffer(struct + OVRHmdDesc.SERIALNUMBER, 24); }
    /** Unsafe version of {@link #SerialNumberString}. */
    public static String nSerialNumberString(long struct) { return memASCII(struct + OVRHmdDesc.SERIALNUMBER); }
    /** Unsafe version of {@link #FirmwareMajor}. */
    public static short nFirmwareMajor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMAJOR); }
    /** Unsafe version of {@link #FirmwareMinor}. */
    public static short nFirmwareMinor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMINOR); }
    /** Unsafe version of {@link #AvailableHmdCaps}. */
    public static int nAvailableHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLEHMDCAPS); }
    /** Unsafe version of {@link #DefaultHmdCaps}. */
    public static int nDefaultHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTHMDCAPS); }
    /** Unsafe version of {@link #AvailableTrackingCaps}. */
    public static int nAvailableTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLETRACKINGCAPS); }
    /** Unsafe version of {@link #DefaultTrackingCaps}. */
    public static int nDefaultTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTTRACKINGCAPS); }
    /** Unsafe version of {@link #DefaultEyeFov}. */
    public static OVRFovPort.Buffer nDefaultEyeFov(long struct) { return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV, ovrEye_Count); }
    /** Unsafe version of {@link #DefaultEyeFov(int) DefaultEyeFov}. */
    public static OVRFovPort nDefaultEyeFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #MaxEyeFov}. */
    public static OVRFovPort.Buffer nMaxEyeFov(long struct) { return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV, ovrEye_Count); }
    /** Unsafe version of {@link #MaxEyeFov(int) MaxEyeFov}. */
    public static OVRFovPort nMaxEyeFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Resolution}. */
    public static OVRSizei nResolution(long struct) { return OVRSizei.create(struct + OVRHmdDesc.RESOLUTION); }
    /** Unsafe version of {@link #DisplayRefreshRate}. */
    public static float nDisplayRefreshRate(long struct) { return memGetFloat(struct + OVRHmdDesc.DISPLAYREFRESHRATE); }

    // -----------------------------------

    /** An array of {@link OVRHmdDesc} structs. */
    public static class Buffer extends StructBuffer<OVRHmdDesc, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRHmdDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRHmdDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVRHmdDesc newInstance(long address) {
            return new OVRHmdDesc(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code Type} field. */
        @NativeType("ovrHmdType")
        public int Type() { return OVRHmdDesc.nType(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code ProductName} field. */
        @NativeType("char[64]")
        public ByteBuffer ProductName() { return OVRHmdDesc.nProductName(address()); }
        /** Decodes the null-terminated string stored in the {@code ProductName} field. */
        @NativeType("char[64]")
        public String ProductNameString() { return OVRHmdDesc.nProductNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code Manufacturer} field. */
        @NativeType("char[64]")
        public ByteBuffer Manufacturer() { return OVRHmdDesc.nManufacturer(address()); }
        /** Decodes the null-terminated string stored in the {@code Manufacturer} field. */
        @NativeType("char[64]")
        public String ManufacturerString() { return OVRHmdDesc.nManufacturerString(address()); }
        /** Returns the value of the {@code VendorId} field. */
        public short VendorId() { return OVRHmdDesc.nVendorId(address()); }
        /** Returns the value of the {@code ProductId} field. */
        public short ProductId() { return OVRHmdDesc.nProductId(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code SerialNumber} field. */
        @NativeType("char[24]")
        public ByteBuffer SerialNumber() { return OVRHmdDesc.nSerialNumber(address()); }
        /** Decodes the null-terminated string stored in the {@code SerialNumber} field. */
        @NativeType("char[24]")
        public String SerialNumberString() { return OVRHmdDesc.nSerialNumberString(address()); }
        /** Returns the value of the {@code FirmwareMajor} field. */
        public short FirmwareMajor() { return OVRHmdDesc.nFirmwareMajor(address()); }
        /** Returns the value of the {@code FirmwareMinor} field. */
        public short FirmwareMinor() { return OVRHmdDesc.nFirmwareMinor(address()); }
        /** Returns the value of the {@code AvailableHmdCaps} field. */
        @NativeType("unsigned int")
        public int AvailableHmdCaps() { return OVRHmdDesc.nAvailableHmdCaps(address()); }
        /** Returns the value of the {@code DefaultHmdCaps} field. */
        @NativeType("unsigned int")
        public int DefaultHmdCaps() { return OVRHmdDesc.nDefaultHmdCaps(address()); }
        /** Returns the value of the {@code AvailableTrackingCaps} field. */
        @NativeType("unsigned int")
        public int AvailableTrackingCaps() { return OVRHmdDesc.nAvailableTrackingCaps(address()); }
        /** Returns the value of the {@code DefaultTrackingCaps} field. */
        @NativeType("unsigned int")
        public int DefaultTrackingCaps() { return OVRHmdDesc.nDefaultTrackingCaps(address()); }
        /** Returns a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer DefaultEyeFov() { return OVRHmdDesc.nDefaultEyeFov(address()); }
        /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort DefaultEyeFov(int index) { return OVRHmdDesc.nDefaultEyeFov(address(), index); }
        /** Returns a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
        @NativeType("ovrFovPort[ovrEye_Count]")
        public OVRFovPort.Buffer MaxEyeFov() { return OVRHmdDesc.nMaxEyeFov(address()); }
        /** Returns a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort MaxEyeFov(int index) { return OVRHmdDesc.nMaxEyeFov(address(), index); }
        /** Returns a {@link OVRSizei} view of the {@code Resolution} field. */
        @NativeType("ovrSizei")
        public OVRSizei Resolution() { return OVRHmdDesc.nResolution(address()); }
        /** Returns the value of the {@code DisplayRefreshRate} field. */
        public float DisplayRefreshRate() { return OVRHmdDesc.nDisplayRefreshRate(address()); }

    }

}