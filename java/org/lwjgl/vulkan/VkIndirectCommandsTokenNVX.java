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
 * Structure specifying parameters for the reservation of command buffer space.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code buffer}&#8217;s usage flag <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set.</li>
 * <li>The {@code offset} <b>must</b> be aligned to {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::minCommandsTokenBufferOffsetAlignment}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNVX} value</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCmdProcessCommandsInfoNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code tokenType} &ndash; specifies the token command type.</li>
 * <li>{@code buffer} &ndash; specifies the {@code VkBuffer} storing the functional arguments for each squence. These argumetns can be written by the device.</li>
 * <li>{@code offset} &ndash; specified an offset into {@code buffer} where the arguments start.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkIndirectCommandsTokenNVX {
 *     VkIndirectCommandsTokenTypeNVX tokenType;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 * }</pre></code>
 */
public class VkIndirectCommandsTokenNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOKENTYPE,
        BUFFER,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOKENTYPE = layout.offsetof(0);
        BUFFER = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    VkIndirectCommandsTokenNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkIndirectCommandsTokenNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsTokenNVX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code tokenType} field. */
    public int tokenType() { return ntokenType(address()); }
    /** Returns the value of the {@code buffer} field. */
    public long buffer() { return nbuffer(address()); }
    /** Returns the value of the {@code offset} field. */
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@code tokenType} field. */
    public VkIndirectCommandsTokenNVX tokenType(int value) { ntokenType(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkIndirectCommandsTokenNVX buffer(long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkIndirectCommandsTokenNVX offset(long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsTokenNVX set(
        int tokenType,
        long buffer,
        long offset
    ) {
        tokenType(tokenType);
        buffer(buffer);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsTokenNVX set(VkIndirectCommandsTokenNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenNVX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenNVX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsTokenNVX create() {
        return new VkIndirectCommandsTokenNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkIndirectCommandsTokenNVX create(long address) {
        return address == NULL ? null : new VkIndirectCommandsTokenNVX(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkIndirectCommandsTokenNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkIndirectCommandsTokenNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkIndirectCommandsTokenNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tokenType}. */
    public static int ntokenType(long struct) { return memGetInt(struct + VkIndirectCommandsTokenNVX.TOKENTYPE); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkIndirectCommandsTokenNVX.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkIndirectCommandsTokenNVX.OFFSET); }

    /** Unsafe version of {@link #tokenType(int) tokenType}. */
    public static void ntokenType(long struct, int value) { memPutInt(struct + VkIndirectCommandsTokenNVX.TOKENTYPE, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkIndirectCommandsTokenNVX.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkIndirectCommandsTokenNVX.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsTokenNVX} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsTokenNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkIndirectCommandsTokenNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsTokenNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkIndirectCommandsTokenNVX newInstance(long address) {
            return new VkIndirectCommandsTokenNVX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code tokenType} field. */
        public int tokenType() { return VkIndirectCommandsTokenNVX.ntokenType(address()); }
        /** Returns the value of the {@code buffer} field. */
        public long buffer() { return VkIndirectCommandsTokenNVX.nbuffer(address()); }
        /** Returns the value of the {@code offset} field. */
        public long offset() { return VkIndirectCommandsTokenNVX.noffset(address()); }

        /** Sets the specified value to the {@code tokenType} field. */
        public VkIndirectCommandsTokenNVX.Buffer tokenType(int value) { VkIndirectCommandsTokenNVX.ntokenType(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkIndirectCommandsTokenNVX.Buffer buffer(long value) { VkIndirectCommandsTokenNVX.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkIndirectCommandsTokenNVX.Buffer offset(long value) { VkIndirectCommandsTokenNVX.noffset(address(), value); return this; }

    }

}