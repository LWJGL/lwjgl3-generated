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
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO}</li>
 * <li>{@code pAspectReferences} <b>must</b> be a valid pointer to an array of {@code aspectReferenceCount} valid {@link VkInputAttachmentAspectReference} structures</li>
 * <li>{@code aspectReferenceCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkInputAttachmentAspectReference}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code aspectReferenceCount} &ndash; the number of elements in the pAspectReferences array.</li>
 * <li>{@code pAspectReferences} &ndash; points to an array of {@code aspectReferenceCount} number of {@link VkInputAttachmentAspectReference} structures describing which aspect(s) <b>can</b> be accessed for a given input attachment within a given subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRenderPassInputAttachmentAspectCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t aspectReferenceCount;
 *     {@link VkInputAttachmentAspectReference VkInputAttachmentAspectReference const} * pAspectReferences;
 * }</pre></code>
 */
public class VkRenderPassInputAttachmentAspectCreateInfo extends Struct implements NativeResource {

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

    VkRenderPassInputAttachmentAspectCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassInputAttachmentAspectCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassInputAttachmentAspectCreateInfo(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code aspectReferenceCount} field. */
    @NativeType("uint32_t")
    public int aspectReferenceCount() { return naspectReferenceCount(address()); }
    /** Returns a {@link VkInputAttachmentAspectReference.Buffer} view of the struct array pointed to by the {@code pAspectReferences} field. */
    @NativeType("VkInputAttachmentAspectReference const *")
    public VkInputAttachmentAspectReference.Buffer pAspectReferences() { return npAspectReferences(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassInputAttachmentAspectCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassInputAttachmentAspectCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkInputAttachmentAspectReference.Buffer} to the {@code pAspectReferences} field. */
    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) { npAspectReferences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassInputAttachmentAspectCreateInfo set(
        int sType,
        long pNext,
        VkInputAttachmentAspectReference.Buffer pAspectReferences
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
    public VkRenderPassInputAttachmentAspectCreateInfo set(VkRenderPassInputAttachmentAspectCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassInputAttachmentAspectCreateInfo create() {
        return new VkRenderPassInputAttachmentAspectCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance for the specified memory address. */
    public static VkRenderPassInputAttachmentAspectCreateInfo create(long address) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassInputAttachmentAspectCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassInputAttachmentAspectCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassInputAttachmentAspectCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfo.PNEXT); }
    /** Unsafe version of {@link #aspectReferenceCount}. */
    public static int naspectReferenceCount(long struct) { return memGetInt(struct + VkRenderPassInputAttachmentAspectCreateInfo.ASPECTREFERENCECOUNT); }
    /** Unsafe version of {@link #pAspectReferences}. */
    public static VkInputAttachmentAspectReference.Buffer npAspectReferences(long struct) { return VkInputAttachmentAspectReference.create(memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfo.PASPECTREFERENCES), naspectReferenceCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassInputAttachmentAspectCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassInputAttachmentAspectCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code aspectReferenceCount} field of the specified {@code struct}. */
    public static void naspectReferenceCount(long struct, int value) { memPutInt(struct + VkRenderPassInputAttachmentAspectCreateInfo.ASPECTREFERENCECOUNT, value); }
    /** Unsafe version of {@link #pAspectReferences(VkInputAttachmentAspectReference.Buffer) pAspectReferences}. */
    public static void npAspectReferences(long struct, VkInputAttachmentAspectReference.Buffer value) { memPutAddress(struct + VkRenderPassInputAttachmentAspectCreateInfo.PASPECTREFERENCES, value.address()); naspectReferenceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassInputAttachmentAspectCreateInfo.PASPECTREFERENCES));
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

    /** An array of {@link VkRenderPassInputAttachmentAspectCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassInputAttachmentAspectCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassInputAttachmentAspectCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassInputAttachmentAspectCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassInputAttachmentAspectCreateInfo newInstance(long address) {
            return new VkRenderPassInputAttachmentAspectCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassInputAttachmentAspectCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassInputAttachmentAspectCreateInfo.npNext(address()); }
        /** Returns the value of the {@code aspectReferenceCount} field. */
        @NativeType("uint32_t")
        public int aspectReferenceCount() { return VkRenderPassInputAttachmentAspectCreateInfo.naspectReferenceCount(address()); }
        /** Returns a {@link VkInputAttachmentAspectReference.Buffer} view of the struct array pointed to by the {@code pAspectReferences} field. */
        @NativeType("VkInputAttachmentAspectReference const *")
        public VkInputAttachmentAspectReference.Buffer pAspectReferences() { return VkRenderPassInputAttachmentAspectCreateInfo.npAspectReferences(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassInputAttachmentAspectCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassInputAttachmentAspectCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassInputAttachmentAspectCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkInputAttachmentAspectReference.Buffer} to the {@code pAspectReferences} field. */
        public VkRenderPassInputAttachmentAspectCreateInfo.Buffer pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) { VkRenderPassInputAttachmentAspectCreateInfo.npAspectReferences(address(), value); return this; }

    }

}