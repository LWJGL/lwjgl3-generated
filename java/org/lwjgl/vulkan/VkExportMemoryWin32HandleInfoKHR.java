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
 * Structure specifying additional attributes of Windows handles exported from a memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"<sup>1</sup>. Further, if the structure is not present, the access rights will be</p>
 * 
 * <p>{@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}</p>
 * 
 * <p>for handles of the following types:</p>
 * 
 * <p>{@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR} {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR}</p>
 * 
 * <p>And</p>
 * 
 * <p>{@code GENERIC_ALL}</p>
 * 
 * <p>for handles of the following types:</p>
 * 
 * <p>{@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR} {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR}</p>
 * 
 * <dl>
 * <dt>1</dt>
 * <dd><a target="_blank" href="https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx">https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</a></dd>
 * </dl>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkExportMemoryAllocateInfoKHR}{@code ::handleTypes} does not include {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}, {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR}, {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR}, or {@link KHRExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR}, VkExportMemoryWin32HandleInfoKHR <b>must</b> not be in the {@code pNext} chain of {@link VkMemoryAllocateInfo}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pAttributes} &ndash; a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.</li>
 * <li>{@code dwAccess} &ndash; a {@code DWORD} specifying access rights of the handle.</li>
 * <li>{@code name} &ndash; a NULL-terminated UTF-16 string to associate with the underlying resource referenced by NT handles exported from the created memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExportMemoryWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     const {@link SECURITY_ATTRIBUTES SECURITY_ATTRIBUTES} * pAttributes;
 *     DWORD dwAccess;
 *     LPCWSTR name;
 * }</pre></code>
 */
public class VkExportMemoryWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PATTRIBUTES,
        DWACCESS,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    VkExportMemoryWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExportMemoryWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryWin32HandleInfoKHR(ByteBuffer container) {
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
    /** Returns a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@code pAttributes} field. */
    @NativeType("const SECURITY_ATTRIBUTES *")
    public SECURITY_ATTRIBUTES pAttributes() { return npAttributes(address()); }
    /** Returns the value of the {@code dwAccess} field. */
    @NativeType("DWORD")
    public int dwAccess() { return ndwAccess(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMemoryWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMemoryWin32HandleInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
    public VkExportMemoryWin32HandleInfoKHR pAttributes(@NativeType("const SECURITY_ATTRIBUTES *") SECURITY_ATTRIBUTES value) { npAttributes(address(), value); return this; }
    /** Sets the specified value to the {@code dwAccess} field. */
    public VkExportMemoryWin32HandleInfoKHR dwAccess(@NativeType("DWORD") int value) { ndwAccess(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public VkExportMemoryWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryWin32HandleInfoKHR set(
        int sType,
        long pNext,
        SECURITY_ATTRIBUTES pAttributes,
        int dwAccess,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
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
    public VkExportMemoryWin32HandleInfoKHR set(VkExportMemoryWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryWin32HandleInfoKHR create() {
        return new VkExportMemoryWin32HandleInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkExportMemoryWin32HandleInfoKHR create(long address) {
        return address == NULL ? null : new VkExportMemoryWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExportMemoryWin32HandleInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExportMemoryWin32HandleInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pAttributes}. */
    public static SECURITY_ATTRIBUTES npAttributes(long struct) { return SECURITY_ATTRIBUTES.create(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES)); }
    /** Unsafe version of {@link #dwAccess}. */
    public static int ndwAccess(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoKHR.DWACCESS); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pAttributes(SECURITY_ATTRIBUTES) pAttributes}. */
    public static void npAttributes(long struct, SECURITY_ATTRIBUTES value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES, memAddressSafe(value)); }
    /** Unsafe version of {@link #dwAccess(int) dwAccess}. */
    public static void ndwAccess(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoKHR.DWACCESS, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2Safe(value); }
        memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pAttributes = memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES);
        if (pAttributes != NULL) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
        check(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME));
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

    /** An array of {@link VkExportMemoryWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryWin32HandleInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryWin32HandleInfoKHR newInstance(long address) {
            return new VkExportMemoryWin32HandleInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryWin32HandleInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkExportMemoryWin32HandleInfoKHR.npNext(address()); }
        /** Returns a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@code pAttributes} field. */
        @NativeType("const SECURITY_ATTRIBUTES *")
        public SECURITY_ATTRIBUTES pAttributes() { return VkExportMemoryWin32HandleInfoKHR.npAttributes(address()); }
        /** Returns the value of the {@code dwAccess} field. */
        @NativeType("DWORD")
        public int dwAccess() { return VkExportMemoryWin32HandleInfoKHR.ndwAccess(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkExportMemoryWin32HandleInfoKHR.nname(address()); }
        /** Decodes the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkExportMemoryWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkExportMemoryWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer pAttributes(@NativeType("const SECURITY_ATTRIBUTES *") SECURITY_ATTRIBUTES value) { VkExportMemoryWin32HandleInfoKHR.npAttributes(address(), value); return this; }
        /** Sets the specified value to the {@code dwAccess} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer dwAccess(@NativeType("DWORD") int value) { VkExportMemoryWin32HandleInfoKHR.ndwAccess(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkExportMemoryWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}