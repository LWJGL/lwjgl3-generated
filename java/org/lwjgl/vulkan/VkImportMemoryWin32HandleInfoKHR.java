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

import org.lwjgl.system.windows.*;

/**
 * import Win32 memory created on the same physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>Importing memory objects from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the fname:CloseHandle system call when the handle is no longer needed.</p>
 * 
 * <p>Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatPropertiesKHR} or {@link VkExternalBufferPropertiesKHR}.</li>
 * <li>The memory from which {@code handle} was exported, or the memory named by {@code name} <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be defined as an NT handle or a global share handle.</li>
 * <li>If {@code handleType} is not {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}, {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR}, {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR}, or {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR}, {@code name} <b>must</b> be {@code NULL}.</li>
 * <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid memory resource of the type specified by {@code handleType}.</li>
 * <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
 * <li>if {@code handle} is not {@code NULL}, {@code name} must be {@code NULL}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; specifies the type of {@code handle} or {@code name}.</li>
 * <li>{@code handle} &ndash; the external handle to import, or {@code NULL}.</li>
 * <li>{@code name} &ndash; a NULL-terminated UTF-16 string naming the underlying memory resource to import, or {@code NULL}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportMemoryWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkExternalMemoryHandleTypeFlagBitsKHR handleType;
 *     HANDLE handle;
 *     LPCWSTR name;
 * }</pre></code>
 */
public class VkImportMemoryWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        HANDLE,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    VkImportMemoryWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportMemoryWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryWin32HandleInfoKHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR")
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code handle} field. */
    @NativeType("HANDLE")
    public long handle() { return nhandle(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryWin32HandleInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public VkImportMemoryWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public VkImportMemoryWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryWin32HandleInfoKHR set(
        int sType,
        long pNext,
        int handleType,
        long handle,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryWin32HandleInfoKHR set(VkImportMemoryWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryWin32HandleInfoKHR create() {
        return new VkImportMemoryWin32HandleInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImportMemoryWin32HandleInfoKHR create(long address) {
        return address == NULL ? null : new VkImportMemoryWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportMemoryWin32HandleInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportMemoryWin32HandleInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE, check(value)); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2Safe(value); }
        memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE));
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME));
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

    /** An array of {@link VkImportMemoryWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryWin32HandleInfoKHR newInstance(long address) {
            return new VkImportMemoryWin32HandleInfoKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryWin32HandleInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkImportMemoryWin32HandleInfoKHR.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBitsKHR")
        public int handleType() { return VkImportMemoryWin32HandleInfoKHR.nhandleType(address()); }
        /** Returns the value of the {@code handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportMemoryWin32HandleInfoKHR.nhandle(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkImportMemoryWin32HandleInfoKHR.nname(address()); }
        /** Decodes the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkImportMemoryWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkImportMemoryWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBitsKHR") int value) { VkImportMemoryWin32HandleInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer handle(@NativeType("HANDLE") long value) { VkImportMemoryWin32HandleInfoKHR.nhandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkImportMemoryWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}