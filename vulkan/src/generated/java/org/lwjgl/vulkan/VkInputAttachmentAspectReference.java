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
 * Structure specifying a subpass/input attachment pair and an aspect mask that <b>can</b> be read.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>There <b>must</b> be an input attachment at {@code pCreateInfo}{@code ::pSubpasses}[{@code subpass}].{@code pInputAttachments}[{@code inputAttachmentIndex}].</li>
 * <li>The specified input attachment <b>must</b> have more than one aspect mask.</li>
 * <li>{@code aspectMask} <b>must</b> be a subset of the aspect masks in the specified input attachment.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassInputAttachmentAspectCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code subpass} &ndash; an index into the {@code pSubpasses} array of the parent {@link VkRenderPassCreateInfo} structure.</li>
 * <li>{@code inputAttachmentIndex} &ndash; an index into the {@code pInputAttachments} of the specified subpass.</li>
 * <li>{@code aspectMask} &ndash; a mask of which aspect(s) <b>can</b> be accessed within the specified subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkInputAttachmentAspectReference {
 *     uint32_t subpass;
 *     uint32_t inputAttachmentIndex;
 *     VkImageAspectFlags aspectMask;
 * }</pre></code>
 */
public class VkInputAttachmentAspectReference extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBPASS,
        INPUTATTACHMENTINDEX,
        ASPECTMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBPASS = layout.offsetof(0);
        INPUTATTACHMENTINDEX = layout.offsetof(1);
        ASPECTMASK = layout.offsetof(2);
    }

    VkInputAttachmentAspectReference(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkInputAttachmentAspectReference} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkInputAttachmentAspectReference(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code subpass} field. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** Returns the value of the {@code inputAttachmentIndex} field. */
    @NativeType("uint32_t")
    public int inputAttachmentIndex() { return ninputAttachmentIndex(address()); }
    /** Returns the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }

    /** Sets the specified value to the {@code subpass} field. */
    public VkInputAttachmentAspectReference subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@code inputAttachmentIndex} field. */
    public VkInputAttachmentAspectReference inputAttachmentIndex(@NativeType("uint32_t") int value) { ninputAttachmentIndex(address(), value); return this; }
    /** Sets the specified value to the {@code aspectMask} field. */
    public VkInputAttachmentAspectReference aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkInputAttachmentAspectReference set(
        int subpass,
        int inputAttachmentIndex,
        int aspectMask
    ) {
        subpass(subpass);
        inputAttachmentIndex(inputAttachmentIndex);
        aspectMask(aspectMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkInputAttachmentAspectReference set(VkInputAttachmentAspectReference src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkInputAttachmentAspectReference} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReference malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReference} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReference calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReference} instance allocated with {@link BufferUtils}. */
    public static VkInputAttachmentAspectReference create() {
        return new VkInputAttachmentAspectReference(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReference} instance for the specified memory address. */
    public static VkInputAttachmentAspectReference create(long address) {
        return new VkInputAttachmentAspectReference(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReference createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkInputAttachmentAspectReference.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReference.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkInputAttachmentAspectReference} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkInputAttachmentAspectReference mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkInputAttachmentAspectReference} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkInputAttachmentAspectReference callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReference mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReference callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return memGetInt(struct + VkInputAttachmentAspectReference.SUBPASS); }
    /** Unsafe version of {@link #inputAttachmentIndex}. */
    public static int ninputAttachmentIndex(long struct) { return memGetInt(struct + VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX); }
    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkInputAttachmentAspectReference.ASPECTMASK); }

    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReference.SUBPASS, value); }
    /** Unsafe version of {@link #inputAttachmentIndex(int) inputAttachmentIndex}. */
    public static void ninputAttachmentIndex(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX, value); }
    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReference.ASPECTMASK, value); }

    // -----------------------------------

    /** An array of {@link VkInputAttachmentAspectReference} structs. */
    public static class Buffer extends StructBuffer<VkInputAttachmentAspectReference, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkInputAttachmentAspectReference.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInputAttachmentAspectReference#SIZEOF}, and its mark will be undefined.
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
        protected VkInputAttachmentAspectReference newInstance(long address) {
            return new VkInputAttachmentAspectReference(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkInputAttachmentAspectReference.nsubpass(address()); }
        /** Returns the value of the {@code inputAttachmentIndex} field. */
        @NativeType("uint32_t")
        public int inputAttachmentIndex() { return VkInputAttachmentAspectReference.ninputAttachmentIndex(address()); }
        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkInputAttachmentAspectReference.naspectMask(address()); }

        /** Sets the specified value to the {@code subpass} field. */
        public VkInputAttachmentAspectReference.Buffer subpass(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReference.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@code inputAttachmentIndex} field. */
        public VkInputAttachmentAspectReference.Buffer inputAttachmentIndex(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReference.ninputAttachmentIndex(address(), value); return this; }
        /** Sets the specified value to the {@code aspectMask} field. */
        public VkInputAttachmentAspectReference.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReference.naspectMask(address(), value); return this; }

    }

}