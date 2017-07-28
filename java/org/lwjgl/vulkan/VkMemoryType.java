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
 * Structure specifying memory type.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code propertyFlags} &ndash; a bitmask of {@code VkMemoryPropertyFlagBits} of properties for this memory type.</li>
 * <li>{@code heapIndex} &ndash; describes which memory heap this memory type corresponds to, and <b>must</b> be less than {@code memoryHeapCount} from the {@link VkPhysicalDeviceMemoryProperties} structure.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryType {
 *     VkMemoryPropertyFlags propertyFlags;
 *     uint32_t heapIndex;
 * }</pre></code>
 */
public class VkMemoryType extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROPERTYFLAGS,
        HEAPINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROPERTYFLAGS = layout.offsetof(0);
        HEAPINDEX = layout.offsetof(1);
    }

    VkMemoryType(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryType(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code propertyFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int propertyFlags() { return npropertyFlags(address()); }
    /** Returns the value of the {@code heapIndex} field. */
    @NativeType("uint32_t")
    public int heapIndex() { return nheapIndex(address()); }

    // -----------------------------------

    /** Returns a new {@link VkMemoryType} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryType create(long address) {
        return address == NULL ? null : new VkMemoryType(address, null);
    }

    /**
     * Create a {@link VkMemoryType.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #propertyFlags}. */
    public static int npropertyFlags(long struct) { return memGetInt(struct + VkMemoryType.PROPERTYFLAGS); }
    /** Unsafe version of {@link #heapIndex}. */
    public static int nheapIndex(long struct) { return memGetInt(struct + VkMemoryType.HEAPINDEX); }

    // -----------------------------------

    /** An array of {@link VkMemoryType} structs. */
    public static class Buffer extends StructBuffer<VkMemoryType, Buffer> {

        /**
         * Creates a new {@link VkMemoryType.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryType#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryType newInstance(long address) {
            return new VkMemoryType(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code propertyFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int propertyFlags() { return VkMemoryType.npropertyFlags(address()); }
        /** Returns the value of the {@code heapIndex} field. */
        @NativeType("uint32_t")
        public int heapIndex() { return VkMemoryType.nheapIndex(address()); }

    }

}