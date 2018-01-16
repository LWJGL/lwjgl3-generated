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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * specify security attributes and access rights for Win32 memory handles.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for "{@code Synchronization Object Security and Access Rights}"[1]. Further, if the structure is not present, the access rights will be</p>
 * 
 * <p>DXGI_SHARED_RESOURCE_READ | DXGI_SHARED_RESOURCE_WRITE</p>
 * 
 * <p>[1] https://msdn.microsoft.com/en-us/library/windows/desktop/ms686670.aspx</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pAttributes} &ndash; a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle.</li>
 * <li>{@code dwAccess} &ndash; a {@code DWORD} specifying access rights of the handle.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExportMemoryWin32HandleInfoNV {
 *     VkStructureType sType;
 *     const void * pNext;
 *     const {@link SECURITY_ATTRIBUTES SECURITY_ATTRIBUTES} * pAttributes;
 *     DWORD dwAccess;
 * }</pre></code>
 */
public class VkExportMemoryWin32HandleInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PATTRIBUTES,
        DWACCESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
    }

    VkExportMemoryWin32HandleInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExportMemoryWin32HandleInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryWin32HandleInfoNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
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
    @Nullable
    @NativeType("const SECURITY_ATTRIBUTES *")
    public SECURITY_ATTRIBUTES pAttributes() { return npAttributes(address()); }
    /** Returns the value of the {@code dwAccess} field. */
    @NativeType("DWORD")
    public int dwAccess() { return ndwAccess(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMemoryWin32HandleInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMemoryWin32HandleInfoNV pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
    public VkExportMemoryWin32HandleInfoNV pAttributes(@Nullable @NativeType("const SECURITY_ATTRIBUTES *") SECURITY_ATTRIBUTES value) { npAttributes(address(), value); return this; }
    /** Sets the specified value to the {@code dwAccess} field. */
    public VkExportMemoryWin32HandleInfoNV dwAccess(@NativeType("DWORD") int value) { ndwAccess(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryWin32HandleInfoNV set(
        int sType,
        long pNext,
        SECURITY_ATTRIBUTES pAttributes,
        int dwAccess
    ) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMemoryWin32HandleInfoNV set(VkExportMemoryWin32HandleInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryWin32HandleInfoNV create() {
        return new VkExportMemoryWin32HandleInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance for the specified memory address. */
    public static VkExportMemoryWin32HandleInfoNV create(long address) {
        return new VkExportMemoryWin32HandleInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryWin32HandleInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryWin32HandleInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExportMemoryWin32HandleInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExportMemoryWin32HandleInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PNEXT); }
    /** Unsafe version of {@link #pAttributes}. */
    @Nullable public static SECURITY_ATTRIBUTES npAttributes(long struct) { return SECURITY_ATTRIBUTES.createSafe(memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES)); }
    /** Unsafe version of {@link #dwAccess}. */
    public static int ndwAccess(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoNV.DWACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pAttributes(SECURITY_ATTRIBUTES) pAttributes}. */
    public static void npAttributes(long struct, @Nullable SECURITY_ATTRIBUTES value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES, memAddressSafe(value)); }
    /** Unsafe version of {@link #dwAccess(int) dwAccess}. */
    public static void ndwAccess(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoNV.DWACCESS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pAttributes = memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES);
        if (pAttributes != NULL) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
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

    /** An array of {@link VkExportMemoryWin32HandleInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryWin32HandleInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryWin32HandleInfoNV newInstance(long address) {
            return new VkExportMemoryWin32HandleInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryWin32HandleInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkExportMemoryWin32HandleInfoNV.npNext(address()); }
        /** Returns a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@code pAttributes} field. */
        @Nullable
        @NativeType("const SECURITY_ATTRIBUTES *")
        public SECURITY_ATTRIBUTES pAttributes() { return VkExportMemoryWin32HandleInfoNV.npAttributes(address()); }
        /** Returns the value of the {@code dwAccess} field. */
        @NativeType("DWORD")
        public int dwAccess() { return VkExportMemoryWin32HandleInfoNV.ndwAccess(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer pNext(@NativeType("const void *") long value) { VkExportMemoryWin32HandleInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer pAttributes(@Nullable @NativeType("const SECURITY_ATTRIBUTES *") SECURITY_ATTRIBUTES value) { VkExportMemoryWin32HandleInfoNV.npAttributes(address(), value); return this; }
        /** Sets the specified value to the {@code dwAccess} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer dwAccess(@NativeType("DWORD") int value) { VkExportMemoryWin32HandleInfoNV.ndwAccess(address(), value); return this; }

    }

}