/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkPhysicalDeviceFeatures {
 *     VkBool32 robustBufferAccess;
 *     VkBool32 fullDrawIndexUint32;
 *     VkBool32 imageCubeArray;
 *     VkBool32 independentBlend;
 *     VkBool32 geometryShader;
 *     VkBool32 tessellationShader;
 *     VkBool32 sampleRateShading;
 *     VkBool32 dualSrcBlend;
 *     VkBool32 logicOp;
 *     VkBool32 multiDrawIndirect;
 *     VkBool32 drawIndirectFirstInstance;
 *     VkBool32 depthClamp;
 *     VkBool32 depthBiasClamp;
 *     VkBool32 fillModeNonSolid;
 *     VkBool32 depthBounds;
 *     VkBool32 wideLines;
 *     VkBool32 largePoints;
 *     VkBool32 alphaToOne;
 *     VkBool32 multiViewport;
 *     VkBool32 samplerAnisotropy;
 *     VkBool32 textureCompressionETC2;
 *     VkBool32 textureCompressionASTC_LDR;
 *     VkBool32 textureCompressionBC;
 *     VkBool32 occlusionQueryPrecise;
 *     VkBool32 pipelineStatisticsQuery;
 *     VkBool32 vertexPipelineStoresAndAtomics;
 *     VkBool32 fragmentStoresAndAtomics;
 *     VkBool32 shaderTessellationAndGeometryPointSize;
 *     VkBool32 shaderImageGatherExtended;
 *     VkBool32 shaderStorageImageExtendedFormats;
 *     VkBool32 shaderStorageImageMultisample;
 *     VkBool32 shaderStorageImageReadWithoutFormat;
 *     VkBool32 shaderStorageImageWriteWithoutFormat;
 *     VkBool32 shaderUniformBufferArrayDynamicIndexing;
 *     VkBool32 shaderSampledImageArrayDynamicIndexing;
 *     VkBool32 shaderStorageBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageImageArrayDynamicIndexing;
 *     VkBool32 shaderClipDistance;
 *     VkBool32 shaderCullDistance;
 *     VkBool32 shaderFloat64;
 *     VkBool32 shaderInt64;
 *     VkBool32 shaderInt16;
 *     VkBool32 shaderResourceResidency;
 *     VkBool32 shaderResourceMinLod;
 *     VkBool32 sparseBinding;
 *     VkBool32 sparseResidencyBuffer;
 *     VkBool32 sparseResidencyImage2D;
 *     VkBool32 sparseResidencyImage3D;
 *     VkBool32 sparseResidency2Samples;
 *     VkBool32 sparseResidency4Samples;
 *     VkBool32 sparseResidency8Samples;
 *     VkBool32 sparseResidency16Samples;
 *     VkBool32 sparseResidencyAliased;
 *     VkBool32 variableMultisampleRate;
 *     VkBool32 inheritedQueries;
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ROBUSTBUFFERACCESS,
		FULLDRAWINDEXUINT32,
		IMAGECUBEARRAY,
		INDEPENDENTBLEND,
		GEOMETRYSHADER,
		TESSELLATIONSHADER,
		SAMPLERATESHADING,
		DUALSRCBLEND,
		LOGICOP,
		MULTIDRAWINDIRECT,
		DRAWINDIRECTFIRSTINSTANCE,
		DEPTHCLAMP,
		DEPTHBIASCLAMP,
		FILLMODENONSOLID,
		DEPTHBOUNDS,
		WIDELINES,
		LARGEPOINTS,
		ALPHATOONE,
		MULTIVIEWPORT,
		SAMPLERANISOTROPY,
		TEXTURECOMPRESSIONETC2,
		TEXTURECOMPRESSIONASTC_LDR,
		TEXTURECOMPRESSIONBC,
		OCCLUSIONQUERYPRECISE,
		PIPELINESTATISTICSQUERY,
		VERTEXPIPELINESTORESANDATOMICS,
		FRAGMENTSTORESANDATOMICS,
		SHADERTESSELLATIONANDGEOMETRYPOINTSIZE,
		SHADERIMAGEGATHEREXTENDED,
		SHADERSTORAGEIMAGEEXTENDEDFORMATS,
		SHADERSTORAGEIMAGEMULTISAMPLE,
		SHADERSTORAGEIMAGEREADWITHOUTFORMAT,
		SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT,
		SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING,
		SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING,
		SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING,
		SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING,
		SHADERCLIPDISTANCE,
		SHADERCULLDISTANCE,
		SHADERFLOAT64,
		SHADERINT64,
		SHADERINT16,
		SHADERRESOURCERESIDENCY,
		SHADERRESOURCEMINLOD,
		SPARSEBINDING,
		SPARSERESIDENCYBUFFER,
		SPARSERESIDENCYIMAGE2D,
		SPARSERESIDENCYIMAGE3D,
		SPARSERESIDENCY2SAMPLES,
		SPARSERESIDENCY4SAMPLES,
		SPARSERESIDENCY8SAMPLES,
		SPARSERESIDENCY16SAMPLES,
		SPARSERESIDENCYALIASED,
		VARIABLEMULTISAMPLERATE,
		INHERITEDQUERIES;

	static {
		Layout layout = __struct(
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

		ROBUSTBUFFERACCESS = layout.offsetof(0);
		FULLDRAWINDEXUINT32 = layout.offsetof(1);
		IMAGECUBEARRAY = layout.offsetof(2);
		INDEPENDENTBLEND = layout.offsetof(3);
		GEOMETRYSHADER = layout.offsetof(4);
		TESSELLATIONSHADER = layout.offsetof(5);
		SAMPLERATESHADING = layout.offsetof(6);
		DUALSRCBLEND = layout.offsetof(7);
		LOGICOP = layout.offsetof(8);
		MULTIDRAWINDIRECT = layout.offsetof(9);
		DRAWINDIRECTFIRSTINSTANCE = layout.offsetof(10);
		DEPTHCLAMP = layout.offsetof(11);
		DEPTHBIASCLAMP = layout.offsetof(12);
		FILLMODENONSOLID = layout.offsetof(13);
		DEPTHBOUNDS = layout.offsetof(14);
		WIDELINES = layout.offsetof(15);
		LARGEPOINTS = layout.offsetof(16);
		ALPHATOONE = layout.offsetof(17);
		MULTIVIEWPORT = layout.offsetof(18);
		SAMPLERANISOTROPY = layout.offsetof(19);
		TEXTURECOMPRESSIONETC2 = layout.offsetof(20);
		TEXTURECOMPRESSIONASTC_LDR = layout.offsetof(21);
		TEXTURECOMPRESSIONBC = layout.offsetof(22);
		OCCLUSIONQUERYPRECISE = layout.offsetof(23);
		PIPELINESTATISTICSQUERY = layout.offsetof(24);
		VERTEXPIPELINESTORESANDATOMICS = layout.offsetof(25);
		FRAGMENTSTORESANDATOMICS = layout.offsetof(26);
		SHADERTESSELLATIONANDGEOMETRYPOINTSIZE = layout.offsetof(27);
		SHADERIMAGEGATHEREXTENDED = layout.offsetof(28);
		SHADERSTORAGEIMAGEEXTENDEDFORMATS = layout.offsetof(29);
		SHADERSTORAGEIMAGEMULTISAMPLE = layout.offsetof(30);
		SHADERSTORAGEIMAGEREADWITHOUTFORMAT = layout.offsetof(31);
		SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT = layout.offsetof(32);
		SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING = layout.offsetof(33);
		SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING = layout.offsetof(34);
		SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING = layout.offsetof(35);
		SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING = layout.offsetof(36);
		SHADERCLIPDISTANCE = layout.offsetof(37);
		SHADERCULLDISTANCE = layout.offsetof(38);
		SHADERFLOAT64 = layout.offsetof(39);
		SHADERINT64 = layout.offsetof(40);
		SHADERINT16 = layout.offsetof(41);
		SHADERRESOURCERESIDENCY = layout.offsetof(42);
		SHADERRESOURCEMINLOD = layout.offsetof(43);
		SPARSEBINDING = layout.offsetof(44);
		SPARSERESIDENCYBUFFER = layout.offsetof(45);
		SPARSERESIDENCYIMAGE2D = layout.offsetof(46);
		SPARSERESIDENCYIMAGE3D = layout.offsetof(47);
		SPARSERESIDENCY2SAMPLES = layout.offsetof(48);
		SPARSERESIDENCY4SAMPLES = layout.offsetof(49);
		SPARSERESIDENCY8SAMPLES = layout.offsetof(50);
		SPARSERESIDENCY16SAMPLES = layout.offsetof(51);
		SPARSERESIDENCYALIASED = layout.offsetof(52);
		VARIABLEMULTISAMPLERATE = layout.offsetof(53);
		INHERITEDQUERIES = layout.offsetof(54);
	}

	VkPhysicalDeviceFeatures(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceFeatures(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code robustBufferAccess} field. */
	public int robustBufferAccess() { return nrobustBufferAccess(address()); }
	/** Returns the value of the {@code fullDrawIndexUint32} field. */
	public int fullDrawIndexUint32() { return nfullDrawIndexUint32(address()); }
	/** Returns the value of the {@code imageCubeArray} field. */
	public int imageCubeArray() { return nimageCubeArray(address()); }
	/** Returns the value of the {@code independentBlend} field. */
	public int independentBlend() { return nindependentBlend(address()); }
	/** Returns the value of the {@code geometryShader} field. */
	public int geometryShader() { return ngeometryShader(address()); }
	/** Returns the value of the {@code tessellationShader} field. */
	public int tessellationShader() { return ntessellationShader(address()); }
	/** Returns the value of the {@code sampleRateShading} field. */
	public int sampleRateShading() { return nsampleRateShading(address()); }
	/** Returns the value of the {@code dualSrcBlend} field. */
	public int dualSrcBlend() { return ndualSrcBlend(address()); }
	/** Returns the value of the {@code logicOp} field. */
	public int logicOp() { return nlogicOp(address()); }
	/** Returns the value of the {@code multiDrawIndirect} field. */
	public int multiDrawIndirect() { return nmultiDrawIndirect(address()); }
	/** Returns the value of the {@code drawIndirectFirstInstance} field. */
	public int drawIndirectFirstInstance() { return ndrawIndirectFirstInstance(address()); }
	/** Returns the value of the {@code depthClamp} field. */
	public int depthClamp() { return ndepthClamp(address()); }
	/** Returns the value of the {@code depthBiasClamp} field. */
	public int depthBiasClamp() { return ndepthBiasClamp(address()); }
	/** Returns the value of the {@code fillModeNonSolid} field. */
	public int fillModeNonSolid() { return nfillModeNonSolid(address()); }
	/** Returns the value of the {@code depthBounds} field. */
	public int depthBounds() { return ndepthBounds(address()); }
	/** Returns the value of the {@code wideLines} field. */
	public int wideLines() { return nwideLines(address()); }
	/** Returns the value of the {@code largePoints} field. */
	public int largePoints() { return nlargePoints(address()); }
	/** Returns the value of the {@code alphaToOne} field. */
	public int alphaToOne() { return nalphaToOne(address()); }
	/** Returns the value of the {@code multiViewport} field. */
	public int multiViewport() { return nmultiViewport(address()); }
	/** Returns the value of the {@code samplerAnisotropy} field. */
	public int samplerAnisotropy() { return nsamplerAnisotropy(address()); }
	/** Returns the value of the {@code textureCompressionETC2} field. */
	public int textureCompressionETC2() { return ntextureCompressionETC2(address()); }
	/** Returns the value of the {@code textureCompressionASTC_LDR} field. */
	public int textureCompressionASTC_LDR() { return ntextureCompressionASTC_LDR(address()); }
	/** Returns the value of the {@code textureCompressionBC} field. */
	public int textureCompressionBC() { return ntextureCompressionBC(address()); }
	/** Returns the value of the {@code occlusionQueryPrecise} field. */
	public int occlusionQueryPrecise() { return nocclusionQueryPrecise(address()); }
	/** Returns the value of the {@code pipelineStatisticsQuery} field. */
	public int pipelineStatisticsQuery() { return npipelineStatisticsQuery(address()); }
	/** Returns the value of the {@code vertexPipelineStoresAndAtomics} field. */
	public int vertexPipelineStoresAndAtomics() { return nvertexPipelineStoresAndAtomics(address()); }
	/** Returns the value of the {@code fragmentStoresAndAtomics} field. */
	public int fragmentStoresAndAtomics() { return nfragmentStoresAndAtomics(address()); }
	/** Returns the value of the {@code shaderTessellationAndGeometryPointSize} field. */
	public int shaderTessellationAndGeometryPointSize() { return nshaderTessellationAndGeometryPointSize(address()); }
	/** Returns the value of the {@code shaderImageGatherExtended} field. */
	public int shaderImageGatherExtended() { return nshaderImageGatherExtended(address()); }
	/** Returns the value of the {@code shaderStorageImageExtendedFormats} field. */
	public int shaderStorageImageExtendedFormats() { return nshaderStorageImageExtendedFormats(address()); }
	/** Returns the value of the {@code shaderStorageImageMultisample} field. */
	public int shaderStorageImageMultisample() { return nshaderStorageImageMultisample(address()); }
	/** Returns the value of the {@code shaderStorageImageReadWithoutFormat} field. */
	public int shaderStorageImageReadWithoutFormat() { return nshaderStorageImageReadWithoutFormat(address()); }
	/** Returns the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
	public int shaderStorageImageWriteWithoutFormat() { return nshaderStorageImageWriteWithoutFormat(address()); }
	/** Returns the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
	public int shaderUniformBufferArrayDynamicIndexing() { return nshaderUniformBufferArrayDynamicIndexing(address()); }
	/** Returns the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
	public int shaderSampledImageArrayDynamicIndexing() { return nshaderSampledImageArrayDynamicIndexing(address()); }
	/** Returns the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
	public int shaderStorageBufferArrayDynamicIndexing() { return nshaderStorageBufferArrayDynamicIndexing(address()); }
	/** Returns the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
	public int shaderStorageImageArrayDynamicIndexing() { return nshaderStorageImageArrayDynamicIndexing(address()); }
	/** Returns the value of the {@code shaderClipDistance} field. */
	public int shaderClipDistance() { return nshaderClipDistance(address()); }
	/** Returns the value of the {@code shaderCullDistance} field. */
	public int shaderCullDistance() { return nshaderCullDistance(address()); }
	/** Returns the value of the {@code shaderFloat64} field. */
	public int shaderFloat64() { return nshaderFloat64(address()); }
	/** Returns the value of the {@code shaderInt64} field. */
	public int shaderInt64() { return nshaderInt64(address()); }
	/** Returns the value of the {@code shaderInt16} field. */
	public int shaderInt16() { return nshaderInt16(address()); }
	/** Returns the value of the {@code shaderResourceResidency} field. */
	public int shaderResourceResidency() { return nshaderResourceResidency(address()); }
	/** Returns the value of the {@code shaderResourceMinLod} field. */
	public int shaderResourceMinLod() { return nshaderResourceMinLod(address()); }
	/** Returns the value of the {@code sparseBinding} field. */
	public int sparseBinding() { return nsparseBinding(address()); }
	/** Returns the value of the {@code sparseResidencyBuffer} field. */
	public int sparseResidencyBuffer() { return nsparseResidencyBuffer(address()); }
	/** Returns the value of the {@code sparseResidencyImage2D} field. */
	public int sparseResidencyImage2D() { return nsparseResidencyImage2D(address()); }
	/** Returns the value of the {@code sparseResidencyImage3D} field. */
	public int sparseResidencyImage3D() { return nsparseResidencyImage3D(address()); }
	/** Returns the value of the {@code sparseResidency2Samples} field. */
	public int sparseResidency2Samples() { return nsparseResidency2Samples(address()); }
	/** Returns the value of the {@code sparseResidency4Samples} field. */
	public int sparseResidency4Samples() { return nsparseResidency4Samples(address()); }
	/** Returns the value of the {@code sparseResidency8Samples} field. */
	public int sparseResidency8Samples() { return nsparseResidency8Samples(address()); }
	/** Returns the value of the {@code sparseResidency16Samples} field. */
	public int sparseResidency16Samples() { return nsparseResidency16Samples(address()); }
	/** Returns the value of the {@code sparseResidencyAliased} field. */
	public int sparseResidencyAliased() { return nsparseResidencyAliased(address()); }
	/** Returns the value of the {@code variableMultisampleRate} field. */
	public int variableMultisampleRate() { return nvariableMultisampleRate(address()); }
	/** Returns the value of the {@code inheritedQueries} field. */
	public int inheritedQueries() { return ninheritedQueries(address()); }

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceFeatures malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceFeatures calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceFeatures create() {
		return new VkPhysicalDeviceFeatures(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceFeatures create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceFeatures(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceFeatures.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #robustBufferAccess}. */
	public static int nrobustBufferAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS); }
	/** Unsafe version of {@link #fullDrawIndexUint32}. */
	public static int nfullDrawIndexUint32(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32); }
	/** Unsafe version of {@link #imageCubeArray}. */
	public static int nimageCubeArray(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY); }
	/** Unsafe version of {@link #independentBlend}. */
	public static int nindependentBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND); }
	/** Unsafe version of {@link #geometryShader}. */
	public static int ngeometryShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER); }
	/** Unsafe version of {@link #tessellationShader}. */
	public static int ntessellationShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER); }
	/** Unsafe version of {@link #sampleRateShading}. */
	public static int nsampleRateShading(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING); }
	/** Unsafe version of {@link #dualSrcBlend}. */
	public static int ndualSrcBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND); }
	/** Unsafe version of {@link #logicOp}. */
	public static int nlogicOp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LOGICOP); }
	/** Unsafe version of {@link #multiDrawIndirect}. */
	public static int nmultiDrawIndirect(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT); }
	/** Unsafe version of {@link #drawIndirectFirstInstance}. */
	public static int ndrawIndirectFirstInstance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE); }
	/** Unsafe version of {@link #depthClamp}. */
	public static int ndepthClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP); }
	/** Unsafe version of {@link #depthBiasClamp}. */
	public static int ndepthBiasClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP); }
	/** Unsafe version of {@link #fillModeNonSolid}. */
	public static int nfillModeNonSolid(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID); }
	/** Unsafe version of {@link #depthBounds}. */
	public static int ndepthBounds(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS); }
	/** Unsafe version of {@link #wideLines}. */
	public static int nwideLines(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.WIDELINES); }
	/** Unsafe version of {@link #largePoints}. */
	public static int nlargePoints(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS); }
	/** Unsafe version of {@link #alphaToOne}. */
	public static int nalphaToOne(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE); }
	/** Unsafe version of {@link #multiViewport}. */
	public static int nmultiViewport(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT); }
	/** Unsafe version of {@link #samplerAnisotropy}. */
	public static int nsamplerAnisotropy(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY); }
	/** Unsafe version of {@link #textureCompressionETC2}. */
	public static int ntextureCompressionETC2(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2); }
	/** Unsafe version of {@link #textureCompressionASTC_LDR}. */
	public static int ntextureCompressionASTC_LDR(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR); }
	/** Unsafe version of {@link #textureCompressionBC}. */
	public static int ntextureCompressionBC(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC); }
	/** Unsafe version of {@link #occlusionQueryPrecise}. */
	public static int nocclusionQueryPrecise(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE); }
	/** Unsafe version of {@link #pipelineStatisticsQuery}. */
	public static int npipelineStatisticsQuery(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY); }
	/** Unsafe version of {@link #vertexPipelineStoresAndAtomics}. */
	public static int nvertexPipelineStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS); }
	/** Unsafe version of {@link #fragmentStoresAndAtomics}. */
	public static int nfragmentStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS); }
	/** Unsafe version of {@link #shaderTessellationAndGeometryPointSize}. */
	public static int nshaderTessellationAndGeometryPointSize(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE); }
	/** Unsafe version of {@link #shaderImageGatherExtended}. */
	public static int nshaderImageGatherExtended(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED); }
	/** Unsafe version of {@link #shaderStorageImageExtendedFormats}. */
	public static int nshaderStorageImageExtendedFormats(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS); }
	/** Unsafe version of {@link #shaderStorageImageMultisample}. */
	public static int nshaderStorageImageMultisample(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE); }
	/** Unsafe version of {@link #shaderStorageImageReadWithoutFormat}. */
	public static int nshaderStorageImageReadWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT); }
	/** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat}. */
	public static int nshaderStorageImageWriteWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT); }
	/** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing}. */
	public static int nshaderUniformBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING); }
	/** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing}. */
	public static int nshaderSampledImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING); }
	/** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing}. */
	public static int nshaderStorageBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING); }
	/** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing}. */
	public static int nshaderStorageImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING); }
	/** Unsafe version of {@link #shaderClipDistance}. */
	public static int nshaderClipDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE); }
	/** Unsafe version of {@link #shaderCullDistance}. */
	public static int nshaderCullDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE); }
	/** Unsafe version of {@link #shaderFloat64}. */
	public static int nshaderFloat64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64); }
	/** Unsafe version of {@link #shaderInt64}. */
	public static int nshaderInt64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT64); }
	/** Unsafe version of {@link #shaderInt16}. */
	public static int nshaderInt16(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT16); }
	/** Unsafe version of {@link #shaderResourceResidency}. */
	public static int nshaderResourceResidency(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY); }
	/** Unsafe version of {@link #shaderResourceMinLod}. */
	public static int nshaderResourceMinLod(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD); }
	/** Unsafe version of {@link #sparseBinding}. */
	public static int nsparseBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING); }
	/** Unsafe version of {@link #sparseResidencyBuffer}. */
	public static int nsparseResidencyBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER); }
	/** Unsafe version of {@link #sparseResidencyImage2D}. */
	public static int nsparseResidencyImage2D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D); }
	/** Unsafe version of {@link #sparseResidencyImage3D}. */
	public static int nsparseResidencyImage3D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D); }
	/** Unsafe version of {@link #sparseResidency2Samples}. */
	public static int nsparseResidency2Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES); }
	/** Unsafe version of {@link #sparseResidency4Samples}. */
	public static int nsparseResidency4Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES); }
	/** Unsafe version of {@link #sparseResidency8Samples}. */
	public static int nsparseResidency8Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES); }
	/** Unsafe version of {@link #sparseResidency16Samples}. */
	public static int nsparseResidency16Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES); }
	/** Unsafe version of {@link #sparseResidencyAliased}. */
	public static int nsparseResidencyAliased(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED); }
	/** Unsafe version of {@link #variableMultisampleRate}. */
	public static int nvariableMultisampleRate(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE); }
	/** Unsafe version of {@link #inheritedQueries}. */
	public static int ninheritedQueries(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceFeatures} structs. */
	public static final class Buffer extends StructBuffer<VkPhysicalDeviceFeatures, Buffer> {

		/**
		 * Creates a new {@link VkPhysicalDeviceFeatures.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceFeatures#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceFeatures newInstance(long address) {
			return new VkPhysicalDeviceFeatures(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code robustBufferAccess} field. */
		public int robustBufferAccess() { return VkPhysicalDeviceFeatures.nrobustBufferAccess(address()); }
		/** Returns the value of the {@code fullDrawIndexUint32} field. */
		public int fullDrawIndexUint32() { return VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address()); }
		/** Returns the value of the {@code imageCubeArray} field. */
		public int imageCubeArray() { return VkPhysicalDeviceFeatures.nimageCubeArray(address()); }
		/** Returns the value of the {@code independentBlend} field. */
		public int independentBlend() { return VkPhysicalDeviceFeatures.nindependentBlend(address()); }
		/** Returns the value of the {@code geometryShader} field. */
		public int geometryShader() { return VkPhysicalDeviceFeatures.ngeometryShader(address()); }
		/** Returns the value of the {@code tessellationShader} field. */
		public int tessellationShader() { return VkPhysicalDeviceFeatures.ntessellationShader(address()); }
		/** Returns the value of the {@code sampleRateShading} field. */
		public int sampleRateShading() { return VkPhysicalDeviceFeatures.nsampleRateShading(address()); }
		/** Returns the value of the {@code dualSrcBlend} field. */
		public int dualSrcBlend() { return VkPhysicalDeviceFeatures.ndualSrcBlend(address()); }
		/** Returns the value of the {@code logicOp} field. */
		public int logicOp() { return VkPhysicalDeviceFeatures.nlogicOp(address()); }
		/** Returns the value of the {@code multiDrawIndirect} field. */
		public int multiDrawIndirect() { return VkPhysicalDeviceFeatures.nmultiDrawIndirect(address()); }
		/** Returns the value of the {@code drawIndirectFirstInstance} field. */
		public int drawIndirectFirstInstance() { return VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address()); }
		/** Returns the value of the {@code depthClamp} field. */
		public int depthClamp() { return VkPhysicalDeviceFeatures.ndepthClamp(address()); }
		/** Returns the value of the {@code depthBiasClamp} field. */
		public int depthBiasClamp() { return VkPhysicalDeviceFeatures.ndepthBiasClamp(address()); }
		/** Returns the value of the {@code fillModeNonSolid} field. */
		public int fillModeNonSolid() { return VkPhysicalDeviceFeatures.nfillModeNonSolid(address()); }
		/** Returns the value of the {@code depthBounds} field. */
		public int depthBounds() { return VkPhysicalDeviceFeatures.ndepthBounds(address()); }
		/** Returns the value of the {@code wideLines} field. */
		public int wideLines() { return VkPhysicalDeviceFeatures.nwideLines(address()); }
		/** Returns the value of the {@code largePoints} field. */
		public int largePoints() { return VkPhysicalDeviceFeatures.nlargePoints(address()); }
		/** Returns the value of the {@code alphaToOne} field. */
		public int alphaToOne() { return VkPhysicalDeviceFeatures.nalphaToOne(address()); }
		/** Returns the value of the {@code multiViewport} field. */
		public int multiViewport() { return VkPhysicalDeviceFeatures.nmultiViewport(address()); }
		/** Returns the value of the {@code samplerAnisotropy} field. */
		public int samplerAnisotropy() { return VkPhysicalDeviceFeatures.nsamplerAnisotropy(address()); }
		/** Returns the value of the {@code textureCompressionETC2} field. */
		public int textureCompressionETC2() { return VkPhysicalDeviceFeatures.ntextureCompressionETC2(address()); }
		/** Returns the value of the {@code textureCompressionASTC_LDR} field. */
		public int textureCompressionASTC_LDR() { return VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address()); }
		/** Returns the value of the {@code textureCompressionBC} field. */
		public int textureCompressionBC() { return VkPhysicalDeviceFeatures.ntextureCompressionBC(address()); }
		/** Returns the value of the {@code occlusionQueryPrecise} field. */
		public int occlusionQueryPrecise() { return VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address()); }
		/** Returns the value of the {@code pipelineStatisticsQuery} field. */
		public int pipelineStatisticsQuery() { return VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address()); }
		/** Returns the value of the {@code vertexPipelineStoresAndAtomics} field. */
		public int vertexPipelineStoresAndAtomics() { return VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address()); }
		/** Returns the value of the {@code fragmentStoresAndAtomics} field. */
		public int fragmentStoresAndAtomics() { return VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address()); }
		/** Returns the value of the {@code shaderTessellationAndGeometryPointSize} field. */
		public int shaderTessellationAndGeometryPointSize() { return VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address()); }
		/** Returns the value of the {@code shaderImageGatherExtended} field. */
		public int shaderImageGatherExtended() { return VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address()); }
		/** Returns the value of the {@code shaderStorageImageExtendedFormats} field. */
		public int shaderStorageImageExtendedFormats() { return VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address()); }
		/** Returns the value of the {@code shaderStorageImageMultisample} field. */
		public int shaderStorageImageMultisample() { return VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address()); }
		/** Returns the value of the {@code shaderStorageImageReadWithoutFormat} field. */
		public int shaderStorageImageReadWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address()); }
		/** Returns the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
		public int shaderStorageImageWriteWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address()); }
		/** Returns the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
		public int shaderUniformBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address()); }
		/** Returns the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
		public int shaderSampledImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address()); }
		/** Returns the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
		public int shaderStorageBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address()); }
		/** Returns the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
		public int shaderStorageImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address()); }
		/** Returns the value of the {@code shaderClipDistance} field. */
		public int shaderClipDistance() { return VkPhysicalDeviceFeatures.nshaderClipDistance(address()); }
		/** Returns the value of the {@code shaderCullDistance} field. */
		public int shaderCullDistance() { return VkPhysicalDeviceFeatures.nshaderCullDistance(address()); }
		/** Returns the value of the {@code shaderFloat64} field. */
		public int shaderFloat64() { return VkPhysicalDeviceFeatures.nshaderFloat64(address()); }
		/** Returns the value of the {@code shaderInt64} field. */
		public int shaderInt64() { return VkPhysicalDeviceFeatures.nshaderInt64(address()); }
		/** Returns the value of the {@code shaderInt16} field. */
		public int shaderInt16() { return VkPhysicalDeviceFeatures.nshaderInt16(address()); }
		/** Returns the value of the {@code shaderResourceResidency} field. */
		public int shaderResourceResidency() { return VkPhysicalDeviceFeatures.nshaderResourceResidency(address()); }
		/** Returns the value of the {@code shaderResourceMinLod} field. */
		public int shaderResourceMinLod() { return VkPhysicalDeviceFeatures.nshaderResourceMinLod(address()); }
		/** Returns the value of the {@code sparseBinding} field. */
		public int sparseBinding() { return VkPhysicalDeviceFeatures.nsparseBinding(address()); }
		/** Returns the value of the {@code sparseResidencyBuffer} field. */
		public int sparseResidencyBuffer() { return VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address()); }
		/** Returns the value of the {@code sparseResidencyImage2D} field. */
		public int sparseResidencyImage2D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address()); }
		/** Returns the value of the {@code sparseResidencyImage3D} field. */
		public int sparseResidencyImage3D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address()); }
		/** Returns the value of the {@code sparseResidency2Samples} field. */
		public int sparseResidency2Samples() { return VkPhysicalDeviceFeatures.nsparseResidency2Samples(address()); }
		/** Returns the value of the {@code sparseResidency4Samples} field. */
		public int sparseResidency4Samples() { return VkPhysicalDeviceFeatures.nsparseResidency4Samples(address()); }
		/** Returns the value of the {@code sparseResidency8Samples} field. */
		public int sparseResidency8Samples() { return VkPhysicalDeviceFeatures.nsparseResidency8Samples(address()); }
		/** Returns the value of the {@code sparseResidency16Samples} field. */
		public int sparseResidency16Samples() { return VkPhysicalDeviceFeatures.nsparseResidency16Samples(address()); }
		/** Returns the value of the {@code sparseResidencyAliased} field. */
		public int sparseResidencyAliased() { return VkPhysicalDeviceFeatures.nsparseResidencyAliased(address()); }
		/** Returns the value of the {@code variableMultisampleRate} field. */
		public int variableMultisampleRate() { return VkPhysicalDeviceFeatures.nvariableMultisampleRate(address()); }
		/** Returns the value of the {@code inheritedQueries} field. */
		public int inheritedQueries() { return VkPhysicalDeviceFeatures.ninheritedQueries(address()); }

	}

}