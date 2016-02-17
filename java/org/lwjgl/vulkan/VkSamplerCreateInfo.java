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
 * struct VkSamplerCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSamplerCreateFlags flags;
 *     VkFilter magFilter;
 *     VkFilter minFilter;
 *     VkSamplerMipmapMode mipmapMode;
 *     VkSamplerAddressMode addressModeU;
 *     VkSamplerAddressMode addressModeV;
 *     VkSamplerAddressMode addressModeW;
 *     float mipLodBias;
 *     VkBool32 anisotropyEnable;
 *     float maxAnisotropy;
 *     VkBool32 compareEnable;
 *     VkCompareOp compareOp;
 *     float minLod;
 *     float maxLod;
 *     VkBorderColor borderColor;
 *     VkBool32 unnormalizedCoordinates;
 * }</code></pre>
 */
public class VkSamplerCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		MAGFILTER,
		MINFILTER,
		MIPMAPMODE,
		ADDRESSMODEU,
		ADDRESSMODEV,
		ADDRESSMODEW,
		MIPLODBIAS,
		ANISOTROPYENABLE,
		MAXANISOTROPY,
		COMPAREENABLE,
		COMPAREOP,
		MINLOD,
		MAXLOD,
		BORDERCOLOR,
		UNNORMALIZEDCOORDINATES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		MAGFILTER = layout.offsetof(3);
		MINFILTER = layout.offsetof(4);
		MIPMAPMODE = layout.offsetof(5);
		ADDRESSMODEU = layout.offsetof(6);
		ADDRESSMODEV = layout.offsetof(7);
		ADDRESSMODEW = layout.offsetof(8);
		MIPLODBIAS = layout.offsetof(9);
		ANISOTROPYENABLE = layout.offsetof(10);
		MAXANISOTROPY = layout.offsetof(11);
		COMPAREENABLE = layout.offsetof(12);
		COMPAREOP = layout.offsetof(13);
		MINLOD = layout.offsetof(14);
		MAXLOD = layout.offsetof(15);
		BORDERCOLOR = layout.offsetof(16);
		UNNORMALIZEDCOORDINATES = layout.offsetof(17);
	}

	VkSamplerCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSamplerCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSamplerCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code magFilter} field. */
	public int magFilter() { return nmagFilter(address()); }
	/** Returns the value of the {@code minFilter} field. */
	public int minFilter() { return nminFilter(address()); }
	/** Returns the value of the {@code mipmapMode} field. */
	public int mipmapMode() { return nmipmapMode(address()); }
	/** Returns the value of the {@code addressModeU} field. */
	public int addressModeU() { return naddressModeU(address()); }
	/** Returns the value of the {@code addressModeV} field. */
	public int addressModeV() { return naddressModeV(address()); }
	/** Returns the value of the {@code addressModeW} field. */
	public int addressModeW() { return naddressModeW(address()); }
	/** Returns the value of the {@code mipLodBias} field. */
	public float mipLodBias() { return nmipLodBias(address()); }
	/** Returns the value of the {@code anisotropyEnable} field. */
	public int anisotropyEnable() { return nanisotropyEnable(address()); }
	/** Returns the value of the {@code maxAnisotropy} field. */
	public float maxAnisotropy() { return nmaxAnisotropy(address()); }
	/** Returns the value of the {@code compareEnable} field. */
	public int compareEnable() { return ncompareEnable(address()); }
	/** Returns the value of the {@code compareOp} field. */
	public int compareOp() { return ncompareOp(address()); }
	/** Returns the value of the {@code minLod} field. */
	public float minLod() { return nminLod(address()); }
	/** Returns the value of the {@code maxLod} field. */
	public float maxLod() { return nmaxLod(address()); }
	/** Returns the value of the {@code borderColor} field. */
	public int borderColor() { return nborderColor(address()); }
	/** Returns the value of the {@code unnormalizedCoordinates} field. */
	public int unnormalizedCoordinates() { return nunnormalizedCoordinates(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkSamplerCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkSamplerCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkSamplerCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code magFilter} field. */
	public VkSamplerCreateInfo magFilter(int value) { nmagFilter(address(), value); return this; }
	/** Sets the specified value to the {@code minFilter} field. */
	public VkSamplerCreateInfo minFilter(int value) { nminFilter(address(), value); return this; }
	/** Sets the specified value to the {@code mipmapMode} field. */
	public VkSamplerCreateInfo mipmapMode(int value) { nmipmapMode(address(), value); return this; }
	/** Sets the specified value to the {@code addressModeU} field. */
	public VkSamplerCreateInfo addressModeU(int value) { naddressModeU(address(), value); return this; }
	/** Sets the specified value to the {@code addressModeV} field. */
	public VkSamplerCreateInfo addressModeV(int value) { naddressModeV(address(), value); return this; }
	/** Sets the specified value to the {@code addressModeW} field. */
	public VkSamplerCreateInfo addressModeW(int value) { naddressModeW(address(), value); return this; }
	/** Sets the specified value to the {@code mipLodBias} field. */
	public VkSamplerCreateInfo mipLodBias(float value) { nmipLodBias(address(), value); return this; }
	/** Sets the specified value to the {@code anisotropyEnable} field. */
	public VkSamplerCreateInfo anisotropyEnable(int value) { nanisotropyEnable(address(), value); return this; }
	/** Sets the specified value to the {@code maxAnisotropy} field. */
	public VkSamplerCreateInfo maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
	/** Sets the specified value to the {@code compareEnable} field. */
	public VkSamplerCreateInfo compareEnable(int value) { ncompareEnable(address(), value); return this; }
	/** Sets the specified value to the {@code compareOp} field. */
	public VkSamplerCreateInfo compareOp(int value) { ncompareOp(address(), value); return this; }
	/** Sets the specified value to the {@code minLod} field. */
	public VkSamplerCreateInfo minLod(float value) { nminLod(address(), value); return this; }
	/** Sets the specified value to the {@code maxLod} field. */
	public VkSamplerCreateInfo maxLod(float value) { nmaxLod(address(), value); return this; }
	/** Sets the specified value to the {@code borderColor} field. */
	public VkSamplerCreateInfo borderColor(int value) { nborderColor(address(), value); return this; }
	/** Sets the specified value to the {@code unnormalizedCoordinates} field. */
	public VkSamplerCreateInfo unnormalizedCoordinates(int value) { nunnormalizedCoordinates(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSamplerCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int magFilter,
		int minFilter,
		int mipmapMode,
		int addressModeU,
		int addressModeV,
		int addressModeW,
		float mipLodBias,
		int anisotropyEnable,
		float maxAnisotropy,
		int compareEnable,
		int compareOp,
		float minLod,
		float maxLod,
		int borderColor,
		int unnormalizedCoordinates
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		magFilter(magFilter);
		minFilter(minFilter);
		mipmapMode(mipmapMode);
		addressModeU(addressModeU);
		addressModeV(addressModeV);
		addressModeW(addressModeW);
		mipLodBias(mipLodBias);
		anisotropyEnable(anisotropyEnable);
		maxAnisotropy(maxAnisotropy);
		compareEnable(compareEnable);
		compareOp(compareOp);
		minLod(minLod);
		maxLod(maxLod);
		borderColor(borderColor);
		unnormalizedCoordinates(unnormalizedCoordinates);

		return this;
	}

	/** Unsafe version of {@link #set(VkSamplerCreateInfo) set}. */
	public VkSamplerCreateInfo nset(long struct) {
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
	public VkSamplerCreateInfo set(VkSamplerCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSamplerCreateInfo) set}. */
	public VkSamplerCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSamplerCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSamplerCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkSamplerCreateInfo create() {
		return new VkSamplerCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSamplerCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSamplerCreateInfo create(long address) {
		return address == NULL ? null : new VkSamplerCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSamplerCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkSamplerCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSamplerCreateInfo.FLAGS); }
	/** Unsafe version of {@link #magFilter}. */
	public static int nmagFilter(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MAGFILTER); }
	/** Unsafe version of {@link #minFilter}. */
	public static int nminFilter(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MINFILTER); }
	/** Unsafe version of {@link #mipmapMode}. */
	public static int nmipmapMode(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MIPMAPMODE); }
	/** Unsafe version of {@link #addressModeU}. */
	public static int naddressModeU(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEU); }
	/** Unsafe version of {@link #addressModeV}. */
	public static int naddressModeV(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEV); }
	/** Unsafe version of {@link #addressModeW}. */
	public static int naddressModeW(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEW); }
	/** Unsafe version of {@link #mipLodBias}. */
	public static float nmipLodBias(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MIPLODBIAS); }
	/** Unsafe version of {@link #anisotropyEnable}. */
	public static int nanisotropyEnable(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ANISOTROPYENABLE); }
	/** Unsafe version of {@link #maxAnisotropy}. */
	public static float nmaxAnisotropy(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MAXANISOTROPY); }
	/** Unsafe version of {@link #compareEnable}. */
	public static int ncompareEnable(long struct) { return memGetInt(struct + VkSamplerCreateInfo.COMPAREENABLE); }
	/** Unsafe version of {@link #compareOp}. */
	public static int ncompareOp(long struct) { return memGetInt(struct + VkSamplerCreateInfo.COMPAREOP); }
	/** Unsafe version of {@link #minLod}. */
	public static float nminLod(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MINLOD); }
	/** Unsafe version of {@link #maxLod}. */
	public static float nmaxLod(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MAXLOD); }
	/** Unsafe version of {@link #borderColor}. */
	public static int nborderColor(long struct) { return memGetInt(struct + VkSamplerCreateInfo.BORDERCOLOR); }
	/** Unsafe version of {@link #unnormalizedCoordinates}. */
	public static int nunnormalizedCoordinates(long struct) { return memGetInt(struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #magFilter(int) magFilter}. */
	public static void nmagFilter(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MAGFILTER, value); }
	/** Unsafe version of {@link #minFilter(int) minFilter}. */
	public static void nminFilter(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MINFILTER, value); }
	/** Unsafe version of {@link #mipmapMode(int) mipmapMode}. */
	public static void nmipmapMode(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MIPMAPMODE, value); }
	/** Unsafe version of {@link #addressModeU(int) addressModeU}. */
	public static void naddressModeU(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEU, value); }
	/** Unsafe version of {@link #addressModeV(int) addressModeV}. */
	public static void naddressModeV(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEV, value); }
	/** Unsafe version of {@link #addressModeW(int) addressModeW}. */
	public static void naddressModeW(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEW, value); }
	/** Unsafe version of {@link #mipLodBias(float) mipLodBias}. */
	public static void nmipLodBias(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MIPLODBIAS, value); }
	/** Unsafe version of {@link #anisotropyEnable(int) anisotropyEnable}. */
	public static void nanisotropyEnable(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ANISOTROPYENABLE, value); }
	/** Unsafe version of {@link #maxAnisotropy(float) maxAnisotropy}. */
	public static void nmaxAnisotropy(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MAXANISOTROPY, value); }
	/** Unsafe version of {@link #compareEnable(int) compareEnable}. */
	public static void ncompareEnable(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.COMPAREENABLE, value); }
	/** Unsafe version of {@link #compareOp(int) compareOp}. */
	public static void ncompareOp(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.COMPAREOP, value); }
	/** Unsafe version of {@link #minLod(float) minLod}. */
	public static void nminLod(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MINLOD, value); }
	/** Unsafe version of {@link #maxLod(float) maxLod}. */
	public static void nmaxLod(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MAXLOD, value); }
	/** Unsafe version of {@link #borderColor(int) borderColor}. */
	public static void nborderColor(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.BORDERCOLOR, value); }
	/** Unsafe version of {@link #unnormalizedCoordinates(int) unnormalizedCoordinates}. */
	public static void nunnormalizedCoordinates(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES, value); }

	// -----------------------------------

	/** An array of {@link VkSamplerCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSamplerCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkSamplerCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSamplerCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSamplerCreateInfo newInstance(long address) {
			return new VkSamplerCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkSamplerCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkSamplerCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSamplerCreateInfo.nflags(address()); }
		/** Returns the value of the {@code magFilter} field. */
		public int magFilter() { return VkSamplerCreateInfo.nmagFilter(address()); }
		/** Returns the value of the {@code minFilter} field. */
		public int minFilter() { return VkSamplerCreateInfo.nminFilter(address()); }
		/** Returns the value of the {@code mipmapMode} field. */
		public int mipmapMode() { return VkSamplerCreateInfo.nmipmapMode(address()); }
		/** Returns the value of the {@code addressModeU} field. */
		public int addressModeU() { return VkSamplerCreateInfo.naddressModeU(address()); }
		/** Returns the value of the {@code addressModeV} field. */
		public int addressModeV() { return VkSamplerCreateInfo.naddressModeV(address()); }
		/** Returns the value of the {@code addressModeW} field. */
		public int addressModeW() { return VkSamplerCreateInfo.naddressModeW(address()); }
		/** Returns the value of the {@code mipLodBias} field. */
		public float mipLodBias() { return VkSamplerCreateInfo.nmipLodBias(address()); }
		/** Returns the value of the {@code anisotropyEnable} field. */
		public int anisotropyEnable() { return VkSamplerCreateInfo.nanisotropyEnable(address()); }
		/** Returns the value of the {@code maxAnisotropy} field. */
		public float maxAnisotropy() { return VkSamplerCreateInfo.nmaxAnisotropy(address()); }
		/** Returns the value of the {@code compareEnable} field. */
		public int compareEnable() { return VkSamplerCreateInfo.ncompareEnable(address()); }
		/** Returns the value of the {@code compareOp} field. */
		public int compareOp() { return VkSamplerCreateInfo.ncompareOp(address()); }
		/** Returns the value of the {@code minLod} field. */
		public float minLod() { return VkSamplerCreateInfo.nminLod(address()); }
		/** Returns the value of the {@code maxLod} field. */
		public float maxLod() { return VkSamplerCreateInfo.nmaxLod(address()); }
		/** Returns the value of the {@code borderColor} field. */
		public int borderColor() { return VkSamplerCreateInfo.nborderColor(address()); }
		/** Returns the value of the {@code unnormalizedCoordinates} field. */
		public int unnormalizedCoordinates() { return VkSamplerCreateInfo.nunnormalizedCoordinates(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkSamplerCreateInfo.Buffer sType(int value) { VkSamplerCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkSamplerCreateInfo.Buffer pNext(long value) { VkSamplerCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkSamplerCreateInfo.Buffer flags(int value) { VkSamplerCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code magFilter} field. */
		public VkSamplerCreateInfo.Buffer magFilter(int value) { VkSamplerCreateInfo.nmagFilter(address(), value); return this; }
		/** Sets the specified value to the {@code minFilter} field. */
		public VkSamplerCreateInfo.Buffer minFilter(int value) { VkSamplerCreateInfo.nminFilter(address(), value); return this; }
		/** Sets the specified value to the {@code mipmapMode} field. */
		public VkSamplerCreateInfo.Buffer mipmapMode(int value) { VkSamplerCreateInfo.nmipmapMode(address(), value); return this; }
		/** Sets the specified value to the {@code addressModeU} field. */
		public VkSamplerCreateInfo.Buffer addressModeU(int value) { VkSamplerCreateInfo.naddressModeU(address(), value); return this; }
		/** Sets the specified value to the {@code addressModeV} field. */
		public VkSamplerCreateInfo.Buffer addressModeV(int value) { VkSamplerCreateInfo.naddressModeV(address(), value); return this; }
		/** Sets the specified value to the {@code addressModeW} field. */
		public VkSamplerCreateInfo.Buffer addressModeW(int value) { VkSamplerCreateInfo.naddressModeW(address(), value); return this; }
		/** Sets the specified value to the {@code mipLodBias} field. */
		public VkSamplerCreateInfo.Buffer mipLodBias(float value) { VkSamplerCreateInfo.nmipLodBias(address(), value); return this; }
		/** Sets the specified value to the {@code anisotropyEnable} field. */
		public VkSamplerCreateInfo.Buffer anisotropyEnable(int value) { VkSamplerCreateInfo.nanisotropyEnable(address(), value); return this; }
		/** Sets the specified value to the {@code maxAnisotropy} field. */
		public VkSamplerCreateInfo.Buffer maxAnisotropy(float value) { VkSamplerCreateInfo.nmaxAnisotropy(address(), value); return this; }
		/** Sets the specified value to the {@code compareEnable} field. */
		public VkSamplerCreateInfo.Buffer compareEnable(int value) { VkSamplerCreateInfo.ncompareEnable(address(), value); return this; }
		/** Sets the specified value to the {@code compareOp} field. */
		public VkSamplerCreateInfo.Buffer compareOp(int value) { VkSamplerCreateInfo.ncompareOp(address(), value); return this; }
		/** Sets the specified value to the {@code minLod} field. */
		public VkSamplerCreateInfo.Buffer minLod(float value) { VkSamplerCreateInfo.nminLod(address(), value); return this; }
		/** Sets the specified value to the {@code maxLod} field. */
		public VkSamplerCreateInfo.Buffer maxLod(float value) { VkSamplerCreateInfo.nmaxLod(address(), value); return this; }
		/** Sets the specified value to the {@code borderColor} field. */
		public VkSamplerCreateInfo.Buffer borderColor(int value) { VkSamplerCreateInfo.nborderColor(address(), value); return this; }
		/** Sets the specified value to the {@code unnormalizedCoordinates} field. */
		public VkSamplerCreateInfo.Buffer unnormalizedCoordinates(int value) { VkSamplerCreateInfo.nunnormalizedCoordinates(address(), value); return this; }

	}

}