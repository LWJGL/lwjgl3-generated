/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * (None).
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Types Supported by VkImportFenceFdInfoKHR</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
 * <tbody>
 * <tr><td>{@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR}</td><td>Copy</td><td>Temporary</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-fence-handletypes-fd">Handle Types Supported by VkImportFenceFdInfoKHR</a> table.</li>
 * <li>The fence from which {@code handleType} was exported <b>must</b> have been created on the same underlying physical device as {@code fence}.</li>
 * </ul>
 * 
 * <p>If {@code handleType} is {@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR}, the special value {@code -1} for {@code fd} is treated like a valid sync file descriptor referring to an object that has already signaled. The import operation will succeed and the {@code VkFence} will have a temporarily imported payload as if a valid file descriptor had been provided.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This special behavior for importing an invalid sync file descriptor allows easier interoperability with other system software which uses the convention that an invalid sync file descriptor represents work that has already completed and doesn't need to be waited for. It is consistent with the option for implementations to return a {@code -1} file descriptor when exporting a {@link KHRExternalFenceCapabilities#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR} from a {@code VkFence} which is signaled.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBitsKHR} values</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBitsKHR} value</li>
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
 * <p>{@link KHRExternalFenceFd#vkImportFenceFdKHR ImportFenceFdKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code fence} &ndash; the fence into which the payload will be imported.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkFenceImportFlagBitsKHR} specifying additional parameters for the fence payload import operation.</li>
 * <li>{@code handleType} &ndash; specifies the type of {@code fd}.</li>
 * <li>{@code fd} &ndash; the external handle to import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImportFenceFdInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFence fence;
 *     VkFenceImportFlagsKHR flags;
 *     VkExternalFenceHandleTypeFlagBitsKHR handleType;
 *     int fd;
 * }</pre></code>
 */
public class VkImportFenceFdInfoKHR extends Struct implements NativeResource {

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
        FD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FENCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        FD = layout.offsetof(5);
    }

    VkImportFenceFdInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImportFenceFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportFenceFdInfoKHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code fence} field. */
    public long fence() { return nfence(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code handleType} field. */
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code fd} field. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportFenceFdInfoKHR sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportFenceFdInfoKHR pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public VkImportFenceFdInfoKHR fence(long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImportFenceFdInfoKHR flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportFenceFdInfoKHR handleType(int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public VkImportFenceFdInfoKHR fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportFenceFdInfoKHR set(
        int sType,
        long pNext,
        long fence,
        int flags,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
        fence(fence);
        flags(flags);
        handleType(handleType);
        fd(fd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportFenceFdInfoKHR set(VkImportFenceFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportFenceFdInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportFenceFdInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportFenceFdInfoKHR create() {
        return new VkImportFenceFdInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkImportFenceFdInfoKHR create(long address) {
        return address == NULL ? null : new VkImportFenceFdInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkImportFenceFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportFenceFdInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImportFenceFdInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportFenceFdInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceFdInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceFdInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportFenceFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportFenceFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkImportFenceFdInfoKHR.FENCE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImportFenceFdInfoKHR.FLAGS); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportFenceFdInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return memGetInt(struct + VkImportFenceFdInfoKHR.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportFenceFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportFenceFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkImportFenceFdInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImportFenceFdInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportFenceFdInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { memPutInt(struct + VkImportFenceFdInfoKHR.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportFenceFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportFenceFdInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImportFenceFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportFenceFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportFenceFdInfoKHR newInstance(long address) {
            return new VkImportFenceFdInfoKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkImportFenceFdInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkImportFenceFdInfoKHR.npNext(address()); }
        /** Returns the value of the {@code fence} field. */
        public long fence() { return VkImportFenceFdInfoKHR.nfence(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkImportFenceFdInfoKHR.nflags(address()); }
        /** Returns the value of the {@code handleType} field. */
        public int handleType() { return VkImportFenceFdInfoKHR.nhandleType(address()); }
        /** Returns the value of the {@code fd} field. */
        public int fd() { return VkImportFenceFdInfoKHR.nfd(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportFenceFdInfoKHR.Buffer sType(int value) { VkImportFenceFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportFenceFdInfoKHR.Buffer pNext(long value) { VkImportFenceFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public VkImportFenceFdInfoKHR.Buffer fence(long value) { VkImportFenceFdInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImportFenceFdInfoKHR.Buffer flags(int value) { VkImportFenceFdInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportFenceFdInfoKHR.Buffer handleType(int value) { VkImportFenceFdInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public VkImportFenceFdInfoKHR.Buffer fd(int value) { VkImportFenceFdInfoKHR.nfd(address(), value); return this; }

    }

}