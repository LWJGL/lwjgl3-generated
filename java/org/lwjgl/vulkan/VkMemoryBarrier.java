/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a global memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_MEMORY_BARRIER STRUCTURE_TYPE_MEMORY_BARRIER}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, {@link VK10#vkCmdWaitEvents CmdWaitEvents}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-access-masks">source access mask</a>.</li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-access-masks">destination access mask</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkMemoryBarrier {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 * }</pre></code>
 */
public class VkMemoryBarrier extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK,
        DSTACCESSMASK;

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
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
    }

    VkMemoryBarrier(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryBarrier(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** Returns the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryBarrier sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryBarrier pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryBarrier set(
        int sType,
        long pNext,
        int srcAccessMask,
        int dstAccessMask
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryBarrier set(VkMemoryBarrier src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkMemoryBarrier} instance allocated with {@link BufferUtils}. */
    public static VkMemoryBarrier create() {
        return new VkMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkMemoryBarrier create(long address) {
        return address == NULL ? null : new VkMemoryBarrier(address, null);
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkMemoryBarrier.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkMemoryBarrier} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryBarrier mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkMemoryBarrier} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryBarrier callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryBarrier.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrier.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.DSTACCESSMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryBarrier.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrier.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.DSTACCESSMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryBarrier} structs. */
    public static class Buffer extends StructBuffer<VkMemoryBarrier, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkMemoryBarrier.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryBarrier newInstance(long address) {
            return new VkMemoryBarrier(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryBarrier.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkMemoryBarrier.npNext(address()); }
        /** Returns the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkMemoryBarrier.nsrcAccessMask(address()); }
        /** Returns the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkMemoryBarrier.ndstAccessMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryBarrier.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryBarrier.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryBarrier.Buffer pNext(@NativeType("const void *") long value) { VkMemoryBarrier.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkMemoryBarrier.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkMemoryBarrier.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkMemoryBarrier.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkMemoryBarrier.ndstAccessMask(address(), value); return this; }

    }

}