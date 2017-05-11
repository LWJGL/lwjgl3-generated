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
 * <li>{@code perViewPositionAllComponents} is {@link VK10#VK_TRUE TRUE} if the implementation supports per-view position values that differ in components other than the X component.</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structure is included in the {@code pNext} chain of flink:VkPhysicalDeviceProperties2KHR, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
    VkStructureType sType;
    void * pNext;
    VkBool32 perViewPositionAllComponents;
}</code></pre>
 */
public class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWPOSITIONALLCOMPONENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWPOSITIONALLCOMPONENTS = layout.offsetof(2);
    }

    VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code perViewPositionAllComponents} field. */
    public boolean perViewPositionAllComponents() { return nperViewPositionAllComponents(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, null);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PNEXT); }
    /** Unsafe version of {@link #perViewPositionAllComponents}. */
    public static int nperViewPositionAllComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PERVIEWPOSITIONALLCOMPONENTS); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX newInstance(long address) {
            return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.npNext(address()); }
        /** Returns the value of the {@code perViewPositionAllComponents} field. */
        public boolean perViewPositionAllComponents() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nperViewPositionAllComponents(address()) != 0; }

    }

}