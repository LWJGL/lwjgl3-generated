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
 * (None).
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Types Supported by VkImportFenceWin32HandleInfoKHR</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
 * <tbody>
 * <tr><td>{@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fence-handletypes-win32">Handle Types Supported by VkImportFenceWin32HandleInfoKHR</a> table.</li>
 * <li>The fence from which {@code handleType} or {@code name} was exported <b>must</b> have been created on the same underlying physical device as {@code fence}.</li>
 * <li>If {@code handleType} is not {@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}, {@code name} <b>must</b> be {@code NULL}.</li>
 * <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}.</li>
 * <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
 * <li>If {@code handle} is not {@code NULL}, {@code name} must be {@code NULL}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBitsKHR} values</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceWin32#vkImportFenceWin32HandleKHR ImportFenceWin32HandleKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code fence} &ndash; the fence into which the state will be imported.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkFenceImportFlagBitsKHR} specifying additional parameters for the fence payload import operation.</li>
 * <li>{@code handleType} &ndash; specifies the type of {@code handle}.</li>
 * <li>{@code handle} &ndash; the external handle to import, or {@code NULL}.</li>
 * <li>{@code name} &ndash; the NULL-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportFenceWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFence fence;
 *     VkFenceImportFlagsKHR flags;
 *     VkExternalFenceHandleTypeFlagBitsKHR handleType;
 *     HANDLE handle;
 *     LPCWSTR name;
 * }</pre></code>
 */
public class VkImportFenceWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FENCE,
        FLAGS,
        HANDLETYPE,
        HANDLE,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FENCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        HANDLE = layout.offsetof(5);
        NAME = layout.offsetof(6);
    }

    VkImportFenceWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportFenceWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportFenceWin32HandleInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code fence} field. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkFenceImportFlagsKHR")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalFenceHandleTypeFlagBitsKHR")
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
    public VkImportFenceWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportFenceWin32HandleInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public VkImportFenceWin32HandleInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImportFenceWin32HandleInfoKHR flags(@NativeType("VkFenceImportFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportFenceWin32HandleInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBitsKHR") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public VkImportFenceWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public VkImportFenceWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportFenceWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long fence,
        int flags,
        int handleType,
        long handle,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        fence(fence);
        flags(flags);
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
    public VkImportFenceWin32HandleInfoKHR set(VkImportFenceWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportFenceWin32HandleInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportFenceWin32HandleInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportFenceWin32HandleInfoKHR create() {
        return new VkImportFenceWin32HandleInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImportFenceWin32HandleInfoKHR create(long address) {
        return address == NULL ? null : new VkImportFenceWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportFenceWin32HandleInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportFenceWin32HandleInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceWin32HandleInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceWin32HandleInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportFenceWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkImportFenceWin32HandleInfoKHR.FENCE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImportFenceWin32HandleInfoKHR.FLAGS); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportFenceWin32HandleInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.HANDLE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportFenceWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportFenceWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkImportFenceWin32HandleInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImportFenceWin32HandleInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportFenceWin32HandleInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportFenceWin32HandleInfoKHR.HANDLE, check(value)); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2Safe(value); }
        memPutAddress(struct + VkImportFenceWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.HANDLE));
        check(memGetAddress(struct + VkImportFenceWin32HandleInfoKHR.NAME));
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

    /** An array of {@link VkImportFenceWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportFenceWin32HandleInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportFenceWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportFenceWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportFenceWin32HandleInfoKHR newInstance(long address) {
            return new VkImportFenceWin32HandleInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportFenceWin32HandleInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkImportFenceWin32HandleInfoKHR.npNext(address()); }
        /** Returns the value of the {@code fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkImportFenceWin32HandleInfoKHR.nfence(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkFenceImportFlagsKHR")
        public int flags() { return VkImportFenceWin32HandleInfoKHR.nflags(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBitsKHR")
        public int handleType() { return VkImportFenceWin32HandleInfoKHR.nhandleType(address()); }
        /** Returns the value of the {@code handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportFenceWin32HandleInfoKHR.nhandle(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkImportFenceWin32HandleInfoKHR.nname(address()); }
        /** Decodes the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkImportFenceWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportFenceWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkImportFenceWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkImportFenceWin32HandleInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer flags(@NativeType("VkFenceImportFlagsKHR") int value) { VkImportFenceWin32HandleInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBitsKHR") int value) { VkImportFenceWin32HandleInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer handle(@NativeType("HANDLE") long value) { VkImportFenceWin32HandleInfoKHR.nhandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public VkImportFenceWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkImportFenceWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}