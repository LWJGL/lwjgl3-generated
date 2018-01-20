/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying IDs related to the physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code deviceUUID} <b>must</b> be immutable for a given device across instances, processes, driver APIs, driver versions, and system reboots.</p>
 * 
 * <p>Applications <b>can</b> compare the {@code driverUUID} value across instance and process boundaries, and <b>can</b> make similar queries in external APIs to determine whether they are capable of sharing memory objects and resources using them with the device.</p>
 * 
 * <p>{@code deviceUUID} and/or {@code driverUUID} <b>must</b> be used to determine whether a particular external object can be shared between driver components, where such a restriction exists as defined in the compatibility table for the particular object type:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#external-memory-handle-types-compatibility">External memory handle types compatibility</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#external-semaphore-handle-types-compatibility">External semaphore handle types compatibility</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#external-fence-handle-types-compatibility">External fence handle types compatibility</a></li>
 * </ul>
 * 
 * <p>If {@code deviceLUIDValid} is {@link VK10#VK_FALSE FALSE}, the contents of {@code deviceLUID} and {@code deviceNodeMask} are undefined. If {@code deviceLUIDValid} is {@link VK10#VK_TRUE TRUE} and Vulkan is running on the Windows operating system, the contents of {@code deviceLUID} <b>can</b> be cast to an {@code LUID} object and <b>must</b> be equal to the locally unique identifier of a {@code IDXGIAdapter1} object that corresponds to {@code physicalDevice}. If {@code deviceLUIDValid} is {@link VK10#VK_TRUE TRUE}, {@code deviceNodeMask} <b>must</b> contain exactly one bit. If Vulkan is running on an operating system that supports the Direct3D 12 API and {@code physicalDevice} corresponds to an individual device in a linked device adapter, {@code deviceNodeMask} identifies the Direct3D 12 node corresponding to {@code physicalDevice}. Otherwise, {@code deviceNodeMask} <b>must</b> be 1.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Although they have identical descriptions, {@link VkPhysicalDeviceIDPropertiesKHR}{@code ::deviceUUID} may differ from {@link VkPhysicalDeviceProperties2KHR}{@code ::pipelineCacheUUID}. The former is intended to identify and correlate devices across API and driver boundaries, while the latter is used to identify a compatible device and driver combination to use when serializing and de-serializing pipeline state.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>While {@link VkPhysicalDeviceIDPropertiesKHR}{@code ::deviceUUID} is specified to remain consistent across driver versions and system reboots, it is not intended to be usable as a serializable persistent identifier for a device. It may change when a device is physically added to, removed from, or moved to a different connector in a system while that system is powered down. Further, there is no reasonable way to verify with conformance testing that a given device retains the same UUID in a given system across all driver versions supported in that system. While implementations should make every effort to report consistent device UUIDs across driver versions, applications should avoid relying on the persistence of this value for uses other than identifying compatible devices for external object sharing purposes.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryCapabilities#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceUUID} &ndash; an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the device.</li>
 * <li>{@code driverUUID} &ndash; an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the driver build in use by the device.</li>
 * <li>{@code deviceLUID} &ndash; an array of size {@link VK10#VK_LUID_SIZE_KHR LUID_SIZE_KHR}, containing 8-bit values that represent a locally unique identifier for the device.</li>
 * <li>{@code deviceNodeMask} &ndash; a bitfield identifying the node within a linked device adapter corresponding to the device.</li>
 * <li>{@code deviceLUIDValid} &ndash; a boolean value that will be {@link VK10#VK_TRUE TRUE} if {@code deviceLUID} contains a valid LUID and {@code deviceNodeMask} contains a valid node mask, and {@link VK10#VK_FALSE FALSE} if they do not.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceIDPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t deviceUUID[VK_UUID_SIZE];
 *     uint8_t driverUUID[VK_UUID_SIZE];
 *     uint8_t deviceLUID[VK_LUID_SIZE_KHR];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 * }</pre></code>
 */
public class VkPhysicalDeviceIDPropertiesKHR extends Struct {

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
        DEVICENODEMASK,
        DEVICELUIDVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE_KHR),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
    }

    VkPhysicalDeviceIDPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceIDPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIDPropertiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code deviceUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** Returns the value at the specified index of the {@code deviceUUID} field. */
    @NativeType("uint8_t")
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code driverUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** Returns the value at the specified index of the {@code driverUUID} field. */
    @NativeType("uint8_t")
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code deviceLUID} field. */
    @NativeType("uint8_t[VK_LUID_SIZE_KHR]")
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** Returns the value at the specified index of the {@code deviceLUID} field. */
    @NativeType("uint8_t")
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** Returns the value of the {@code deviceNodeMask} field. */
    @NativeType("uint32_t")
    public int deviceNodeMask() { return ndeviceNodeMask(address()); }
    /** Returns the value of the {@code deviceLUIDValid} field. */
    @NativeType("VkBool32")
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceIDPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceIDPropertiesKHR create(long address) {
        return new VkPhysicalDeviceIDPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDPropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceIDPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceIDPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIDPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        if (CHECKS) { check(index, VK_UUID_SIZE); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICEUUID + index * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHR.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        if (CHECKS) { check(index, VK_UUID_SIZE); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHR.DRIVERUUID + index * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICELUID, VK_LUID_SIZE_KHR); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        if (CHECKS) { check(index, VK_LUID_SIZE_KHR); }
        return memGetByte(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICELUID + index * 1);
    }
    /** Unsafe version of {@link #deviceNodeMask}. */
    public static int ndeviceNodeMask(long struct) { return memGetInt(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICENODEMASK); }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return memGetInt(struct + VkPhysicalDeviceIDPropertiesKHR.DEVICELUIDVALID); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIDPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIDPropertiesKHR, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceIDPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIDPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceIDPropertiesKHR newInstance(long address) {
            return new VkPhysicalDeviceIDPropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceIDPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceIDPropertiesKHR.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code deviceUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceIDPropertiesKHR.ndeviceUUID(address()); }
        /** Returns the value at the specified index of the {@code deviceUUID} field. */
        @NativeType("uint8_t")
        public byte deviceUUID(int index) { return VkPhysicalDeviceIDPropertiesKHR.ndeviceUUID(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code driverUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() { return VkPhysicalDeviceIDPropertiesKHR.ndriverUUID(address()); }
        /** Returns the value at the specified index of the {@code driverUUID} field. */
        @NativeType("uint8_t")
        public byte driverUUID(int index) { return VkPhysicalDeviceIDPropertiesKHR.ndriverUUID(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code deviceLUID} field. */
        @NativeType("uint8_t[VK_LUID_SIZE_KHR]")
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceIDPropertiesKHR.ndeviceLUID(address()); }
        /** Returns the value at the specified index of the {@code deviceLUID} field. */
        @NativeType("uint8_t")
        public byte deviceLUID(int index) { return VkPhysicalDeviceIDPropertiesKHR.ndeviceLUID(address(), index); }
        /** Returns the value of the {@code deviceNodeMask} field. */
        @NativeType("uint32_t")
        public int deviceNodeMask() { return VkPhysicalDeviceIDPropertiesKHR.ndeviceNodeMask(address()); }
        /** Returns the value of the {@code deviceLUIDValid} field. */
        @NativeType("VkBool32")
        public boolean deviceLUIDValid() { return VkPhysicalDeviceIDPropertiesKHR.ndeviceLUIDValid(address()) != 0; }

    }

}