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
 * Describes vertex-based animations for a single mesh or a group of meshes. Meshes carry the animation data for each frame in their
 * {@link AIMesh}{@code ::mAnimMeshes} array. The purpose of {@code aiMeshAnim} is to define keyframes linking each mesh attachment to a particular point in
 * time.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; 
 * Name of the mesh to be animated. An empty string is not allowed, animated meshes need to be named (not necessarily uniquely, the name can basically
 * serve as wildcard to select a group of meshes with similar animation setup)</li>
 * <li>{@code mNumKeys} &ndash; Size of the {@code mKeys} array. Must be 1, at least.</li>
 * <li>{@code mKeys} &ndash; Key frames of the animation. May not be {@code NULL}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiMeshAnim {
    {@link AIString struct aiString} mName;
    unsigned int mNumKeys;
    {@link AIMeshKey struct aiMeshKey} * mKeys;
}</code></pre>
 */
public class AIMeshAnim extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMKEYS,
        MKEYS;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMKEYS = layout.offsetof(1);
        MKEYS = layout.offsetof(2);
    }

    AIMeshAnim(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIMeshAnim} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMeshAnim(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    public AIString mName() { return nmName(address()); }
    /** Returns the value of the {@code mNumKeys} field. */
    public int mNumKeys() { return nmNumKeys(address()); }
    /** Returns a {@link AIMeshKey.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
    public AIMeshKey.Buffer mKeys() { return nmKeys(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIMeshAnim mName(AIString value) { nmName(address(), value); return this; }
    /** Sets the address of the specified {@link AIMeshKey.Buffer} to the {@code mKeys} field. */
    public AIMeshAnim mKeys(AIMeshKey.Buffer value) { nmKeys(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMeshAnim set(
        AIString mName,
        AIMeshKey.Buffer mKeys
    ) {
        mName(mName);
        mKeys(mKeys);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMeshAnim set(AIMeshAnim src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIMeshAnim} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMeshAnim malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIMeshAnim} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMeshAnim calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIMeshAnim} instance allocated with {@link BufferUtils}. */
    public static AIMeshAnim create() {
        return new AIMeshAnim(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIMeshAnim} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIMeshAnim create(long address) {
        return address == NULL ? null : new AIMeshAnim(address, null);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AIMeshAnim.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIMeshAnim} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIMeshAnim mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIMeshAnim} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIMeshAnim callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIMeshAnim} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshAnim mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshAnim} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshAnim callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshAnim.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIMeshAnim.MNAME); }
    /** Unsafe version of {@link #mNumKeys}. */
    public static int nmNumKeys(long struct) { return memGetInt(struct + AIMeshAnim.MNUMKEYS); }
    /** Unsafe version of {@link #mKeys}. */
    public static AIMeshKey.Buffer nmKeys(long struct) { return AIMeshKey.create(memGetAddress(struct + AIMeshAnim.MKEYS), nmNumKeys(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIMeshAnim.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumKeys} field of the specified {@code struct}. */
    public static void nmNumKeys(long struct, int value) { memPutInt(struct + AIMeshAnim.MNUMKEYS, value); }
    /** Unsafe version of {@link #mKeys(AIMeshKey.Buffer) mKeys}. */
    public static void nmKeys(long struct, AIMeshKey.Buffer value) { memPutAddress(struct + AIMeshAnim.MKEYS, value.address()); nmNumKeys(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMeshAnim.MKEYS));
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

    /** An array of {@link AIMeshAnim} structs. */
    public static class Buffer extends StructBuffer<AIMeshAnim, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIMeshAnim.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMeshAnim#SIZEOF}, and its mark will be undefined.
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
        protected AIMeshAnim newInstance(long address) {
            return new AIMeshAnim(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        public AIString mName() { return AIMeshAnim.nmName(address()); }
        /** Returns the value of the {@code mNumKeys} field. */
        public int mNumKeys() { return AIMeshAnim.nmNumKeys(address()); }
        /** Returns a {@link AIMeshKey.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
        public AIMeshKey.Buffer mKeys() { return AIMeshAnim.nmKeys(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIMeshAnim.Buffer mName(AIString value) { AIMeshAnim.nmName(address(), value); return this; }
        /** Sets the address of the specified {@link AIMeshKey.Buffer} to the {@code mKeys} field. */
        public AIMeshAnim.Buffer mKeys(AIMeshKey.Buffer value) { AIMeshAnim.nmKeys(address(), value); return this; }

    }

}