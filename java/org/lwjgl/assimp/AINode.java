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
 * A node in the imported hierarchy.
 * 
 * <p>Each node has name, a parent node (except for the root node), a transformation relative to its parent and possibly several child nodes. Simple file
 * formats don't support hierarchical structures - for these formats the imported scene does consist of only a single root node without children.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; The name of the node.</li>
 * <li>{@code mTransformation} &ndash; The transformation relative to the node's parent.</li>
 * <li>{@code mParent} &ndash; Parent node. {@code NULL} if this node is the root node.</li>
 * <li>{@code mNumChildren} &ndash; The number of child nodes of this node.</li>
 * <li>{@code mChildren} &ndash; The child nodes of this node. {@code NULL} if {@code mNumChildren} is 0.</li>
 * <li>{@code mNumMeshes} &ndash; The number of meshes of this node.</li>
 * <li>{@code mMeshes} &ndash; The meshes of this node. Each entry is an index into the mesh list of the aiScene.</li>
 * <li>{@code mMetadata} &ndash; Metadata associated with this node or {@code NULL} if there is no metadata.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiNode {
 *     {@link AIString struct aiString} mName;
 *     {@link AIMatrix4x4 struct aiMatrix4x4} mTransformation;
 *     {@link AINode struct aiNode} * mParent;
 *     unsigned int mNumChildren;
 *     {@link AINode struct aiNode} ** mChildren;
 *     unsigned int mNumMeshes;
 *     unsigned int * mMeshes;
 *     {@link AIMetaData struct aiMetadata} * mMetadata;
 * }</pre></code>
 */
@NativeType("struct aiNode")
public class AINode extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MTRANSFORMATION,
        MPARENT,
        MNUMCHILDREN,
        MCHILDREN,
        MNUMMESHES,
        MMESHES,
        MMETADATA;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(AIMatrix4x4.SIZEOF, AIMatrix4x4.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MTRANSFORMATION = layout.offsetof(1);
        MPARENT = layout.offsetof(2);
        MNUMCHILDREN = layout.offsetof(3);
        MCHILDREN = layout.offsetof(4);
        MNUMMESHES = layout.offsetof(5);
        MMESHES = layout.offsetof(6);
        MMETADATA = layout.offsetof(7);
    }

    AINode(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AINode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AINode(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
    @NativeType("struct aiMatrix4x4")
    public AIMatrix4x4 mTransformation() { return nmTransformation(address()); }
    /** Returns a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
    @NativeType("struct aiNode *")
    public AINode mParent() { return nmParent(address()); }
    /** Returns the value of the {@code mNumChildren} field. */
    @NativeType("unsigned int")
    public int mNumChildren() { return nmNumChildren(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
    @NativeType("struct aiNode **")
    public PointerBuffer mChildren() { return nmChildren(address()); }
    /** Returns the value of the {@code mNumMeshes} field. */
    @NativeType("unsigned int")
    public int mNumMeshes() { return nmNumMeshes(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
    @NativeType("unsigned int *")
    public IntBuffer mMeshes() { return nmMeshes(address()); }
    /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
    @NativeType("struct aiMetadata *")
    public AIMetaData mMetadata() { return nmMetadata(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AINode mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Copies the specified {@link AIMatrix4x4} to the {@code mTransformation} field. */
    public AINode mTransformation(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { nmTransformation(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mParent} field. */
    public AINode mParent(@NativeType("struct aiNode *") AINode value) { nmParent(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mChildren} field. */
    public AINode mChildren(@NativeType("struct aiNode **") PointerBuffer value) { nmChildren(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code mMeshes} field. */
    public AINode mMeshes(@NativeType("unsigned int *") IntBuffer value) { nmMeshes(address(), value); return this; }
    /** Sets the address of the specified {@link AIMetaData} to the {@code mMetadata} field. */
    public AINode mMetadata(@NativeType("struct aiMetadata *") AIMetaData value) { nmMetadata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AINode set(
        AIString mName,
        AIMatrix4x4 mTransformation,
        AINode mParent,
        PointerBuffer mChildren,
        IntBuffer mMeshes,
        AIMetaData mMetadata
    ) {
        mName(mName);
        mTransformation(mTransformation);
        mParent(mParent);
        mChildren(mChildren);
        mMeshes(mMeshes);
        mMetadata(mMetadata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AINode set(AINode src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AINode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AINode malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AINode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AINode calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AINode} instance allocated with {@link BufferUtils}. */
    public static AINode create() {
        return new AINode(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AINode} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AINode create(long address) {
        return address == NULL ? null : new AINode(address, null);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AINode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AINode} instance allocated on the thread-local {@link MemoryStack}. */
    public static AINode mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AINode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AINode callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AINode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AINode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AINode callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AINode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AINode.MNAME); }
    /** Unsafe version of {@link #mTransformation}. */
    public static AIMatrix4x4 nmTransformation(long struct) { return AIMatrix4x4.create(struct + AINode.MTRANSFORMATION); }
    /** Unsafe version of {@link #mParent}. */
    public static AINode nmParent(long struct) { return AINode.create(memGetAddress(struct + AINode.MPARENT)); }
    /** Unsafe version of {@link #mNumChildren}. */
    public static int nmNumChildren(long struct) { return memGetInt(struct + AINode.MNUMCHILDREN); }
    /** Unsafe version of {@link #mChildren() mChildren}. */
    public static PointerBuffer nmChildren(long struct) { return memPointerBuffer(memGetAddress(struct + AINode.MCHILDREN), nmNumChildren(struct)); }
    /** Unsafe version of {@link #mNumMeshes}. */
    public static int nmNumMeshes(long struct) { return memGetInt(struct + AINode.MNUMMESHES); }
    /** Unsafe version of {@link #mMeshes() mMeshes}. */
    public static IntBuffer nmMeshes(long struct) { return memIntBuffer(memGetAddress(struct + AINode.MMESHES), nmNumMeshes(struct)); }
    /** Unsafe version of {@link #mMetadata}. */
    public static AIMetaData nmMetadata(long struct) { return AIMetaData.create(memGetAddress(struct + AINode.MMETADATA)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AINode.MNAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #mTransformation(AIMatrix4x4) mTransformation}. */
    public static void nmTransformation(long struct, AIMatrix4x4 value) { memCopy(value.address(), struct + AINode.MTRANSFORMATION, AIMatrix4x4.SIZEOF); }
    /** Unsafe version of {@link #mParent(AINode) mParent}. */
    public static void nmParent(long struct, AINode value) { memPutAddress(struct + AINode.MPARENT, addressSafe(value)); }
    /** Sets the specified value to the {@code mNumChildren} field of the specified {@code struct}. */
    public static void nmNumChildren(long struct, int value) { memPutInt(struct + AINode.MNUMCHILDREN, value); }
    /** Unsafe version of {@link #mChildren(PointerBuffer) mChildren}. */
    public static void nmChildren(long struct, PointerBuffer value) { memPutAddress(struct + AINode.MCHILDREN, memAddressSafe(value)); nmNumChildren(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMeshes} field of the specified {@code struct}. */
    public static void nmNumMeshes(long struct, int value) { memPutInt(struct + AINode.MNUMMESHES, value); }
    /** Unsafe version of {@link #mMeshes(IntBuffer) mMeshes}. */
    public static void nmMeshes(long struct, IntBuffer value) { memPutAddress(struct + AINode.MMESHES, memAddressSafe(value)); nmNumMeshes(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMetadata(AIMetaData) mMetadata}. */
    public static void nmMetadata(long struct, AIMetaData value) { memPutAddress(struct + AINode.MMETADATA, addressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmNumChildren(struct) != 0) {
            check(memGetAddress(struct + AINode.MCHILDREN));
        }
        if (nmNumMeshes(struct) != 0) {
            check(memGetAddress(struct + AINode.MMESHES));
        }
        long mMetadata = memGetAddress(struct + AINode.MMETADATA);
        if (mMetadata != NULL) {
            AIMetaData.validate(mMetadata);
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

    /** An array of {@link AINode} structs. */
    public static class Buffer extends StructBuffer<AINode, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AINode.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AINode#SIZEOF}, and its mark will be undefined.
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
        protected AINode newInstance(long address) {
            return new AINode(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AINode.nmName(address()); }
        /** Returns a {@link AIMatrix4x4} view of the {@code mTransformation} field. */
        @NativeType("struct aiMatrix4x4")
        public AIMatrix4x4 mTransformation() { return AINode.nmTransformation(address()); }
        /** Returns a {@link AINode} view of the struct pointed to by the {@code mParent} field. */
        @NativeType("struct aiNode *")
        public AINode mParent() { return AINode.nmParent(address()); }
        /** Returns the value of the {@code mNumChildren} field. */
        @NativeType("unsigned int")
        public int mNumChildren() { return AINode.nmNumChildren(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mChildren} field. */
        @NativeType("struct aiNode **")
        public PointerBuffer mChildren() { return AINode.nmChildren(address()); }
        /** Returns the value of the {@code mNumMeshes} field. */
        @NativeType("unsigned int")
        public int mNumMeshes() { return AINode.nmNumMeshes(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code mMeshes} field. */
        @NativeType("unsigned int *")
        public IntBuffer mMeshes() { return AINode.nmMeshes(address()); }
        /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetadata} field. */
        @NativeType("struct aiMetadata *")
        public AIMetaData mMetadata() { return AINode.nmMetadata(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AINode.Buffer mName(@NativeType("struct aiString") AIString value) { AINode.nmName(address(), value); return this; }
        /** Copies the specified {@link AIMatrix4x4} to the {@code mTransformation} field. */
        public AINode.Buffer mTransformation(@NativeType("struct aiMatrix4x4") AIMatrix4x4 value) { AINode.nmTransformation(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mParent} field. */
        public AINode.Buffer mParent(@NativeType("struct aiNode *") AINode value) { AINode.nmParent(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mChildren} field. */
        public AINode.Buffer mChildren(@NativeType("struct aiNode **") PointerBuffer value) { AINode.nmChildren(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code mMeshes} field. */
        public AINode.Buffer mMeshes(@NativeType("unsigned int *") IntBuffer value) { AINode.nmMeshes(address(), value); return this; }
        /** Sets the address of the specified {@link AIMetaData} to the {@code mMetadata} field. */
        public AINode.Buffer mMetadata(@NativeType("struct aiMetadata *") AIMetaData value) { AINode.nmMetadata(address(), value); return this; }

    }

}