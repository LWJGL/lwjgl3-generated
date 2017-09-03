/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A time-value pair specifying a rotation for the given time. Rotations are expressed with quaternions.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mTime} &ndash; The time of this key</li>
 * <li>{@code mValue} &ndash; The value of this key</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiQuatKey {
 *     double mTime;
 *     {@link AIQuaternion struct aiQuaternion} mValue;
 * }</pre></code>
 */
@NativeType("struct aiQuatKey")
public class AIQuatKey extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTIME,
        MVALUE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(AIQuaternion.SIZEOF, AIQuaternion.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUE = layout.offsetof(1);
    }

    AIQuatKey(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIQuatKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIQuatKey(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mTime} field. */
    public double mTime() { return nmTime(address()); }
    /** Returns a {@link AIQuaternion} view of the {@code mValue} field. */
    @NativeType("struct aiQuaternion")
    public AIQuaternion mValue() { return nmValue(address()); }

    /** Sets the specified value to the {@code mTime} field. */
    public AIQuatKey mTime(double value) { nmTime(address(), value); return this; }
    /** Copies the specified {@link AIQuaternion} to the {@code mValue} field. */
    public AIQuatKey mValue(@NativeType("struct aiQuaternion") AIQuaternion value) { nmValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIQuatKey set(
        double mTime,
        AIQuaternion mValue
    ) {
        mTime(mTime);
        mValue(mValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIQuatKey set(AIQuatKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIQuatKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIQuatKey malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIQuatKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIQuatKey calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIQuatKey} instance allocated with {@link BufferUtils}. */
    public static AIQuatKey create() {
        return new AIQuatKey(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIQuatKey} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIQuatKey create(long address) {
        return address == NULL ? null : new AIQuatKey(address, null);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIQuatKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIQuatKey} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIQuatKey mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIQuatKey} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIQuatKey callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIQuatKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuatKey mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIQuatKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuatKey callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return memGetDouble(struct + AIQuatKey.MTIME); }
    /** Unsafe version of {@link #mValue}. */
    public static AIQuaternion nmValue(long struct) { return AIQuaternion.create(struct + AIQuatKey.MVALUE); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { memPutDouble(struct + AIQuatKey.MTIME, value); }
    /** Unsafe version of {@link #mValue(AIQuaternion) mValue}. */
    public static void nmValue(long struct, AIQuaternion value) { memCopy(value.address(), struct + AIQuatKey.MVALUE, AIQuaternion.SIZEOF); }

    // -----------------------------------

    /** An array of {@link AIQuatKey} structs. */
    public static class Buffer extends StructBuffer<AIQuatKey, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIQuatKey.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIQuatKey#SIZEOF}, and its mark will be undefined.
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
        protected AIQuatKey newInstance(long address) {
            return new AIQuatKey(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mTime} field. */
        public double mTime() { return AIQuatKey.nmTime(address()); }
        /** Returns a {@link AIQuaternion} view of the {@code mValue} field. */
        @NativeType("struct aiQuaternion")
        public AIQuaternion mValue() { return AIQuatKey.nmValue(address()); }

        /** Sets the specified value to the {@code mTime} field. */
        public AIQuatKey.Buffer mTime(double value) { AIQuatKey.nmTime(address(), value); return this; }
        /** Copies the specified {@link AIQuaternion} to the {@code mValue} field. */
        public AIQuatKey.Buffer mValue(@NativeType("struct aiQuaternion") AIQuaternion value) { AIQuatKey.nmValue(address(), value); return this; }

    }

}