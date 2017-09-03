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
 * Describes a blob of exported scene data. Use {@link Assimp#aiExportSceneToBlob ExportSceneToBlob} to create a blob containing an exported scene. The memory referred by this structure
 * is owned by Assimp. to free its resources. Don't try to free the memory on your side - it will crash for most build configurations due to conflicting
 * heaps.
 * 
 * <p>Blobs can be nested - each blob may reference another blob, which may in turn reference another blob and so on. This is used when exporters write more
 * than one output file for a given {@link AIScene}. See the remarks for {@code aiExportDataBlob::name} for more information.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code size} &ndash; Size of the data in bytes</li>
 * <li>{@code data} &ndash; The data.</li>
 * <li>{@code name} &ndash; 
 * Name of the blob. An empty string always indicates the first (and primary) blob, which contains the actual file data. Any other blobs are auxiliary
 * files produced by exporters (i.e. material files). Existence of such files depends on the file format. Most formats don't split assets across multiple
 * files.
 * 
 * <p>If used, blob names usually contain the file extension that should be used when writing the data to disc.</p></li>
 * <li>{@code next} &ndash; Pointer to the next blob in the chain or NULL if there is none.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiExportDataBlob {
 *     size_t size;
 *     void * data;
 *     {@link AIString struct aiString} name;
 *     {@link AIExportDataBlob struct aiExportDataBlob} * next;
 * }</pre></code>
 */
@NativeType("struct aiExportDataBlob")
public class AIExportDataBlob extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        DATA,
        NAME,
        NEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        DATA = layout.offsetof(1);
        NAME = layout.offsetof(2);
        NEXT = layout.offsetof(3);
    }

    AIExportDataBlob(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIExportDataBlob} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIExportDataBlob(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("void *")
    public ByteBuffer data() { return ndata(address()); }
    /** Returns a {@link AIString} view of the {@code name} field. */
    @NativeType("struct aiString")
    public AIString name() { return nname(address()); }
    /** Returns a {@link AIExportDataBlob} view of the struct pointed to by the {@code next} field. */
    @NativeType("struct aiExportDataBlob *")
    public AIExportDataBlob next() { return nnext(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public AIExportDataBlob data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Copies the specified {@link AIString} to the {@code name} field. */
    public AIExportDataBlob name(@NativeType("struct aiString") AIString value) { nname(address(), value); return this; }
    /** Sets the address of the specified {@link AIExportDataBlob} to the {@code next} field. */
    public AIExportDataBlob next(@NativeType("struct aiExportDataBlob *") AIExportDataBlob value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIExportDataBlob set(
        ByteBuffer data,
        AIString name,
        AIExportDataBlob next
    ) {
        data(data);
        name(name);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIExportDataBlob set(AIExportDataBlob src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIExportDataBlob} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIExportDataBlob malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIExportDataBlob} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIExportDataBlob calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIExportDataBlob} instance allocated with {@link BufferUtils}. */
    public static AIExportDataBlob create() {
        return new AIExportDataBlob(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIExportDataBlob} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIExportDataBlob create(long address) {
        return address == NULL ? null : new AIExportDataBlob(address, null);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIExportDataBlob.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIExportDataBlob} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIExportDataBlob mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIExportDataBlob} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIExportDataBlob callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIExportDataBlob} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportDataBlob mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportDataBlob} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportDataBlob callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + AIExportDataBlob.SIZE); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + AIExportDataBlob.DATA), (int)nsize(struct)); }
    /** Unsafe version of {@link #name}. */
    public static AIString nname(long struct) { return AIString.create(struct + AIExportDataBlob.NAME); }
    /** Unsafe version of {@link #next}. */
    public static AIExportDataBlob nnext(long struct) { return AIExportDataBlob.create(memGetAddress(struct + AIExportDataBlob.NEXT)); }

    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + AIExportDataBlob.SIZE, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + AIExportDataBlob.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Unsafe version of {@link #name(AIString) name}. */
    public static void nname(long struct, AIString value) { memCopy(value.address(), struct + AIExportDataBlob.NAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #next(AIExportDataBlob) next}. */
    public static void nnext(long struct, AIExportDataBlob value) { memPutAddress(struct + AIExportDataBlob.NEXT, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIExportDataBlob.DATA));
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

    /** An array of {@link AIExportDataBlob} structs. */
    public static class Buffer extends StructBuffer<AIExportDataBlob, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIExportDataBlob.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIExportDataBlob#SIZEOF}, and its mark will be undefined.
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
        protected AIExportDataBlob newInstance(long address) {
            return new AIExportDataBlob(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return AIExportDataBlob.nsize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("void *")
        public ByteBuffer data() { return AIExportDataBlob.ndata(address()); }
        /** Returns a {@link AIString} view of the {@code name} field. */
        @NativeType("struct aiString")
        public AIString name() { return AIExportDataBlob.nname(address()); }
        /** Returns a {@link AIExportDataBlob} view of the struct pointed to by the {@code next} field. */
        @NativeType("struct aiExportDataBlob *")
        public AIExportDataBlob next() { return AIExportDataBlob.nnext(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public AIExportDataBlob.Buffer data(@NativeType("void *") ByteBuffer value) { AIExportDataBlob.ndata(address(), value); return this; }
        /** Copies the specified {@link AIString} to the {@code name} field. */
        public AIExportDataBlob.Buffer name(@NativeType("struct aiString") AIString value) { AIExportDataBlob.nname(address(), value); return this; }
        /** Sets the address of the specified {@link AIExportDataBlob} to the {@code next} field. */
        public AIExportDataBlob.Buffer next(@NativeType("struct aiExportDataBlob *") AIExportDataBlob value) { AIExportDataBlob.nnext(address(), value); return this; }

    }

}