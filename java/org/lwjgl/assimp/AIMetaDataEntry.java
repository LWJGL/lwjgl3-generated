/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiMetadataEntry {
 *     aiMetadataType mType;
 *     void * mData;
 * }</pre></code>
 */
@NativeType("struct aiMetadataEntry")
public class AIMetaDataEntry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTYPE,
        MDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTYPE = layout.offsetof(0);
        MDATA = layout.offsetof(1);
    }

    AIMetaDataEntry(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIMetaDataEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMetaDataEntry(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mType} field. */
    @NativeType("aiMetadataType")
    public int mType() { return nmType(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code mData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer mData(int capacity) { return nmData(address(), capacity); }

    /** Sets the specified value to the {@code mType} field. */
    public AIMetaDataEntry mType(@NativeType("aiMetadataType") int value) { nmType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code mData} field. */
    public AIMetaDataEntry mData(@NativeType("void *") ByteBuffer value) { nmData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMetaDataEntry set(
        int mType,
        ByteBuffer mData
    ) {
        mType(mType);
        mData(mData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMetaDataEntry set(AIMetaDataEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIMetaDataEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMetaDataEntry malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIMetaDataEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMetaDataEntry calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIMetaDataEntry} instance allocated with {@link BufferUtils}. */
    public static AIMetaDataEntry create() {
        return new AIMetaDataEntry(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIMetaDataEntry} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIMetaDataEntry create(long address) {
        return address == NULL ? null : new AIMetaDataEntry(address, null);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AIMetaDataEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIMetaDataEntry} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIMetaDataEntry mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIMetaDataEntry} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIMetaDataEntry callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIMetaDataEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaDataEntry mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIMetaDataEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaDataEntry callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mType}. */
    public static int nmType(long struct) { return memGetInt(struct + AIMetaDataEntry.MTYPE); }
    /** Unsafe version of {@link #mData(int) mData}. */
    public static ByteBuffer nmData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AIMetaDataEntry.MDATA), capacity); }

    /** Unsafe version of {@link #mType(int) mType}. */
    public static void nmType(long struct, int value) { memPutInt(struct + AIMetaDataEntry.MTYPE, value); }
    /** Unsafe version of {@link #mData(ByteBuffer) mData}. */
    public static void nmData(long struct, ByteBuffer value) { memPutAddress(struct + AIMetaDataEntry.MDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMetaDataEntry.MDATA));
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

    /** An array of {@link AIMetaDataEntry} structs. */
    public static class Buffer extends StructBuffer<AIMetaDataEntry, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIMetaDataEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMetaDataEntry#SIZEOF}, and its mark will be undefined.
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
        protected AIMetaDataEntry newInstance(long address) {
            return new AIMetaDataEntry(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mType} field. */
        @NativeType("aiMetadataType")
        public int mType() { return AIMetaDataEntry.nmType(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code mData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer mData(int capacity) { return AIMetaDataEntry.nmData(address(), capacity); }

        /** Sets the specified value to the {@code mType} field. */
        public AIMetaDataEntry.Buffer mType(@NativeType("aiMetadataType") int value) { AIMetaDataEntry.nmType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code mData} field. */
        public AIMetaDataEntry.Buffer mData(@NativeType("void *") ByteBuffer value) { AIMetaDataEntry.nmData(address(), value); return this; }

    }

}