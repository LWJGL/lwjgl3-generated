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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkPipelineShaderStageCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkPipelineShaderStageCreateFlags flags;
 *     VkShaderStageFlagBits stage;
 *     VkShaderModule module;
 *     const char * pName;
 *     const VkSpecializationInfo * pSpecializationInfo;
 * }</code></pre>
 */
public class VkPipelineShaderStageCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		STAGE,
		MODULE,
		PNAME,
		PSPECIALIZATIONINFO;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(8),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		STAGE = layout.offsetof(3);
		MODULE = layout.offsetof(4);
		PNAME = layout.offsetof(5);
		PSPECIALIZATIONINFO = layout.offsetof(6);
	}

	VkPipelineShaderStageCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineShaderStageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineShaderStageCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code stage} field. */
	public int stage() { return nstage(address()); }
	/** Returns the value of the {@code module} field. */
	public long module() { return nmodule(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
	public ByteBuffer pName() { return npName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code pName} field. */
	public String pNameString() { return npNameString(address()); }
	/** Returns a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
	public VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineShaderStageCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineShaderStageCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineShaderStageCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code stage} field. */
	public VkPipelineShaderStageCreateInfo stage(int value) { nstage(address(), value); return this; }
	/** Sets the specified value to the {@code module} field. */
	public VkPipelineShaderStageCreateInfo module(long value) { nmodule(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code pName} field. */
	public VkPipelineShaderStageCreateInfo pName(ByteBuffer value) { npName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #pNameFree}.</p>
	 */
	public VkPipelineShaderStageCreateInfo pName(CharSequence value) { npName(address(), value); return this; }
	/** Frees the string encoded by {@link #pName(CharSequence)} and stored in the {@code pName} field. */
	public VkPipelineShaderStageCreateInfo pNameFree() { npNameFree(address()); return this; }
	/** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
	public VkPipelineShaderStageCreateInfo pSpecializationInfo(VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineShaderStageCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int stage,
		long module,
		ByteBuffer pName,
		VkSpecializationInfo pSpecializationInfo
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		stage(stage);
		module(module);
		pName(pName);
		pSpecializationInfo(pSpecializationInfo);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineShaderStageCreateInfo) set}. */
	public VkPipelineShaderStageCreateInfo nset(long struct) {
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
	public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineShaderStageCreateInfo) set}. */
	public VkPipelineShaderStageCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineShaderStageCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineShaderStageCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineShaderStageCreateInfo create() {
		return new VkPipelineShaderStageCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineShaderStageCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineShaderStageCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineShaderStageCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineShaderStageCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.FLAGS); }
	/** Unsafe version of {@link #stage}. */
	public static int nstage(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STAGE); }
	/** Unsafe version of {@link #module}. */
	public static long nmodule(long struct) { return memGetLong(struct + VkPipelineShaderStageCreateInfo.MODULE); }
	/** Unsafe version of {@link #pName}. */
	public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
	/** Unsafe version of {@link #pNameString}. */
	public static String npNameString(long struct) { return memDecodeUTF8(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
	/** Unsafe version of {@link #pSpecializationInfo}. */
	public static VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.create(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #stage(int) stage}. */
	public static void nstage(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STAGE, value); }
	/** Unsafe version of {@link #module(long) module}. */
	public static void nmodule(long struct, long value) { memPutLong(struct + VkPipelineShaderStageCreateInfo.MODULE, value); }
	/** Unsafe version of {@link #pName(ByteBuffer) pName}. */
	public static void npName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #pName(CharSequence) pName}. */
	public static void npName(long struct, CharSequence value) { npName(struct, memEncodeUTF8(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #pNameFree}. */
	public static void npNameFree(long struct) { nmemFree(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
	/** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
	public static void npSpecializationInfo(long struct, VkSpecializationInfo value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO, addressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkPipelineShaderStageCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineShaderStageCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineShaderStageCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineShaderStageCreateInfo newInstance(long address) {
			return new VkPipelineShaderStageCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineShaderStageCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineShaderStageCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineShaderStageCreateInfo.nflags(address()); }
		/** Returns the value of the {@code stage} field. */
		public int stage() { return VkPipelineShaderStageCreateInfo.nstage(address()); }
		/** Returns the value of the {@code module} field. */
		public long module() { return VkPipelineShaderStageCreateInfo.nmodule(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
		public ByteBuffer pName() { return VkPipelineShaderStageCreateInfo.npName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code pName} field. */
		public String pNameString() { return VkPipelineShaderStageCreateInfo.npNameString(address()); }
		/** Returns a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
		public VkSpecializationInfo pSpecializationInfo() { return VkPipelineShaderStageCreateInfo.npSpecializationInfo(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineShaderStageCreateInfo.Buffer sType(int value) { VkPipelineShaderStageCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pNext(long value) { VkPipelineShaderStageCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineShaderStageCreateInfo.Buffer flags(int value) { VkPipelineShaderStageCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code stage} field. */
		public VkPipelineShaderStageCreateInfo.Buffer stage(int value) { VkPipelineShaderStageCreateInfo.nstage(address(), value); return this; }
		/** Sets the specified value to the {@code module} field. */
		public VkPipelineShaderStageCreateInfo.Buffer module(long value) { VkPipelineShaderStageCreateInfo.nmodule(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code pName} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pName(ByteBuffer value) { VkPipelineShaderStageCreateInfo.npName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #pNameFree}.</p>
		 */
		public VkPipelineShaderStageCreateInfo.Buffer pName(CharSequence value) { VkPipelineShaderStageCreateInfo.npName(address(), value); return this; }
		/** Frees the string encoded by {@link #pName(CharSequence)} and stored in the {@code pName} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pNameFree() { VkPipelineShaderStageCreateInfo.npNameFree(address()); return this; }
		/** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
		public VkPipelineShaderStageCreateInfo.Buffer pSpecializationInfo(VkSpecializationInfo value) { VkPipelineShaderStageCreateInfo.npSpecializationInfo(address(), value); return this; }

	}

}