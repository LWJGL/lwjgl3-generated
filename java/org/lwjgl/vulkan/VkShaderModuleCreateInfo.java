/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkShaderModuleCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkShaderModuleCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a shader module should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pCode} <b>must</b> be a pointer to an array of {@code codeSize / 4} {@code uint32_t} values</li>
 * <li>{@code codeSize} <b>must</b> be greater than 0</li>
 * <li>{@code codeSize} <b>must</b> be a multiple of 4</li>
 * <li>{@code pCode} <b>must</b> point to valid SPIR-V code, formatted and packed as described by
 * https://www.khronos.org/registry/spir-v/specs/1.0/SPIRV.html[the SPIR-V Specification v1.0]</li>
 * <li>{@code pCode} <b>must</b> adhere to the validation rules described by the Validation Rules within a Module section of the SPIR-V Environment appendix</li>
 * <li>{@code pCode} <b>must</b> declare the {@code Shader} capability</li>
 * <li>{@code pCode} <b>must not</b> declare any capability that is not supported by the API, as described by the Capabilities section of the SPIR-V Environment
 * appendix</li>
 * <li>If {@code pCode} declares any of the capabilities that are listed as not required by the implementation, the relevant feature <b>must</b> be enabled, as
 * listed in the SPIR-V Environment appendix</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code codeSize} &ndash; the size, in bytes, of the code pointed to by {@code pCode}</li>
 * <li>{@code pCode} &ndash; points to code that is used to create the shader module</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkShaderModuleCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkShaderModuleCreateFlags flags;
    size_t codeSize;
    const uint32_t * pCode;
}</code></pre>
 */
public class VkShaderModuleCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		CODESIZE,
		PCODE;

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
		FLAGS = layout.offsetof(2);
		CODESIZE = layout.offsetof(3);
		PCODE = layout.offsetof(4);
	}

	VkShaderModuleCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkShaderModuleCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkShaderModuleCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code codeSize} field. */
	public long codeSize() { return ncodeSize(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
	public ByteBuffer pCode() { return npCode(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkShaderModuleCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkShaderModuleCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkShaderModuleCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
	public VkShaderModuleCreateInfo pCode(ByteBuffer value) { npCode(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkShaderModuleCreateInfo set(
		int sType,
		long pNext,
		int flags,
		ByteBuffer pCode
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pCode(pCode);

		return this;
	}

	/** Unsafe version of {@link #set(VkShaderModuleCreateInfo) set}. */
	public VkShaderModuleCreateInfo nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkShaderModuleCreateInfo set(VkShaderModuleCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkShaderModuleCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkShaderModuleCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkShaderModuleCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkShaderModuleCreateInfo create() {
		return new VkShaderModuleCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkShaderModuleCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkShaderModuleCreateInfo create(long address) {
		return address == NULL ? null : new VkShaderModuleCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkShaderModuleCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkShaderModuleCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkShaderModuleCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkShaderModuleCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkShaderModuleCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkShaderModuleCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkShaderModuleCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkShaderModuleCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkShaderModuleCreateInfo.FLAGS); }
	/** Unsafe version of {@link #codeSize}. */
	public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.CODESIZE); }
	/** Unsafe version of {@link #pCode() pCode}. */
	public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE), (int)ncodeSize(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkShaderModuleCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkShaderModuleCreateInfo.FLAGS, value); }
	/** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
	public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.CODESIZE, value); }
	/** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
	public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderModuleCreateInfo.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE));
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

	/** An array of {@link VkShaderModuleCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkShaderModuleCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkShaderModuleCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkShaderModuleCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkShaderModuleCreateInfo newInstance(long address) {
			return new VkShaderModuleCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkShaderModuleCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkShaderModuleCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkShaderModuleCreateInfo.nflags(address()); }
		/** Returns the value of the {@code codeSize} field. */
		public long codeSize() { return VkShaderModuleCreateInfo.ncodeSize(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
		public ByteBuffer pCode() { return VkShaderModuleCreateInfo.npCode(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkShaderModuleCreateInfo.Buffer sType(int value) { VkShaderModuleCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkShaderModuleCreateInfo.Buffer pNext(long value) { VkShaderModuleCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkShaderModuleCreateInfo.Buffer flags(int value) { VkShaderModuleCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
		public VkShaderModuleCreateInfo.Buffer pCode(ByteBuffer value) { VkShaderModuleCreateInfo.npCode(address(), value); return this; }

	}

}