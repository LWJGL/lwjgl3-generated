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
 * Describes the animation of a single node. The name specifies the bone/node which is affected by this animation channel. The keyframes are given in
 * three separate series of values, one each for position, rotation and scaling. The transformation matrix computed from these values replaces the node's
 * original transformation matrix at a specific time.
 * 
 * <p>This means all keys are absolute and not relative to the bone default pose. The order in which the transformations are applied is - as usual - scaling,
 * rotation, translation.</p>
 * 
 * <h5>Note:</h5>
 * 
 * <p>All keys are returned in their correct, chronological order. Duplicate keys don't pass the validation step. Most likely there will be no negative time
 * values, but they are not forbidden also ( so implementations need to cope with them! )</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mNodeName} &ndash; The name of the node affected by this animation. The node must exist and it must be unique.</li>
 * <li>{@code mNumPositionKeys} &ndash; The number of position keys</li>
 * <li>{@code mPositionKeys} &ndash; 
 * The position keys of this animation channel. Positions are specified as 3D vector. The array is {@code mNumPositionKeys} in size. If there are position
 * keys, there will also be at least one scaling and one rotation key.</li>
 * <li>{@code mNumRotationKeys} &ndash; The number of rotation keys</li>
 * <li>{@code mRotationKeys} &ndash; 
 * The rotation keys of this animation channel. Rotations are given as quaternions,  which are 4D vectors. The array is {@code mNumRotationKeys} in size.
 * If there are rotation keys, there will also be at least one scaling and one position key.</li>
 * <li>{@code mNumScalingKeys} &ndash; The number of scaling keys</li>
 * <li>{@code mScalingKeys} &ndash; 
 * The scaling keys of this animation channel. Scalings are specified as 3D vector. The array is {@code mNumScalingKeys} in size. If there are scaling
 * keys, there will also be at least one position and one rotation key.</li>
 * <li>{@code mPreState} &ndash; 
 * Defines how the animation behaves before the first key is encountered. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix
 * of the affected node is used).</li>
 * <li>{@code mPostState} &ndash; 
 * Defines how the animation behaves after the last key was processed. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix of
 * the affected node is taken).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiNodeAnim {
 *     {@link AIString struct aiString} mNodeName;
 *     unsigned int mNumPositionKeys;
 *     {@link AIVectorKey struct aiVectorKey} * mPositionKeys;
 *     unsigned int mNumRotationKeys;
 *     {@link AIQuatKey struct aiQuatKey} * mRotationKeys;
 *     unsigned int mNumScalingKeys;
 *     {@link AIVectorKey struct aiVectorKey} * mScalingKeys;
 *     aiAnimBehaviour mPreState;
 *     aiAnimBehaviour mPostState;
 * }</pre></code>
 */
@NativeType("struct aiNodeAnim")
public class AINodeAnim extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNODENAME,
        MNUMPOSITIONKEYS,
        MPOSITIONKEYS,
        MNUMROTATIONKEYS,
        MROTATIONKEYS,
        MNUMSCALINGKEYS,
        MSCALINGKEYS,
        MPRESTATE,
        MPOSTSTATE;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNODENAME = layout.offsetof(0);
        MNUMPOSITIONKEYS = layout.offsetof(1);
        MPOSITIONKEYS = layout.offsetof(2);
        MNUMROTATIONKEYS = layout.offsetof(3);
        MROTATIONKEYS = layout.offsetof(4);
        MNUMSCALINGKEYS = layout.offsetof(5);
        MSCALINGKEYS = layout.offsetof(6);
        MPRESTATE = layout.offsetof(7);
        MPOSTSTATE = layout.offsetof(8);
    }

    AINodeAnim(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AINodeAnim} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AINodeAnim(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mNodeName} field. */
    @NativeType("struct aiString")
    public AIString mNodeName() { return nmNodeName(address()); }
    /** Returns the value of the {@code mNumPositionKeys} field. */
    @NativeType("unsigned int")
    public int mNumPositionKeys() { return nmNumPositionKeys(address()); }
    /** Returns a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mPositionKeys} field. */
    @NativeType("struct aiVectorKey *")
    public AIVectorKey.Buffer mPositionKeys() { return nmPositionKeys(address()); }
    /** Returns the value of the {@code mNumRotationKeys} field. */
    @NativeType("unsigned int")
    public int mNumRotationKeys() { return nmNumRotationKeys(address()); }
    /** Returns a {@link AIQuatKey.Buffer} view of the struct array pointed to by the {@code mRotationKeys} field. */
    @NativeType("struct aiQuatKey *")
    public AIQuatKey.Buffer mRotationKeys() { return nmRotationKeys(address()); }
    /** Returns the value of the {@code mNumScalingKeys} field. */
    @NativeType("unsigned int")
    public int mNumScalingKeys() { return nmNumScalingKeys(address()); }
    /** Returns a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mScalingKeys} field. */
    @NativeType("struct aiVectorKey *")
    public AIVectorKey.Buffer mScalingKeys() { return nmScalingKeys(address()); }
    /** Returns the value of the {@code mPreState} field. */
    @NativeType("aiAnimBehaviour")
    public int mPreState() { return nmPreState(address()); }
    /** Returns the value of the {@code mPostState} field. */
    @NativeType("aiAnimBehaviour")
    public int mPostState() { return nmPostState(address()); }

    /** Copies the specified {@link AIString} to the {@code mNodeName} field. */
    public AINodeAnim mNodeName(@NativeType("struct aiString") AIString value) { nmNodeName(address(), value); return this; }
    /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mPositionKeys} field. */
    public AINodeAnim mPositionKeys(@NativeType("struct aiVectorKey *") AIVectorKey.Buffer value) { nmPositionKeys(address(), value); return this; }
    /** Sets the address of the specified {@link AIQuatKey.Buffer} to the {@code mRotationKeys} field. */
    public AINodeAnim mRotationKeys(@NativeType("struct aiQuatKey *") AIQuatKey.Buffer value) { nmRotationKeys(address(), value); return this; }
    /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mScalingKeys} field. */
    public AINodeAnim mScalingKeys(@NativeType("struct aiVectorKey *") AIVectorKey.Buffer value) { nmScalingKeys(address(), value); return this; }
    /** Sets the specified value to the {@code mPreState} field. */
    public AINodeAnim mPreState(@NativeType("aiAnimBehaviour") int value) { nmPreState(address(), value); return this; }
    /** Sets the specified value to the {@code mPostState} field. */
    public AINodeAnim mPostState(@NativeType("aiAnimBehaviour") int value) { nmPostState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AINodeAnim set(
        AIString mNodeName,
        AIVectorKey.Buffer mPositionKeys,
        AIQuatKey.Buffer mRotationKeys,
        AIVectorKey.Buffer mScalingKeys,
        int mPreState,
        int mPostState
    ) {
        mNodeName(mNodeName);
        mPositionKeys(mPositionKeys);
        mRotationKeys(mRotationKeys);
        mScalingKeys(mScalingKeys);
        mPreState(mPreState);
        mPostState(mPostState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AINodeAnim set(AINodeAnim src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AINodeAnim} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AINodeAnim malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AINodeAnim} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AINodeAnim calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AINodeAnim} instance allocated with {@link BufferUtils}. */
    public static AINodeAnim create() {
        return new AINodeAnim(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AINodeAnim} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AINodeAnim create(long address) {
        return address == NULL ? null : new AINodeAnim(address, null);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AINodeAnim.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AINodeAnim} instance allocated on the thread-local {@link MemoryStack}. */
    public static AINodeAnim mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AINodeAnim} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AINodeAnim callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AINodeAnim} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AINodeAnim mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AINodeAnim} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AINodeAnim callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINodeAnim.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mNodeName}. */
    public static AIString nmNodeName(long struct) { return AIString.create(struct + AINodeAnim.MNODENAME); }
    /** Unsafe version of {@link #mNumPositionKeys}. */
    public static int nmNumPositionKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMPOSITIONKEYS); }
    /** Unsafe version of {@link #mPositionKeys}. */
    public static AIVectorKey.Buffer nmPositionKeys(long struct) { return AIVectorKey.create(memGetAddress(struct + AINodeAnim.MPOSITIONKEYS), nmNumPositionKeys(struct)); }
    /** Unsafe version of {@link #mNumRotationKeys}. */
    public static int nmNumRotationKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMROTATIONKEYS); }
    /** Unsafe version of {@link #mRotationKeys}. */
    public static AIQuatKey.Buffer nmRotationKeys(long struct) { return AIQuatKey.create(memGetAddress(struct + AINodeAnim.MROTATIONKEYS), nmNumRotationKeys(struct)); }
    /** Unsafe version of {@link #mNumScalingKeys}. */
    public static int nmNumScalingKeys(long struct) { return memGetInt(struct + AINodeAnim.MNUMSCALINGKEYS); }
    /** Unsafe version of {@link #mScalingKeys}. */
    public static AIVectorKey.Buffer nmScalingKeys(long struct) { return AIVectorKey.create(memGetAddress(struct + AINodeAnim.MSCALINGKEYS), nmNumScalingKeys(struct)); }
    /** Unsafe version of {@link #mPreState}. */
    public static int nmPreState(long struct) { return memGetInt(struct + AINodeAnim.MPRESTATE); }
    /** Unsafe version of {@link #mPostState}. */
    public static int nmPostState(long struct) { return memGetInt(struct + AINodeAnim.MPOSTSTATE); }

    /** Unsafe version of {@link #mNodeName(AIString) mNodeName}. */
    public static void nmNodeName(long struct, AIString value) { memCopy(value.address(), struct + AINodeAnim.MNODENAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumPositionKeys} field of the specified {@code struct}. */
    public static void nmNumPositionKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMPOSITIONKEYS, value); }
    /** Unsafe version of {@link #mPositionKeys(AIVectorKey.Buffer) mPositionKeys}. */
    public static void nmPositionKeys(long struct, AIVectorKey.Buffer value) { memPutAddress(struct + AINodeAnim.MPOSITIONKEYS, addressSafe(value)); nmNumPositionKeys(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumRotationKeys} field of the specified {@code struct}. */
    public static void nmNumRotationKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMROTATIONKEYS, value); }
    /** Unsafe version of {@link #mRotationKeys(AIQuatKey.Buffer) mRotationKeys}. */
    public static void nmRotationKeys(long struct, AIQuatKey.Buffer value) { memPutAddress(struct + AINodeAnim.MROTATIONKEYS, addressSafe(value)); nmNumRotationKeys(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumScalingKeys} field of the specified {@code struct}. */
    public static void nmNumScalingKeys(long struct, int value) { memPutInt(struct + AINodeAnim.MNUMSCALINGKEYS, value); }
    /** Unsafe version of {@link #mScalingKeys(AIVectorKey.Buffer) mScalingKeys}. */
    public static void nmScalingKeys(long struct, AIVectorKey.Buffer value) { memPutAddress(struct + AINodeAnim.MSCALINGKEYS, addressSafe(value)); nmNumScalingKeys(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mPreState(int) mPreState}. */
    public static void nmPreState(long struct, int value) { memPutInt(struct + AINodeAnim.MPRESTATE, value); }
    /** Unsafe version of {@link #mPostState(int) mPostState}. */
    public static void nmPostState(long struct, int value) { memPutInt(struct + AINodeAnim.MPOSTSTATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmNumPositionKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MPOSITIONKEYS));
        }
        if (nmNumRotationKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MROTATIONKEYS));
        }
        if (nmNumScalingKeys(struct) != 0) {
            check(memGetAddress(struct + AINodeAnim.MSCALINGKEYS));
        }
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

    /** An array of {@link AINodeAnim} structs. */
    public static class Buffer extends StructBuffer<AINodeAnim, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AINodeAnim.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AINodeAnim#SIZEOF}, and its mark will be undefined.
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
        protected AINodeAnim newInstance(long address) {
            return new AINodeAnim(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mNodeName} field. */
        @NativeType("struct aiString")
        public AIString mNodeName() { return AINodeAnim.nmNodeName(address()); }
        /** Returns the value of the {@code mNumPositionKeys} field. */
        @NativeType("unsigned int")
        public int mNumPositionKeys() { return AINodeAnim.nmNumPositionKeys(address()); }
        /** Returns a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mPositionKeys} field. */
        @NativeType("struct aiVectorKey *")
        public AIVectorKey.Buffer mPositionKeys() { return AINodeAnim.nmPositionKeys(address()); }
        /** Returns the value of the {@code mNumRotationKeys} field. */
        @NativeType("unsigned int")
        public int mNumRotationKeys() { return AINodeAnim.nmNumRotationKeys(address()); }
        /** Returns a {@link AIQuatKey.Buffer} view of the struct array pointed to by the {@code mRotationKeys} field. */
        @NativeType("struct aiQuatKey *")
        public AIQuatKey.Buffer mRotationKeys() { return AINodeAnim.nmRotationKeys(address()); }
        /** Returns the value of the {@code mNumScalingKeys} field. */
        @NativeType("unsigned int")
        public int mNumScalingKeys() { return AINodeAnim.nmNumScalingKeys(address()); }
        /** Returns a {@link AIVectorKey.Buffer} view of the struct array pointed to by the {@code mScalingKeys} field. */
        @NativeType("struct aiVectorKey *")
        public AIVectorKey.Buffer mScalingKeys() { return AINodeAnim.nmScalingKeys(address()); }
        /** Returns the value of the {@code mPreState} field. */
        @NativeType("aiAnimBehaviour")
        public int mPreState() { return AINodeAnim.nmPreState(address()); }
        /** Returns the value of the {@code mPostState} field. */
        @NativeType("aiAnimBehaviour")
        public int mPostState() { return AINodeAnim.nmPostState(address()); }

        /** Copies the specified {@link AIString} to the {@code mNodeName} field. */
        public AINodeAnim.Buffer mNodeName(@NativeType("struct aiString") AIString value) { AINodeAnim.nmNodeName(address(), value); return this; }
        /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mPositionKeys} field. */
        public AINodeAnim.Buffer mPositionKeys(@NativeType("struct aiVectorKey *") AIVectorKey.Buffer value) { AINodeAnim.nmPositionKeys(address(), value); return this; }
        /** Sets the address of the specified {@link AIQuatKey.Buffer} to the {@code mRotationKeys} field. */
        public AINodeAnim.Buffer mRotationKeys(@NativeType("struct aiQuatKey *") AIQuatKey.Buffer value) { AINodeAnim.nmRotationKeys(address(), value); return this; }
        /** Sets the address of the specified {@link AIVectorKey.Buffer} to the {@code mScalingKeys} field. */
        public AINodeAnim.Buffer mScalingKeys(@NativeType("struct aiVectorKey *") AIVectorKey.Buffer value) { AINodeAnim.nmScalingKeys(address(), value); return this; }
        /** Sets the specified value to the {@code mPreState} field. */
        public AINodeAnim.Buffer mPreState(@NativeType("aiAnimBehaviour") int value) { AINodeAnim.nmPreState(address(), value); return this; }
        /** Sets the specified value to the {@code mPostState} field. */
        public AINodeAnim.Buffer mPostState(@NativeType("aiAnimBehaviour") int value) { AINodeAnim.nmPostState(address(), value); return this; }

    }

}