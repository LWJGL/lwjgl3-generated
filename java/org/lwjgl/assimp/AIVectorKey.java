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
 * A time-value pair specifying a certain 3D vector for the given time.
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
 * struct aiVectorKey {
 *     double mTime;
 *     {@link AIVector3D struct aiVector3D} mValue;
 * }</pre></code>
 */
@NativeType("struct aiVectorKey")
public class AIVectorKey extends Struct implements NativeResource {

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
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUE = layout.offsetof(1);
    }

    AIVectorKey(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIVectorKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIVectorKey(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mTime} field. */
    public double mTime() { return nmTime(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mValue} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mValue() { return nmValue(address()); }

    /** Sets the specified value to the {@code mTime} field. */
    public AIVectorKey mTime(double value) { nmTime(address(), value); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mValue} field. */
    public AIVectorKey mValue(@NativeType("struct aiVector3D") AIVector3D value) { nmValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIVectorKey set(
        double mTime,
        AIVector3D mValue
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
    public AIVectorKey set(AIVectorKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIVectorKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIVectorKey malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIVectorKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIVectorKey calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIVectorKey} instance allocated with {@link BufferUtils}. */
    public static AIVectorKey create() {
        return new AIVectorKey(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIVectorKey} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIVectorKey create(long address) {
        return address == NULL ? null : new AIVectorKey(address, null);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AIVectorKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIVectorKey} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIVectorKey mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIVectorKey} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIVectorKey callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIVectorKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVectorKey mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIVectorKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVectorKey callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return memGetDouble(struct + AIVectorKey.MTIME); }
    /** Unsafe version of {@link #mValue}. */
    public static AIVector3D nmValue(long struct) { return AIVector3D.create(struct + AIVectorKey.MVALUE); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { memPutDouble(struct + AIVectorKey.MTIME, value); }
    /** Unsafe version of {@link #mValue(AIVector3D) mValue}. */
    public static void nmValue(long struct, AIVector3D value) { memCopy(value.address(), struct + AIVectorKey.MVALUE, AIVector3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link AIVectorKey} structs. */
    public static class Buffer extends StructBuffer<AIVectorKey, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIVectorKey.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIVectorKey#SIZEOF}, and its mark will be undefined.
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
        protected AIVectorKey newInstance(long address) {
            return new AIVectorKey(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mTime} field. */
        public double mTime() { return AIVectorKey.nmTime(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mValue} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mValue() { return AIVectorKey.nmValue(address()); }

        /** Sets the specified value to the {@code mTime} field. */
        public AIVectorKey.Buffer mTime(double value) { AIVectorKey.nmTime(address(), value); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mValue} field. */
        public AIVectorKey.Buffer mValue(@NativeType("struct aiVector3D") AIVector3D value) { AIVectorKey.nmValue(address(), value); return this; }

    }

}