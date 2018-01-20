/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying supported external handle properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryCapabilities#VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalMemoryPropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code externalMemoryProperties} &ndash; an instance of the {@link VkExternalMemoryPropertiesKHR} structure specifying various capabilities of the external handle type when used with the specified image creation parameters.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalImageFormatPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExternalMemoryPropertiesKHR VkExternalMemoryPropertiesKHR} externalMemoryProperties;
 * }</pre></code>
 */
public class VkExternalImageFormatPropertiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExternalMemoryPropertiesKHR.SIZEOF, VkExternalMemoryPropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    VkExternalImageFormatPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalImageFormatPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalImageFormatPropertiesKHR(ByteBuffer container) {
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
    /** Returns a {@link VkExternalMemoryPropertiesKHR} view of the {@code externalMemoryProperties} field. */
    public VkExternalMemoryPropertiesKHR externalMemoryProperties() { return nexternalMemoryProperties(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalImageFormatPropertiesKHR} instance for the specified memory address. */
    public static VkExternalImageFormatPropertiesKHR create(long address) {
        return new VkExternalImageFormatPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatPropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkExternalImageFormatPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalImageFormatPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalImageFormatPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #externalMemoryProperties}. */
    public static VkExternalMemoryPropertiesKHR nexternalMemoryProperties(long struct) { return VkExternalMemoryPropertiesKHR.create(struct + VkExternalImageFormatPropertiesKHR.EXTERNALMEMORYPROPERTIES); }

    // -----------------------------------

    /** An array of {@link VkExternalImageFormatPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalImageFormatPropertiesKHR, Buffer> {

        /**
         * Creates a new {@link VkExternalImageFormatPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalImageFormatPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalImageFormatPropertiesKHR newInstance(long address) {
            return new VkExternalImageFormatPropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalImageFormatPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalImageFormatPropertiesKHR.npNext(address()); }
        /** Returns a {@link VkExternalMemoryPropertiesKHR} view of the {@code externalMemoryProperties} field. */
        public VkExternalMemoryPropertiesKHR externalMemoryProperties() { return VkExternalImageFormatPropertiesKHR.nexternalMemoryProperties(address()); }

    }

}