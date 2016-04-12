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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSamplerCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSamplerCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a sampler object should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code magFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code minFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code mipmapMode} <b>must</b> be a valid {@code VkSamplerMipmapMode} value</li>
 * <li>{@code addressModeU} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * <li>{@code addressModeV} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * <li>{@code addressModeW} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * <li>The absolute value of {@code mipLodBias} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxSamplerLodBias}</li>
 * <li>If the anisotropic sampling feature is not enabled, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code anisotropyEnable} is {@link VK10#VK_TRUE TRUE}, {@code maxAnisotropy} <b>must</b> be between {@code 1.0} and
 * {@link VkPhysicalDeviceLimits}{@code ::maxSamplerAnisotropy}, inclusive</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minFilter} and {@code magFilter} <b>must</b> be equal</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code mipmapMode} <b>must</b> be {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minLod} and {@code maxLod} <b>must</b> be zero</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code addressModeU} and {@code addressModeV} <b>must</b> each be either {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}
 * or {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code compareEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If any of {@code addressModeU}, {@code addressModeV} or {@code addressModeW} are {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}, {@code borderColor} <b>must</b>
 * be a valid {@code VkBorderColor} value</li>
 * <li>If the VK_KHR_mirror_clamp_to_edge extension is not enabled, {@code addressModeU}, {@code addressModeV} and {@code addressModeW} <b>must not</b> be
 * {@link KHRSamplerMirrorClampToEdge#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}</li>
 * <li>If {@code compareEnable} is {@link VK10#VK_TRUE TRUE}, {@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code magFilter} &ndash; the magnification filter to apply to lookups</li>
 * <li>{@code minFilter} &ndash; the minification filter to apply to lookups</li>
 * <li>{@code mipmapMode} &ndash; the mipmap filter to apply to lookups. One of:<br><table><tr><td>{@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}</td><td>{@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</td></tr></table></li>
 * <li>{@code addressModeU} &ndash; the addressing mode for outside [0..1] range for U coordinate. One of:<br><table><tr><td>{@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</td><td>{@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</td></tr><tr><td>{@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT}</td><td>{@link KHRSamplerMirrorClampToEdge#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}</td></tr><tr><td>{@link VK10#VK_SAMPLER_ADDRESS_MODE_REPEAT SAMPLER_ADDRESS_MODE_REPEAT}</td></tr></table></li>
 * <li>{@code addressModeV} &ndash; the addressing mode for outside [0..1] range for V coordinate</li>
 * <li>{@code addressModeW} &ndash; the addressing mode for outside [0..1] range for W coordinate</li>
 * <li>{@code mipLodBias} &ndash; the bias to be added to mipmap LOD calculation and bias provided by image sampling functions in SPIR-V</li>
 * <li>{@code anisotropyEnable} &ndash; is {@link VK10#VK_TRUE TRUE} to enable anisotropic filtering, or {@link VK10#VK_FALSE FALSE} otherwise</li>
 * <li>{@code maxAnisotropy} &ndash; the anisotropy value clamp</li>
 * <li>{@code compareEnable} &ndash; is {@link VK10#VK_TRUE TRUE} to enable comparison against a reference value during lookups, or {@link VK10#VK_FALSE FALSE} otherwise</li>
 * <li>{@code compareOp} &ndash; the comparison function to apply to fetched data before filtering. One of:<br><table><tr><td>{@link VK10#VK_COMPARE_OP_ALWAYS COMPARE_OP_ALWAYS}</td><td>{@link VK10#VK_COMPARE_OP_EQUAL COMPARE_OP_EQUAL}</td><td>{@link VK10#VK_COMPARE_OP_GREATER COMPARE_OP_GREATER}</td><td>{@link VK10#VK_COMPARE_OP_GREATER_OR_EQUAL COMPARE_OP_GREATER_OR_EQUAL}</td></tr><tr><td>{@link VK10#VK_COMPARE_OP_LESS COMPARE_OP_LESS}</td><td>{@link VK10#VK_COMPARE_OP_LESS_OR_EQUAL COMPARE_OP_LESS_OR_EQUAL}</td><td>{@link VK10#VK_COMPARE_OP_NEVER COMPARE_OP_NEVER}</td><td>{@link VK10#VK_COMPARE_OP_NOT_EQUAL COMPARE_OP_NOT_EQUAL}</td></tr></table></li>
 * <li>{@code minLod} &ndash; the minimum value to which the computed level-of-detail value will be clamped</li>
 * <li>{@code maxLod} &ndash; the maximum value to which the computed level-of-detail value will be clamped</li>
 * <li>{@code borderColor} &ndash; the predefined border color to use. One of:<br><table><tr><td>{@link VK10#VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK BORDER_COLOR_FLOAT_OPAQUE_BLACK}</td><td>{@link VK10#VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE BORDER_COLOR_FLOAT_OPAQUE_WHITE}</td></tr><tr><td>{@link VK10#VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK BORDER_COLOR_FLOAT_TRANSPARENT_BLACK}</td><td>{@link VK10#VK_BORDER_COLOR_INT_OPAQUE_BLACK BORDER_COLOR_INT_OPAQUE_BLACK}</td></tr><tr><td>{@link VK10#VK_BORDER_COLOR_INT_OPAQUE_WHITE BORDER_COLOR_INT_OPAQUE_WHITE}</td><td>{@link VK10#VK_BORDER_COLOR_INT_TRANSPARENT_BLACK BORDER_COLOR_INT_TRANSPARENT_BLACK}</td></tr></table></li>
 * <li>{@code unnormalizedCoordinates} &ndash; controls whether to use unnormalized or normalized texel coordinates to address texels of the image</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSamplerCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkSamplerCreateFlags flags;
    VkFilter magFilter;
    VkFilter minFilter;
    VkSamplerMipmapMode mipmapMode;
    VkSamplerAddressMode addressModeU;
    VkSamplerAddressMode addressModeV;
    VkSamplerAddressMode addressModeW;
    float mipLodBias;
    VkBool32 anisotropyEnable;
    float maxAnisotropy;
    VkBool32 compareEnable;
    VkCompareOp compareOp;
    float minLod;
    float maxLod;
    VkBorderColor borderColor;
    VkBool32 unnormalizedCoordinates;
}</code></pre>
 */
public class VkSamplerCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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

	// -----------------------------------

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSamplerCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSamplerCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSamplerCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSamplerCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSamplerCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSamplerCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
			return new VkSamplerCreateInfo(address, getContainer());
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