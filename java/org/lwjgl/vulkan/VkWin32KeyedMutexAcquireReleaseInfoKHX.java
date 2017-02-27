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
 * Use the Windows keyed mutex mechanism to synchronize work.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each member of {@code pAcquireSyncs} and {@code pReleaseSyncs} must be a device memory object imported by setting {@link VkImportMemoryWin32HandleInfoKHX}{@code ::handleType} to {@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX} or {@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHX STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireTimeouts} <b>must</b> be a pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
 * <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code acquireCount} &ndash; the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays.</li>
 * <li>{@code pAcquireSyncs} &ndash; a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.</li>
 * <li>{@code pAcquireKeys} &ndash; a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}.</li>
 * <li>{@code releaseCount} &ndash; the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays.</li>
 * <li>{@code pReleaseSyncs} &ndash; a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources.</li>
 * <li>{@code pReleaseKeys} &ndash; a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkWin32KeyedMutexAcquireReleaseInfoKHX {
    VkStructureType sType;
    const void * pNext;
    uint32_t acquireCount;
    const VkDeviceMemory * pAcquireSyncs;
    const uint64_t * pAcquireKeys;
    const uint32_t * pAcquireTimeouts;
    uint32_t releaseCount;
    const VkDeviceMemory * pReleaseSyncs;
    const uint64_t * pReleaseKeys;
}</code></pre>
 */
public class VkWin32KeyedMutexAcquireReleaseInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		ACQUIRECOUNT,
		PACQUIRESYNCS,
		PACQUIREKEYS,
		PACQUIRETIMEOUTS,
		RELEASECOUNT,
		PRELEASESYNCS,
		PRELEASEKEYS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		ACQUIRECOUNT = layout.offsetof(2);
		PACQUIRESYNCS = layout.offsetof(3);
		PACQUIREKEYS = layout.offsetof(4);
		PACQUIRETIMEOUTS = layout.offsetof(5);
		RELEASECOUNT = layout.offsetof(6);
		PRELEASESYNCS = layout.offsetof(7);
		PRELEASEKEYS = layout.offsetof(8);
	}

	VkWin32KeyedMutexAcquireReleaseInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code acquireCount} field. */
	public int acquireCount() { return nacquireCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAcquireSyncs} field. */
	public LongBuffer pAcquireSyncs() { return npAcquireSyncs(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAcquireKeys} field. */
	public LongBuffer pAcquireKeys() { return npAcquireKeys(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pAcquireTimeouts} field. */
	public IntBuffer pAcquireTimeouts() { return npAcquireTimeouts(address()); }
	/** Returns the value of the {@code releaseCount} field. */
	public int releaseCount() { return nreleaseCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pReleaseSyncs} field. */
	public LongBuffer pReleaseSyncs() { return npReleaseSyncs(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pReleaseKeys} field. */
	public LongBuffer pReleaseKeys() { return npReleaseKeys(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code acquireCount} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX acquireCount(int value) { nacquireCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pAcquireSyncs} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pAcquireSyncs(LongBuffer value) { npAcquireSyncs(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pAcquireKeys} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pAcquireKeys(LongBuffer value) { npAcquireKeys(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pAcquireTimeouts} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pAcquireTimeouts(IntBuffer value) { npAcquireTimeouts(address(), value); return this; }
	/** Sets the specified value to the {@code releaseCount} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX releaseCount(int value) { nreleaseCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pReleaseSyncs} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pReleaseSyncs(LongBuffer value) { npReleaseSyncs(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pReleaseKeys} field. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX pReleaseKeys(LongBuffer value) { npReleaseKeys(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX set(
		int sType,
		long pNext,
		int acquireCount,
		LongBuffer pAcquireSyncs,
		LongBuffer pAcquireKeys,
		IntBuffer pAcquireTimeouts,
		int releaseCount,
		LongBuffer pReleaseSyncs,
		LongBuffer pReleaseKeys
	) {
		sType(sType);
		pNext(pNext);
		acquireCount(acquireCount);
		pAcquireSyncs(pAcquireSyncs);
		pAcquireKeys(pAcquireKeys);
		pAcquireTimeouts(pAcquireTimeouts);
		releaseCount(releaseCount);
		pReleaseSyncs(pReleaseSyncs);
		pReleaseKeys(pReleaseKeys);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkWin32KeyedMutexAcquireReleaseInfoKHX set(VkWin32KeyedMutexAcquireReleaseInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX create() {
		return new VkWin32KeyedMutexAcquireReleaseInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX create(long address) {
		return address == NULL ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWin32KeyedMutexAcquireReleaseInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PNEXT); }
	/** Unsafe version of {@link #acquireCount}. */
	public static int nacquireCount(long struct) { return memGetInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.ACQUIRECOUNT); }
	/** Unsafe version of {@link #pAcquireSyncs() pAcquireSyncs}. */
	public static LongBuffer npAcquireSyncs(long struct) { return memLongBuffer(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRESYNCS), nacquireCount(struct)); }
	/** Unsafe version of {@link #pAcquireKeys() pAcquireKeys}. */
	public static LongBuffer npAcquireKeys(long struct) { return memLongBuffer(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIREKEYS), nacquireCount(struct)); }
	/** Unsafe version of {@link #pAcquireTimeouts() pAcquireTimeouts}. */
	public static IntBuffer npAcquireTimeouts(long struct) { return memIntBuffer(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRETIMEOUTS), nacquireCount(struct)); }
	/** Unsafe version of {@link #releaseCount}. */
	public static int nreleaseCount(long struct) { return memGetInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.RELEASECOUNT); }
	/** Unsafe version of {@link #pReleaseSyncs() pReleaseSyncs}. */
	public static LongBuffer npReleaseSyncs(long struct) { return memLongBuffer(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASESYNCS), nreleaseCount(struct)); }
	/** Unsafe version of {@link #pReleaseKeys() pReleaseKeys}. */
	public static LongBuffer npReleaseKeys(long struct) { return memLongBuffer(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASEKEYS), nreleaseCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PNEXT, value); }
	/** Sets the specified value to the {@code acquireCount} field of the specified {@code struct}. */
	public static void nacquireCount(long struct, int value) { memPutInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.ACQUIRECOUNT, value); }
	/** Unsafe version of {@link #pAcquireSyncs(LongBuffer) pAcquireSyncs}. */
	public static void npAcquireSyncs(long struct, LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRESYNCS, memAddressSafe(value)); }
	/** Unsafe version of {@link #pAcquireKeys(LongBuffer) pAcquireKeys}. */
	public static void npAcquireKeys(long struct, LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIREKEYS, memAddressSafe(value)); }
	/** Unsafe version of {@link #pAcquireTimeouts(IntBuffer) pAcquireTimeouts}. */
	public static void npAcquireTimeouts(long struct, IntBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRETIMEOUTS, memAddressSafe(value)); }
	/** Sets the specified value to the {@code releaseCount} field of the specified {@code struct}. */
	public static void nreleaseCount(long struct, int value) { memPutInt(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.RELEASECOUNT, value); }
	/** Unsafe version of {@link #pReleaseSyncs(LongBuffer) pReleaseSyncs}. */
	public static void npReleaseSyncs(long struct, LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASESYNCS, memAddressSafe(value)); }
	/** Unsafe version of {@link #pReleaseKeys(LongBuffer) pReleaseKeys}. */
	public static void npReleaseKeys(long struct, LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASEKEYS, memAddressSafe(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nacquireCount(struct) != 0 ) {
			check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRESYNCS));
			check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIREKEYS));
			check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PACQUIRETIMEOUTS));
		}
		if ( nreleaseCount(struct) != 0 ) {
			check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASESYNCS));
			check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHX.PRELEASEKEYS));
		}
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkWin32KeyedMutexAcquireReleaseInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkWin32KeyedMutexAcquireReleaseInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkWin32KeyedMutexAcquireReleaseInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkWin32KeyedMutexAcquireReleaseInfoKHX newInstance(long address) {
			return new VkWin32KeyedMutexAcquireReleaseInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npNext(address()); }
		/** Returns the value of the {@code acquireCount} field. */
		public int acquireCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.nacquireCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAcquireSyncs} field. */
		public LongBuffer pAcquireSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireSyncs(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAcquireKeys} field. */
		public LongBuffer pAcquireKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireKeys(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pAcquireTimeouts} field. */
		public IntBuffer pAcquireTimeouts() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireTimeouts(address()); }
		/** Returns the value of the {@code releaseCount} field. */
		public int releaseCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.nreleaseCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pReleaseSyncs} field. */
		public LongBuffer pReleaseSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npReleaseSyncs(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pReleaseKeys} field. */
		public LongBuffer pReleaseKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHX.npReleaseKeys(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer sType(int value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pNext(long value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code acquireCount} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer acquireCount(int value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.nacquireCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pAcquireSyncs} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pAcquireSyncs(LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireSyncs(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pAcquireKeys} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pAcquireKeys(LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireKeys(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pAcquireTimeouts} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pAcquireTimeouts(IntBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npAcquireTimeouts(address(), value); return this; }
		/** Sets the specified value to the {@code releaseCount} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer releaseCount(int value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.nreleaseCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pReleaseSyncs} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pReleaseSyncs(LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npReleaseSyncs(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pReleaseKeys} field. */
		public VkWin32KeyedMutexAcquireReleaseInfoKHX.Buffer pReleaseKeys(LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHX.npReleaseKeys(address(), value); return this; }

	}

}