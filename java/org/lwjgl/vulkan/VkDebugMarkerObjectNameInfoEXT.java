/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specify parameters of a name to give to an object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@link EXTDebugMarker#vkDebugMarkerSetObjectNameEXT DebugMarkerSetObjectNameEXT} again with a new string. To remove a previously set name, {@code pName} <b>should</b> be set to an empty string.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code objectType} <b>must</b> not be {@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</li>
 * <li>{@code object} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#debug-report-object-types">the “{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship” table</a>.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
 * <li>{@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDebugMarker#vkDebugMarkerSetObjectNameEXT DebugMarkerSetObjectNameEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code objectType} &ndash; a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.</li>
 * <li>{@code object} &ndash; the object to be named.</li>
 * <li>{@code pObjectName} &ndash; a null-terminated UTF-8 string specifying the name to apply to {@code object}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDebugMarkerObjectNameInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDebugReportObjectTypeEXT objectType;
 *     uint64_t object;
 *     const char * pObjectName;
 * }</pre></code>
 */
public class VkDebugMarkerObjectNameInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTYPE,
        OBJECT,
        POBJECTNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECT = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    VkDebugMarkerObjectNameInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDebugMarkerObjectNameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugMarkerObjectNameInfoEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code objectType} field. */
    public int objectType() { return nobjectType(address()); }
    /** Returns the value of the {@code object} field. */
    public long object() { return nobject(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pObjectName} field. */
    public ByteBuffer pObjectName() { return npObjectName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pObjectName} field. */
    public String pObjectNameString() { return npObjectNameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugMarkerObjectNameInfoEXT sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugMarkerObjectNameInfoEXT pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectType} field. */
    public VkDebugMarkerObjectNameInfoEXT objectType(int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@code object} field. */
    public VkDebugMarkerObjectNameInfoEXT object(long value) { nobject(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pObjectName} field. */
    public VkDebugMarkerObjectNameInfoEXT pObjectName(ByteBuffer value) { npObjectName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugMarkerObjectNameInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long object,
        ByteBuffer pObjectName
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
        pObjectName(pObjectName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugMarkerObjectNameInfoEXT set(VkDebugMarkerObjectNameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectNameInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectNameInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugMarkerObjectNameInfoEXT create() {
        return new VkDebugMarkerObjectNameInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkDebugMarkerObjectNameInfoEXT create(long address) {
        return address == NULL ? null : new VkDebugMarkerObjectNameInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDebugMarkerObjectNameInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDebugMarkerObjectNameInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectNameInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectNameInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDebugMarkerObjectNameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return memGetInt(struct + VkDebugMarkerObjectNameInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #object}. */
    public static long nobject(long struct) { return memGetLong(struct + VkDebugMarkerObjectNameInfoEXT.OBJECT); }
    /** Unsafe version of {@link #pObjectName}. */
    public static ByteBuffer npObjectName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME)); }
    /** Unsafe version of {@link #pObjectNameString}. */
    public static String npObjectNameString(long struct) { return memUTF8(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectNameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectNameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectNameInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #object(long) object}. */
    public static void nobject(long struct, long value) { memPutLong(struct + VkDebugMarkerObjectNameInfoEXT.OBJECT, value); }
    /** Unsafe version of {@link #pObjectName(ByteBuffer) pObjectName}. */
    public static void npObjectName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME));
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

    /** An array of {@link VkDebugMarkerObjectNameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectNameInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugMarkerObjectNameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugMarkerObjectNameInfoEXT newInstance(long address) {
            return new VkDebugMarkerObjectNameInfoEXT(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkDebugMarkerObjectNameInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkDebugMarkerObjectNameInfoEXT.npNext(address()); }
        /** Returns the value of the {@code objectType} field. */
        public int objectType() { return VkDebugMarkerObjectNameInfoEXT.nobjectType(address()); }
        /** Returns the value of the {@code object} field. */
        public long object() { return VkDebugMarkerObjectNameInfoEXT.nobject(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pObjectName} field. */
        public ByteBuffer pObjectName() { return VkDebugMarkerObjectNameInfoEXT.npObjectName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pObjectName} field. */
        public String pObjectNameString() { return VkDebugMarkerObjectNameInfoEXT.npObjectNameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer sType(int value) { VkDebugMarkerObjectNameInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer pNext(long value) { VkDebugMarkerObjectNameInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectType} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer objectType(int value) { VkDebugMarkerObjectNameInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@code object} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer object(long value) { VkDebugMarkerObjectNameInfoEXT.nobject(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pObjectName} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer pObjectName(ByteBuffer value) { VkDebugMarkerObjectNameInfoEXT.npObjectName(address(), value); return this; }

    }

}