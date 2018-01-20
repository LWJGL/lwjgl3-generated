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
 * <li>There <b>must</b> be an input attachment at {@code pCreateInfo}{@code ::pSubpasses}[{@code subpass}].{@code pInputAttachments}[{@code inputAttachment}].</li>
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
 * <p>{@link VkRenderPassInputAttachmentAspectCreateInfoKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code subpass} &ndash; an index into the {@code pSubpasses} array of the parent {@link VkRenderPassCreateInfo} structure.</li>
 * <li>{@code aspectMask} &ndash; a mask of which aspect(s) <b>can</b> be accessed within the specified subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkInputAttachmentAspectReferenceKHR {
 *     uint32_t subpass;
 *     uint32_t inputAttachmentIndex;
 *     VkImageAspectFlags aspectMask;
 * }</pre></code>
 */
public class VkInputAttachmentAspectReferenceKHR extends Struct implements NativeResource {

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

    VkInputAttachmentAspectReferenceKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkInputAttachmentAspectReferenceKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkInputAttachmentAspectReferenceKHR(ByteBuffer container) {
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
    public VkInputAttachmentAspectReferenceKHR subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@code inputAttachmentIndex} field. */
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndex(@NativeType("uint32_t") int value) { ninputAttachmentIndex(address(), value); return this; }
    /** Sets the specified value to the {@code aspectMask} field. */
    public VkInputAttachmentAspectReferenceKHR aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkInputAttachmentAspectReferenceKHR set(
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
    public VkInputAttachmentAspectReferenceKHR set(VkInputAttachmentAspectReferenceKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReferenceKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReferenceKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated with {@link BufferUtils}. */
    public static VkInputAttachmentAspectReferenceKHR create() {
        return new VkInputAttachmentAspectReferenceKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance for the specified memory address. */
    public static VkInputAttachmentAspectReferenceKHR create(long address) {
        return new VkInputAttachmentAspectReferenceKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReferenceKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReferenceKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkInputAttachmentAspectReferenceKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkInputAttachmentAspectReferenceKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReferenceKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReferenceKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReferenceKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return memGetInt(struct + VkInputAttachmentAspectReferenceKHR.SUBPASS); }
    /** Unsafe version of {@link #inputAttachmentIndex}. */
    public static int ninputAttachmentIndex(long struct) { return memGetInt(struct + VkInputAttachmentAspectReferenceKHR.INPUTATTACHMENTINDEX); }
    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkInputAttachmentAspectReferenceKHR.ASPECTMASK); }

    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReferenceKHR.SUBPASS, value); }
    /** Unsafe version of {@link #inputAttachmentIndex(int) inputAttachmentIndex}. */
    public static void ninputAttachmentIndex(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReferenceKHR.INPUTATTACHMENTINDEX, value); }
    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkInputAttachmentAspectReferenceKHR.ASPECTMASK, value); }

    // -----------------------------------

    /** An array of {@link VkInputAttachmentAspectReferenceKHR} structs. */
    public static class Buffer extends StructBuffer<VkInputAttachmentAspectReferenceKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkInputAttachmentAspectReferenceKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInputAttachmentAspectReferenceKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkInputAttachmentAspectReferenceKHR newInstance(long address) {
            return new VkInputAttachmentAspectReferenceKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkInputAttachmentAspectReferenceKHR.nsubpass(address()); }
        /** Returns the value of the {@code inputAttachmentIndex} field. */
        @NativeType("uint32_t")
        public int inputAttachmentIndex() { return VkInputAttachmentAspectReferenceKHR.ninputAttachmentIndex(address()); }
        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkInputAttachmentAspectReferenceKHR.naspectMask(address()); }

        /** Sets the specified value to the {@code subpass} field. */
        public VkInputAttachmentAspectReferenceKHR.Buffer subpass(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReferenceKHR.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@code inputAttachmentIndex} field. */
        public VkInputAttachmentAspectReferenceKHR.Buffer inputAttachmentIndex(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReferenceKHR.ninputAttachmentIndex(address(), value); return this; }
        /** Sets the specified value to the {@code aspectMask} field. */
        public VkInputAttachmentAspectReferenceKHR.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReferenceKHR.naspectMask(address(), value); return this; }

    }

}