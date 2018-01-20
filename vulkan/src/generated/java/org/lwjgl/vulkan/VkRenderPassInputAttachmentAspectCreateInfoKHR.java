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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying, for a given subpass/input attachment pair, which aspect <b>can</b> be read.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance2#VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pAspectReferences} <b>must</b> be a valid pointer to an array of {@code aspectReferenceCount} valid {@link VkInputAttachmentAspectReferenceKHR} structures</li>
 * <li>{@code aspectReferenceCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkInputAttachmentAspectReferenceKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code aspectReferenceCount} &ndash; the number of elements in the pAspectReferences array.</li>
 * <li>{@code pAspectReferences} &ndash; points to an array of {@code aspectReferenceCount} number of {@link VkInputAttachmentAspectReferenceKHR} structures describing which aspect(s) <b>can</b> be accessed for a given input attachment within a given subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRenderPassInputAttachmentAspectCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t aspectReferenceCount;
 *     const {@link VkInputAttachmentAspectReferenceKHR VkInputAttachmentAspectReferenceKHR} * pAspectReferences;
 * }</pre></code>
 */
public class VkRenderPassInputAttachmentAspectCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ASPECTREFERENCECOUNT,
        PASPECTREFERENCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ASPECTREFERENCECOUNT = layout.offsetof(2);
        PASPECTREFERENCES = layout.offsetof(3);
    }

    VkRenderPassInputAttachmentAspectCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code aspectReferenceCount} field. */
    @NativeType("uint32_t")
    public int aspectReferenceCount() { return naspectReferenceCount(address()); }
    /** Returns a {@link VkInputAttachmentAspectReferenceKHR.Buffer} view of the struct array pointed to by the {@code pAspectReferences} field. */
    @NativeType("const VkInputAttachmentAspectReferenceKHR *")
    public VkInputAttachmentAspectReferenceKHR.Buffer pAspectReferences() { return npAspectReferences(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkInputAttachmentAspectReferenceKHR.Buffer} to the {@code pAspectReferences} field. */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferences(@NativeType("const VkInputAttachmentAspectReferenceKHR *") VkInputAttachmentAspectReferenceKHR.Buffer value) { npAspectReferences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(
        int sType,
        long pNext,
        VkInputAttachmentAspectReferenceKHR.Buffer pAspectReferences
    ) {
        sType(sType);
        pNext(pNext);
        pAspectReferences(pAspectReferences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(VkRenderPassInputAttachmentAspectCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create() {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance for the specified memory address. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create(long address) {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #aspectReferenceCount}. */
    public static int naspectReferenceCount(long struct) { return memGetInt(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.ASPECTREFERENCECOUNT); }
    /** Unsafe version of {@link #pAspectReferences}. */
    public static VkInputAttachmentAspectReferenceKHR.Buffer npAspectReferences(long struct) { return VkInputAttachmentAspectReferenceKHR.create(memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.PASPECTREFERENCES), naspectReferenceCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code aspectReferenceCount} field of the specified {@code struct}. */
    public static void naspectReferenceCount(long struct, int value) { memPutInt(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.ASPECTREFERENCECOUNT, value); }
    /** Unsafe version of {@link #pAspectReferences(VkInputAttachmentAspectReferenceKHR.Buffer) pAspectReferences}. */
    public static void npAspectReferences(long struct, VkInputAttachmentAspectReferenceKHR.Buffer value) { memPutAddress(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.PASPECTREFERENCES, value.address()); naspectReferenceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfoKHR.PASPECTREFERENCES));
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

    /** An array of {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassInputAttachmentAspectCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassInputAttachmentAspectCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassInputAttachmentAspectCreateInfoKHR newInstance(long address) {
            return new VkRenderPassInputAttachmentAspectCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassInputAttachmentAspectCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkRenderPassInputAttachmentAspectCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code aspectReferenceCount} field. */
        @NativeType("uint32_t")
        public int aspectReferenceCount() { return VkRenderPassInputAttachmentAspectCreateInfoKHR.naspectReferenceCount(address()); }
        /** Returns a {@link VkInputAttachmentAspectReferenceKHR.Buffer} view of the struct array pointed to by the {@code pAspectReferences} field. */
        @NativeType("const VkInputAttachmentAspectReferenceKHR *")
        public VkInputAttachmentAspectReferenceKHR.Buffer pAspectReferences() { return VkRenderPassInputAttachmentAspectCreateInfoKHR.npAspectReferences(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkInputAttachmentAspectReferenceKHR.Buffer} to the {@code pAspectReferences} field. */
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer pAspectReferences(@NativeType("const VkInputAttachmentAspectReferenceKHR *") VkInputAttachmentAspectReferenceKHR.Buffer value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.npAspectReferences(address(), value); return this; }

    }

}