/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a single descriptor update of the descriptor update template.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dstBinding} <b>must</b> be a valid binding in the descriptor set layout implicitly specified when using a descriptor update template to update descriptors.</li>
 * <li>{@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding implicitly specified when using a descriptor update template to update descriptors, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorUpdateTemplateCreateInfoKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code dstBinding} &ndash; the descriptor binding to update when using this descriptor update template.</li>
 * <li>{@code dstArrayElement} &ndash; the starting element in the array belonging to {@code dstBinding}.</li>
 * <li>{@code descriptorCount} &ndash; the number of descriptors to update. If {@code descriptorCount} is greater than the number of remaining array elements in the destination binding, those affect consecutive bindings in a manner similar to {@link VkWriteDescriptorSet} above.</li>
 * <li>{@code descriptorType} &ndash; a {@code VkDescriptorType} specifying the type of the descriptor.</li>
 * <li>{@code offset} &ndash; the offset in bytes of the first binding in the raw data structure.</li>
 * <li>{@code stride} &ndash; the stride in bytes between two consecutive array elements of the descriptor update informations in the raw data structure. The actual pointer ptr for each array element j of update entry i is computed using the following formula:
 * 
 * <code><pre>
 *     const char *ptr = (const char *)pData + pDescriptorUpdateEntries[i].offset + j * pDescriptorUpdateEntries[i].stride</pre></code>
 * 
 * <p>The stride is useful in case the bindings are stored in structs along with other data.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorUpdateTemplateEntryKHR {
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     size_t offset;
 *     size_t stride;
 * }</pre></code>
 */
public class VkDescriptorUpdateTemplateEntryKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT,
        DESCRIPTORTYPE,
        OFFSET,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DSTBINDING = layout.offsetof(0);
        DSTARRAYELEMENT = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        DESCRIPTORTYPE = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        STRIDE = layout.offsetof(5);
    }

    VkDescriptorUpdateTemplateEntryKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorUpdateTemplateEntryKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateEntryKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code dstBinding} field. */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** Returns the value of the {@code dstArrayElement} field. */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /** Returns the value of the {@code descriptorCount} field. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /** Returns the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** Returns the value of the {@code offset} field. */
    @NativeType("size_t")
    public long offset() { return noffset(address()); }
    /** Returns the value of the {@code stride} field. */
    @NativeType("size_t")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@code dstBinding} field. */
    public VkDescriptorUpdateTemplateEntryKHR dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code dstArrayElement} field. */
    public VkDescriptorUpdateTemplateEntryKHR dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    public VkDescriptorUpdateTemplateEntryKHR descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    public VkDescriptorUpdateTemplateEntryKHR descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkDescriptorUpdateTemplateEntryKHR offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkDescriptorUpdateTemplateEntryKHR stride(@NativeType("size_t") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorUpdateTemplateEntryKHR set(
        int dstBinding,
        int dstArrayElement,
        int descriptorCount,
        int descriptorType,
        long offset,
        long stride
    ) {
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        offset(offset);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateEntryKHR set(VkDescriptorUpdateTemplateEntryKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntryKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntryKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateEntryKHR create() {
        return new VkDescriptorUpdateTemplateEntryKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateEntryKHR create(long address) {
        return new VkDescriptorUpdateTemplateEntryKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntryKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorUpdateTemplateEntryKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorUpdateTemplateEntryKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntryKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntryKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntryKHR.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntryKHR.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntryKHR.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntryKHR.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntryKHR.OFFSET); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntryKHR.STRIDE); }

    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntryKHR.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntryKHR.DSTARRAYELEMENT, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntryKHR.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntryKHR.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateEntryKHR.OFFSET, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateEntryKHR.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorUpdateTemplateEntryKHR} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateEntryKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateEntryKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorUpdateTemplateEntryKHR newInstance(long address) {
            return new VkDescriptorUpdateTemplateEntryKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkDescriptorUpdateTemplateEntryKHR.ndstBinding(address()); }
        /** Returns the value of the {@code dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkDescriptorUpdateTemplateEntryKHR.ndstArrayElement(address()); }
        /** Returns the value of the {@code descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorUpdateTemplateEntryKHR.ndescriptorCount(address()); }
        /** Returns the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkDescriptorUpdateTemplateEntryKHR.ndescriptorType(address()); }
        /** Returns the value of the {@code offset} field. */
        @NativeType("size_t")
        public long offset() { return VkDescriptorUpdateTemplateEntryKHR.noffset(address()); }
        /** Returns the value of the {@code stride} field. */
        @NativeType("size_t")
        public long stride() { return VkDescriptorUpdateTemplateEntryKHR.nstride(address()); }

        /** Sets the specified value to the {@code dstBinding} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer dstBinding(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code dstArrayElement} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntryKHR.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntryKHR.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer offset(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntryKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkDescriptorUpdateTemplateEntryKHR.Buffer stride(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntryKHR.nstride(address(), value); return this; }

    }

}