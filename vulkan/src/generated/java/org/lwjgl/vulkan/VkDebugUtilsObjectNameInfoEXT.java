/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@link EXTDebugUtils#vkSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT} again with a new string. If {@code pObjectName} is an empty string, then any previously set name is removed.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code objectType} <b>must</b> not be {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
 * <li>{@code objectHandle} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>{@code objectHandle} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#debugging-object-types">the “{@code VkObjectType} and Vulkan Handle Relationship” table</a>.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
 * <li>If {@code pObjectName} is not {@code NULL}, {@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCallbackDataEXT}, {@link EXTDebugUtils#vkSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code objectType} &ndash; a {@code VkObjectType} specifying the type of the object to be named.</li>
 * <li>{@code objectHandle} &ndash; the object to be named.</li>
 * <li>{@code pObjectName} &ndash; a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDebugUtilsObjectNameInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkObjectType objectType;
 *     uint64_t objectHandle;
 *     char const * pObjectName;
 * }</pre></code>
 */
public class VkDebugUtilsObjectNameInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTYPE,
        OBJECTHANDLE,
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
        OBJECTHANDLE = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    VkDebugUtilsObjectNameInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDebugUtilsObjectNameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsObjectNameInfoEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code objectType} field. */
    @NativeType("VkObjectType")
    public int objectType() { return nobjectType(address()); }
    /** Returns the value of the {@code objectHandle} field. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pObjectName} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pObjectName() { return npObjectName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pObjectName} field. */
    @Nullable
    @NativeType("char const *")
    public String pObjectNameString() { return npObjectNameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugUtilsObjectNameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugUtilsObjectNameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectType} field. */
    public VkDebugUtilsObjectNameInfoEXT objectType(@NativeType("VkObjectType") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@code objectHandle} field. */
    public VkDebugUtilsObjectNameInfoEXT objectHandle(@NativeType("uint64_t") long value) { nobjectHandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pObjectName} field. */
    public VkDebugUtilsObjectNameInfoEXT pObjectName(@Nullable @NativeType("char const *") ByteBuffer value) { npObjectName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsObjectNameInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long objectHandle,
        @Nullable ByteBuffer pObjectName
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        objectHandle(objectHandle);
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
    public VkDebugUtilsObjectNameInfoEXT set(VkDebugUtilsObjectNameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectNameInfoEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectNameInfoEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsObjectNameInfoEXT create() {
        return new VkDebugUtilsObjectNameInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsObjectNameInfoEXT create(long address) {
        return new VkDebugUtilsObjectNameInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectNameInfoEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectNameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDebugUtilsObjectNameInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDebugUtilsObjectNameInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectNameInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectNameInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDebugUtilsObjectNameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return memGetInt(struct + VkDebugUtilsObjectNameInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return memGetLong(struct + VkDebugUtilsObjectNameInfoEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #pObjectName}. */
    @Nullable public static ByteBuffer npObjectName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME)); }
    /** Unsafe version of {@link #pObjectNameString}. */
    @Nullable public static String npObjectNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDebugUtilsObjectNameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsObjectNameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { memPutInt(struct + VkDebugUtilsObjectNameInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #objectHandle(long) objectHandle}. */
    public static void nobjectHandle(long struct, long value) { memPutLong(struct + VkDebugUtilsObjectNameInfoEXT.OBJECTHANDLE, value); }
    /** Unsafe version of {@link #pObjectName(ByteBuffer) pObjectName}. */
    public static void npObjectName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsObjectNameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsObjectNameInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsObjectNameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsObjectNameInfoEXT newInstance(long address) {
            return new VkDebugUtilsObjectNameInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsObjectNameInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsObjectNameInfoEXT.npNext(address()); }
        /** Returns the value of the {@code objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDebugUtilsObjectNameInfoEXT.nobjectType(address()); }
        /** Returns the value of the {@code objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pObjectName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pObjectName() { return VkDebugUtilsObjectNameInfoEXT.npObjectName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pObjectName} field. */
        @Nullable
        @NativeType("char const *")
        public String pObjectNameString() { return VkDebugUtilsObjectNameInfoEXT.npObjectNameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsObjectNameInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsObjectNameInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectType} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer objectType(@NativeType("VkObjectType") int value) { VkDebugUtilsObjectNameInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@code objectHandle} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer objectHandle(@NativeType("uint64_t") long value) { VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pObjectName} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer pObjectName(@Nullable @NativeType("char const *") ByteBuffer value) { VkDebugUtilsObjectNameInfoEXT.npObjectName(address(), value); return this; }

    }

}