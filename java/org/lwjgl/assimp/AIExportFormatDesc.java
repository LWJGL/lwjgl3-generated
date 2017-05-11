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
 * Describes an file format which Assimp can export to. Use {@link Assimp#aiGetExportFormatCount GetExportFormatCount} to learn how many export formats the current Assimp build supports and
 * {@link Assimp#aiGetExportFormatDescription GetExportFormatDescription} to retrieve a description of an export format option.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code id} &ndash; 
 * a short string ID to uniquely identify the export format. Use this ID string to specify which file format you want to export to when calling
 * {@link Assimp#aiExportScene ExportScene}. Example: "dae" or "obj"</li>
 * <li>{@code description} &ndash; A short description of the file format to present to users. Useful if you want to allow the user to select an export format.</li>
 * <li>{@code fileExtension} &ndash; Recommended file extension for the exported file in lower case.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiExportFormatDesc {
    const char * id;
    const char * description;
    const char * fileExtension;
}</code></pre>
 */
public class AIExportFormatDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        DESCRIPTION,
        FILEEXTENSION;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        DESCRIPTION = layout.offsetof(1);
        FILEEXTENSION = layout.offsetof(2);
    }

    AIExportFormatDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIExportFormatDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIExportFormatDesc(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code id} field. */
    public ByteBuffer id() { return nid(address()); }
    /** Decodes the null-terminated string pointed to by the {@code id} field. */
    public String idString() { return nidString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
    public ByteBuffer description() { return ndescription(address()); }
    /** Decodes the null-terminated string pointed to by the {@code description} field. */
    public String descriptionString() { return ndescriptionString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code fileExtension} field. */
    public ByteBuffer fileExtension() { return nfileExtension(address()); }
    /** Decodes the null-terminated string pointed to by the {@code fileExtension} field. */
    public String fileExtensionString() { return nfileExtensionString(address()); }

    /** Sets the address of the specified encoded string to the {@code id} field. */
    public AIExportFormatDesc id(ByteBuffer value) { nid(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code description} field. */
    public AIExportFormatDesc description(ByteBuffer value) { ndescription(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code fileExtension} field. */
    public AIExportFormatDesc fileExtension(ByteBuffer value) { nfileExtension(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIExportFormatDesc set(
        ByteBuffer id,
        ByteBuffer description,
        ByteBuffer fileExtension
    ) {
        id(id);
        description(description);
        fileExtension(fileExtension);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIExportFormatDesc set(AIExportFormatDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIExportFormatDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIExportFormatDesc malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link AIExportFormatDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIExportFormatDesc calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link AIExportFormatDesc} instance allocated with {@link BufferUtils}. */
    public static AIExportFormatDesc create() {
        return new AIExportFormatDesc(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIExportFormatDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static AIExportFormatDesc create(long address) {
        return address == NULL ? null : new AIExportFormatDesc(address, null);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link AIExportFormatDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIExportFormatDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIExportFormatDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIExportFormatDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIExportFormatDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIExportFormatDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportFormatDesc mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportFormatDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportFormatDesc callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportFormatDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static ByteBuffer nid(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.ID)); }
    /** Unsafe version of {@link #idString}. */
    public static String nidString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.ID)); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION)); }
    /** Unsafe version of {@link #fileExtension}. */
    public static ByteBuffer nfileExtension(long struct) { return memByteBufferNT1(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION)); }
    /** Unsafe version of {@link #fileExtensionString}. */
    public static String nfileExtensionString(long struct) { return memUTF8(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION)); }

    /** Unsafe version of {@link #id(ByteBuffer) id}. */
    public static void nid(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + AIExportFormatDesc.ID, memAddress(value));
    }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + AIExportFormatDesc.DESCRIPTION, memAddress(value));
    }
    /** Unsafe version of {@link #fileExtension(ByteBuffer) fileExtension}. */
    public static void nfileExtension(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + AIExportFormatDesc.FILEEXTENSION, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIExportFormatDesc.ID));
        check(memGetAddress(struct + AIExportFormatDesc.DESCRIPTION));
        check(memGetAddress(struct + AIExportFormatDesc.FILEEXTENSION));
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

    /** An array of {@link AIExportFormatDesc} structs. */
    public static class Buffer extends StructBuffer<AIExportFormatDesc, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIExportFormatDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIExportFormatDesc#SIZEOF}, and its mark will be undefined.
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
        protected AIExportFormatDesc newInstance(long address) {
            return new AIExportFormatDesc(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code id} field. */
        public ByteBuffer id() { return AIExportFormatDesc.nid(address()); }
        /** Decodes the null-terminated string pointed to by the {@code id} field. */
        public String idString() { return AIExportFormatDesc.nidString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
        public ByteBuffer description() { return AIExportFormatDesc.ndescription(address()); }
        /** Decodes the null-terminated string pointed to by the {@code description} field. */
        public String descriptionString() { return AIExportFormatDesc.ndescriptionString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code fileExtension} field. */
        public ByteBuffer fileExtension() { return AIExportFormatDesc.nfileExtension(address()); }
        /** Decodes the null-terminated string pointed to by the {@code fileExtension} field. */
        public String fileExtensionString() { return AIExportFormatDesc.nfileExtensionString(address()); }

        /** Sets the address of the specified encoded string to the {@code id} field. */
        public AIExportFormatDesc.Buffer id(ByteBuffer value) { AIExportFormatDesc.nid(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code description} field. */
        public AIExportFormatDesc.Buffer description(ByteBuffer value) { AIExportFormatDesc.ndescription(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code fileExtension} field. */
        public AIExportFormatDesc.Buffer fileExtension(ByteBuffer value) { AIExportFormatDesc.nfileExtension(address(), value); return this; }

    }

}