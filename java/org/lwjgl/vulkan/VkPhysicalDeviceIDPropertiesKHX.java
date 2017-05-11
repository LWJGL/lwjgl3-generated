/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.KHXExternalMemoryCapabilities.*;

/**
 * Structure specifying IDs related to the physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code deviceUUID} <b>must</b> be immutable for a given device across instances, processes, driver APIs, and system reboots.</p>
 * 
 * <p>{@code driverUUID} <b>must</b> be identical in all driver components that support sharing external objects between eachother. Applications <b>can</b> compare this value across instance and process boundaries, and <b>can</b> make similar queries in external APIs to determine whether they are capable of sharing memory objects and resources using them with the device.</p>
 * 
 * <p>If {@code deviceLUIDValid} is {@link VK10#VK_FALSE FALSE}, the contents of {@code deviceLUID} are undefined. If {@code deviceLUIDValid} is {@link VK10#VK_TRUE TRUE} and Vulkan is running on the Windows operating system, the contents of {@code deviceLUID} <b>can</b> be cast to an {@code LUID} object and <b>must</b> be equal to the locally unique identifier of a {@code IDXGIAdapter1} object that corresponds to {@code physicalDevice}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Although they have identical descriptions, {@link VkPhysicalDeviceIDPropertiesKHX}{@code ::deviceUUID} may differ from {@link VkPhysicalDeviceProperties2KHR}{@code ::pipelineCacheUUID}. The former is intended to identify and correlate devices across API and driver boundaries, while the latter is used to identify a compatible device and driver combination to use when serializing and de-serializing pipeline state.</p>
 * </div>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceUUID} &ndash; an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the device.</li>
 * <li>{@code driverUUID} &ndash; an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the driver build in use by the device.</li>
 * <li>{@code deviceLUID} &ndash; an array of size {@link KHXExternalMemoryCapabilities#VK_LUID_SIZE_KHX LUID_SIZE_KHX}, containing 8-bit values that represent a locally unique identifier for the device.</li>
 * <li>{@code deviceLUIDValid} &ndash; a boolean value that will be {@link VK10#VK_TRUE TRUE} if {@code deviceLUID} contains a valid LUID, and {@link VK10#VK_FALSE FALSE} if it does not.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceIDPropertiesKHX {
    VkStructureType sType;
    void * pNext;
    uint8_t deviceUUID[VK_UUID_SIZE];
    uint8_t driverUUID[VK_UUID_SIZE];
    uint8_t deviceLUID[VK_LUID_SIZE_KHX];
    VkBool32 deviceLUIDValid;
}</code></pre>
 */
public class VkPhysicalDeviceIDPropertiesKHX extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEUUID,
        DRIVERUUID,
        DEVICELUID,
        DEVICELUIDVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE_KHX),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICELUIDVALID = layout.offsetof(5);
    }

    VkPhysicalDeviceIDPropertiesKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceIDPropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIDPropertiesKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code deviceUUID} field. */
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** Returns the value at the specified index of the {@code deviceUUID} field. */
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code driverUUID} field. */
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** Returns the value at the specified index of the {@code driverUUID} field. */
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code deviceLUID} field. */
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** Returns the value at the specified index of the {@code deviceLUID} field. */
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** Returns the value of the {@code deviceLUIDValid} field. */
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceIDPropertiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceIDPropertiesKHX create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceIDPropertiesKHX(address, null);
    }

    /**
     * Create a {@link VkPhysicalDeviceIDPropertiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceIDPropertiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIDPropertiesKHX.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHX.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        if (CHECKS) { check(index, VK_UUID_SIZE); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHX.DEVICEUUID + index * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHX.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        if (CHECKS) { check(index, VK_UUID_SIZE); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHX.DRIVERUUID + index * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHX.DEVICELUID, VK_LUID_SIZE_KHX); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        if (CHECKS) { check(index, VK_LUID_SIZE_KHX); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHX.DEVICELUID + index * 1);
    }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return memGetInt(struct + VkPhysicalDeviceIDPropertiesKHX.DEVICELUIDVALID); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIDPropertiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIDPropertiesKHX, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceIDPropertiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIDPropertiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceIDPropertiesKHX newInstance(long address) {
            return new VkPhysicalDeviceIDPropertiesKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPhysicalDeviceIDPropertiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPhysicalDeviceIDPropertiesKHX.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code deviceUUID} field. */
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceIDPropertiesKHX.ndeviceUUID(address()); }
        /** Returns the value at the specified index of the {@code deviceUUID} field. */
        public byte deviceUUID(int index) { return VkPhysicalDeviceIDPropertiesKHX.ndeviceUUID(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code driverUUID} field. */
        public ByteBuffer driverUUID() { return VkPhysicalDeviceIDPropertiesKHX.ndriverUUID(address()); }
        /** Returns the value at the specified index of the {@code driverUUID} field. */
        public byte driverUUID(int index) { return VkPhysicalDeviceIDPropertiesKHX.ndriverUUID(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code deviceLUID} field. */
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceIDPropertiesKHX.ndeviceLUID(address()); }
        /** Returns the value at the specified index of the {@code deviceLUID} field. */
        public byte deviceLUID(int index) { return VkPhysicalDeviceIDPropertiesKHX.ndeviceLUID(address(), index); }
        /** Returns the value of the {@code deviceLUIDValid} field. */
        public boolean deviceLUIDValid() { return VkPhysicalDeviceIDPropertiesKHX.ndeviceLUIDValid(address()) != 0; }

    }

}