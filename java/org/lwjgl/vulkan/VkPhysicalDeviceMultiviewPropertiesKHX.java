/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing multiview limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <ul>
 * <li>{@code maxMultiviewViewCount} is one greater than the maximum view index that <b>can</b> be used in a subpass.</li>
 * <li>{@code maxMultiviewInstanceIndex} is the maximum valid value of instance index allowed to be generated by a drawing command recorded within a subpass of a multiview render pass instance.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXMultiview#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPropertiesKHX} structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceMultiviewPropertiesKHX {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxMultiviewViewCount;
 *     uint32_t maxMultiviewInstanceIndex;
 * }</pre></code>
 */
public class VkPhysicalDeviceMultiviewPropertiesKHX extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXMULTIVIEWVIEWCOUNT,
        MAXMULTIVIEWINSTANCEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXMULTIVIEWVIEWCOUNT = layout.offsetof(2);
        MAXMULTIVIEWINSTANCEINDEX = layout.offsetof(3);
    }

    VkPhysicalDeviceMultiviewPropertiesKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceMultiviewPropertiesKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPropertiesKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxMultiviewViewCount} field. */
    @NativeType("uint32_t")
    public int maxMultiviewViewCount() { return nmaxMultiviewViewCount(address()); }
    /** Returns the value of the {@code maxMultiviewInstanceIndex} field. */
    @NativeType("uint32_t")
    public int maxMultiviewInstanceIndex() { return nmaxMultiviewInstanceIndex(address()); }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMultiviewPropertiesKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceMultiviewPropertiesKHX create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewPropertiesKHX(address, null);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPropertiesKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPropertiesKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPropertiesKHX.PNEXT); }
    /** Unsafe version of {@link #maxMultiviewViewCount}. */
    public static int nmaxMultiviewViewCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPropertiesKHX.MAXMULTIVIEWVIEWCOUNT); }
    /** Unsafe version of {@link #maxMultiviewInstanceIndex}. */
    public static int nmaxMultiviewInstanceIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPropertiesKHX.MAXMULTIVIEWINSTANCEINDEX); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPropertiesKHX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPropertiesKHX, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceMultiviewPropertiesKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPropertiesKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMultiviewPropertiesKHX newInstance(long address) {
            return new VkPhysicalDeviceMultiviewPropertiesKHX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewPropertiesKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewPropertiesKHX.npNext(address()); }
        /** Returns the value of the {@code maxMultiviewViewCount} field. */
        @NativeType("uint32_t")
        public int maxMultiviewViewCount() { return VkPhysicalDeviceMultiviewPropertiesKHX.nmaxMultiviewViewCount(address()); }
        /** Returns the value of the {@code maxMultiviewInstanceIndex} field. */
        @NativeType("uint32_t")
        public int maxMultiviewInstanceIndex() { return VkPhysicalDeviceMultiviewPropertiesKHX.nmaxMultiviewInstanceIndex(address()); }

    }

}