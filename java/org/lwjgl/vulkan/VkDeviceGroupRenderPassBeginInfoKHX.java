/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Set the initial device mask and render areas for a render pass instance.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code deviceMask} serves several purposes. It is an upper bound on the set of physical devices that <b>can</b> be used during the render pass instance, and the initial device mask when the render pass instance begins. Render pass attachment load, store, and resolve operations only apply to physical devices included in the device mask. Subpass dependencies only apply to the physical devices in the device mask.</p>
 * 
 * <p>If {@code deviceRenderAreaCount} is not zero, then the elements of {@code pDeviceRenderAreas} override the value of {@link VkRenderPassBeginInfo}{@code ::renderArea}, and provide a render area specific to each physical device. These render areas serve the same purpose as {@link VkRenderPassBeginInfo}{@code ::renderArea}, including controlling the region of attachments that are cleared by {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} and that are resolved into resolve attachments.</p>
 * 
 * <p>If this structure is not present, the render pass instance's device mask is the value of {@link VkDeviceGroupCommandBufferBeginInfoKHX}{@code ::deviceMask}. If this structure is not present or if {@code deviceRenderAreaCount} is zero, {@link VkRenderPassBeginInfo}{@code ::renderArea} is used for all physical devices.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
 * <li>{@code deviceMask} <b>must</b> not be zero</li>
 * <li>{@code deviceMask} <b>must</b> be a subset of the command buffer&#8217;s initial device mask</li>
 * <li>{@code deviceRenderAreaCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX}</li>
 * <li>If {@code deviceRenderAreaCount} is not 0, {@code pDeviceRenderAreas} <b>must</b> be a pointer to an array of {@code deviceRenderAreaCount} {@link VkRect2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceMask} &ndash; the device mask for the render pass instance.</li>
 * <li>{@code deviceRenderAreaCount} &ndash; the number of elements in the {@code pDeviceRenderAreas} array.</li>
 * <li>{@code pDeviceRenderAreas} &ndash; an array of structures of type {@link VkRect2D} defining the render area for each physical device.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGroupRenderPassBeginInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t deviceMask;
 *     uint32_t deviceRenderAreaCount;
 *     const {@link VkRect2D VkRect2D} * pDeviceRenderAreas;
 * }</pre></code>
 */
public class VkDeviceGroupRenderPassBeginInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEMASK,
        DEVICERENDERAREACOUNT,
        PDEVICERENDERAREAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
        DEVICERENDERAREACOUNT = layout.offsetof(3);
        PDEVICERENDERAREAS = layout.offsetof(4);
    }

    VkDeviceGroupRenderPassBeginInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGroupRenderPassBeginInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupRenderPassBeginInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code deviceMask} field. */
    public int deviceMask() { return ndeviceMask(address()); }
    /** Returns the value of the {@code deviceRenderAreaCount} field. */
    public int deviceRenderAreaCount() { return ndeviceRenderAreaCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
    public VkRect2D.Buffer pDeviceRenderAreas() { return npDeviceRenderAreas(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupRenderPassBeginInfoKHX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupRenderPassBeginInfoKHX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkDeviceGroupRenderPassBeginInfoKHX deviceMask(int value) { ndeviceMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
    public VkDeviceGroupRenderPassBeginInfoKHX pDeviceRenderAreas(VkRect2D.Buffer value) { npDeviceRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupRenderPassBeginInfoKHX set(
        int sType,
        long pNext,
        int deviceMask,
        VkRect2D.Buffer pDeviceRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupRenderPassBeginInfoKHX set(VkDeviceGroupRenderPassBeginInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupRenderPassBeginInfoKHX create() {
        return new VkDeviceGroupRenderPassBeginInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDeviceGroupRenderPassBeginInfoKHX create(long address) {
        return address == NULL ? null : new VkDeviceGroupRenderPassBeginInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupRenderPassBeginInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupRenderPassBeginInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupRenderPassBeginInfoKHX.PNEXT); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.DEVICEMASK); }
    /** Unsafe version of {@link #deviceRenderAreaCount}. */
    public static int ndeviceRenderAreaCount(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.DEVICERENDERAREACOUNT); }
    /** Unsafe version of {@link #pDeviceRenderAreas}. */
    public static VkRect2D.Buffer npDeviceRenderAreas(long struct) { return VkRect2D.create(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfoKHX.PDEVICERENDERAREAS), ndeviceRenderAreaCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfoKHX.PNEXT, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.DEVICEMASK, value); }
    /** Sets the specified value to the {@code deviceRenderAreaCount} field of the specified {@code struct}. */
    public static void ndeviceRenderAreaCount(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfoKHX.DEVICERENDERAREACOUNT, value); }
    /** Unsafe version of {@link #pDeviceRenderAreas(VkRect2D.Buffer) pDeviceRenderAreas}. */
    public static void npDeviceRenderAreas(long struct, VkRect2D.Buffer value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfoKHX.PDEVICERENDERAREAS, addressSafe(value)); ndeviceRenderAreaCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceRenderAreaCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfoKHX.PDEVICERENDERAREAS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupRenderPassBeginInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupRenderPassBeginInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGroupRenderPassBeginInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupRenderPassBeginInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupRenderPassBeginInfoKHX newInstance(long address) {
            return new VkDeviceGroupRenderPassBeginInfoKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkDeviceGroupRenderPassBeginInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkDeviceGroupRenderPassBeginInfoKHX.npNext(address()); }
        /** Returns the value of the {@code deviceMask} field. */
        public int deviceMask() { return VkDeviceGroupRenderPassBeginInfoKHX.ndeviceMask(address()); }
        /** Returns the value of the {@code deviceRenderAreaCount} field. */
        public int deviceRenderAreaCount() { return VkDeviceGroupRenderPassBeginInfoKHX.ndeviceRenderAreaCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
        public VkRect2D.Buffer pDeviceRenderAreas() { return VkDeviceGroupRenderPassBeginInfoKHX.npDeviceRenderAreas(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupRenderPassBeginInfoKHX.Buffer sType(int value) { VkDeviceGroupRenderPassBeginInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupRenderPassBeginInfoKHX.Buffer pNext(long value) { VkDeviceGroupRenderPassBeginInfoKHX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkDeviceGroupRenderPassBeginInfoKHX.Buffer deviceMask(int value) { VkDeviceGroupRenderPassBeginInfoKHX.ndeviceMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
        public VkDeviceGroupRenderPassBeginInfoKHX.Buffer pDeviceRenderAreas(VkRect2D.Buffer value) { VkDeviceGroupRenderPassBeginInfoKHX.npDeviceRenderAreas(address(), value); return this; }

    }

}