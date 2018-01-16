/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A single bone of a mesh.
 * 
 * <p>A bone has a name by which it can be found in the frame hierarchy and by which it can be addressed by animations. In addition it has a number of
 * influences on vertices.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; The name of the bone.</li>
 * <li>{@code mNumWeights} &ndash; The number of vertices affected by this bone. The maximum value for this member is {@link Assimp#AI_MAX_BONE_WEIGHTS}.</li>
 * <li>{@code mWeights} &ndash; The vertices affected by this bone</li>
 * <li>{@code mOffsetMatrix} &ndash; Matrix that transforms from mesh space to bone space in bind pose</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiBone {
 *     {@link AIString struct aiString} mName;
 *     unsigned int mNumWeights;
 *     {@link AIVertexWeight struct aiVertexWeight} * mWeights;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mOffsetMatrix;
 * }</pre></code>
 */
@NativeType("struct aiBone")
public class AIBone extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMWEIGHTS,
        MWEIGHTS,
        MOFFSETMATRIX;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMWEIGHTS = layout.offsetof(1);
        MWEIGHTS = layout.offsetof(2);
        MOFFSETMATRIX = layout.offsetof(3);
    }

    AIBone(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIBone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIBone(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns the value of the {@code mNumWeights} field. */
    @NativeType("unsigned int")
    public int mNumWeights() { return nmNumWeights(address()); }
    /** Returns a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
    @NativeType("struct aiVertexWeight *")
    public AIVertexWeight.Buffer mWeights() { return nmWeights(address()); }
    /** Returns a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mOffsetMatrix() { return nmOffsetMatrix(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIBone mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
    public AIBone mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { nmWeights(address(), value); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
    public AIBone mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmOffsetMatrix(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIBone set(
        AIString mName,
        AIVertexWeight.Buffer mWeights,
        AIMatrix4x4 mOffsetMatrix
    ) {
        mName(mName);
        mWeights(mWeights);
        mOffsetMatrix(mOffsetMatrix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIBone set(AIBone src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIBone} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIBone malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIBone} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIBone calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIBone} instance allocated with {@link BufferUtils}. */
    public static AIBone create() {
        return new AIBone(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIBone} instance for the specified memory address. */
    public static AIBone create(long address) {
        return new AIBone(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIBone createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIBone.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIBone.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIBone} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIBone mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIBone} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIBone callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIBone} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIBone mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIBone} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIBone callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIBone.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIBone.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIBone.MNAME); }
    /** Unsafe version of {@link #mNumWeights}. */
    public static int nmNumWeights(long struct) { return memGetInt(struct + AIBone.MNUMWEIGHTS); }
    /** Unsafe version of {@link #mWeights}. */
    public static AIVertexWeight.Buffer nmWeights(long struct) { return AIVertexWeight.create(memGetAddress(struct + AIBone.MWEIGHTS), nmNumWeights(struct)); }
    /** Unsafe version of {@link #mOffsetMatrix}. */
    public static AIMatrix4x4 nmOffsetMatrix(long struct) { return AIMatrix4x4.create(struct + AIBone.MOFFSETMATRIX); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIBone.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumWeights} field of the specified {@code struct}. */
    public static void nmNumWeights(long struct, int value) { memPutInt(struct + AIBone.MNUMWEIGHTS, value); }
    /** Unsafe version of {@link #mWeights(AIVertexWeight.Buffer) mWeights}. */
    public static void nmWeights(long struct, AIVertexWeight.Buffer value) { memPutAddress(struct + AIBone.MWEIGHTS, value.address()); nmNumWeights(struct, value.remaining()); }
    /** Unsafe version of {@link #mOffsetMatrix(AIMatrix4x4) mOffsetMatrix}. */
    public static void nmOffsetMatrix(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AIBone.MOFFSETMATRIX, AIMatrix4x4.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIBone.MWEIGHTS));
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

    /** An array of {@link AIBone} structs. */
    public static class Buffer extends StructBuffer<AIBone, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIBone.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIBone#SIZEOF}, and its mark will be undefined.
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
        protected AIBone newInstance(long address) {
            return new AIBone(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIBone.nmName(address()); }
        /** Returns the value of the {@code mNumWeights} field. */
        @NativeType("unsigned int")
        public int mNumWeights() { return AIBone.nmNumWeights(address()); }
        /** Returns a {@link AIVertexWeight.Buffer} view of the struct array pointed to by the {@code mWeights} field. */
        @NativeType("struct aiVertexWeight *")
        public AIVertexWeight.Buffer mWeights() { return AIBone.nmWeights(address()); }
        /** Returns a {@link AIMatrix4x4} view of the {@code mOffsetMatrix} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mOffsetMatrix() { return AIBone.nmOffsetMatrix(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIBone.Buffer mName(@NativeType("struct aiString") AIString value) { AIBone.nmName(address(), value); return this; }
        /** Sets the address of the specified {@link AIVertexWeight.Buffer} to the {@code mWeights} field. */
        public AIBone.Buffer mWeights(@NativeType("struct aiVertexWeight *") AIVertexWeight.Buffer value) { AIBone.nmWeights(address(), value); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mOffsetMatrix} field. */
        public AIBone.Buffer mOffsetMatrix(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AIBone.nmOffsetMatrix(address(), value); return this; }

    }

}