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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPhysicalDeviceFeatures.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPhysicalDeviceFeatures">Vulkan Specification</a>
 * 
 * <p>Contains a feature flag for each of the fine-grained features that may be supported by an implementation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any member of this structure is {@link VK10#VK_FALSE FALSE}, as returned by {@link VK10#vkGetPhysicalDeviceFeatures GetPhysicalDeviceFeatures}, then it <b>must</b> be {@link VK10#VK_FALSE FALSE} when passed as part of the
 * {@link VkDeviceCreateInfo} struct when creating a device</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code robustBufferAccess} &ndash; indicates that out of bounds accesses to buffers via shader operations are well-defined</li>
 * <li>{@code fullDrawIndexUint32} &ndash; indicates the full 32-bit range of indices is supported for indexed draw calls when using a VkIndexType of {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}</li>
 * <li>{@code imageCubeArray} &ndash; 
 * indicates whether image views with a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} <b>can</b> be created, and that the corresponding
 * <b>SampledCubeArray</b> and <b>ImageCubeArray</b> SPIR-V capabilities <b>can</b> be used in shader code</li>
 * <li>{@code independentBlend} &ndash; indicates whether the {@link VkPipelineColorBlendAttachmentState} settings are controlled independently per-attachment</li>
 * <li>{@code geometryShader} &ndash; indicates whether geometry shaders are supported</li>
 * <li>{@code tessellationShader} &ndash; indicates whether tessellation control and evaluation shaders are supported</li>
 * <li>{@code sampleRateShading} &ndash; indicates whether per-sample shading and multisample interpolation are supported</li>
 * <li>{@code dualSrcBlend} &ndash; indicates whether blend operations which take two sources are supported</li>
 * <li>{@code logicOp} &ndash; indicates whether logic operations are supported</li>
 * <li>{@code multiDrawIndirect} &ndash; indicates whether multiple draw indirect is supported</li>
 * <li>{@code drawIndirectFirstInstance} &ndash; indicates whether indirect draw calls support the {@code firstInstance} parameter</li>
 * <li>{@code depthClamp} &ndash; indicates whether depth clamping is supported</li>
 * <li>{@code depthBiasClamp} &ndash; indicates whether depth bias clamping is supported</li>
 * <li>{@code fillModeNonSolid} &ndash; indicates whether point and wireframe fill modes are supported</li>
 * <li>{@code depthBounds} &ndash; indicates whether depth bounds tests are supported</li>
 * <li>{@code wideLines} &ndash; indicates whether lines with width other than 1.0 are supported</li>
 * <li>{@code largePoints} &ndash; indicates whether points with size greater than 1.0 are supported</li>
 * <li>{@code alphaToOne} &ndash; 
 * indicates whether the implementation is able to replace the alpha value of the color fragment output from the fragment shader with the maximum
 * representable alpha value for fixed-point colors or 1.0 for floating-point colors</li>
 * <li>{@code multiViewport} &ndash; indicates whether more than one viewport is supported</li>
 * <li>{@code samplerAnisotropy} &ndash; indicates whether anisotropic filtering is supported</li>
 * <li>{@code textureCompressionETC2} &ndash; indicates whether the ETC2 and EAC compressed texture formats are supported</li>
 * <li>{@code textureCompressionASTC_LDR} &ndash; indicates whether the ASTC LDR compressed texture formats are supported</li>
 * <li>{@code textureCompressionBC} &ndash; indicates whether the BC compressed texture formats are supported</li>
 * <li>{@code occlusionQueryPrecise} &ndash; indicates whether occlusion queries returning actual sample counts are supported</li>
 * <li>{@code pipelineStatisticsQuery} &ndash; indicates whether the pipeline statistics queries are supported</li>
 * <li>{@code vertexPipelineStoresAndAtomics} &ndash; indicates whether storage buffers and images support stores and atomic operations in the vertex, tessellation, and geometry shader stages</li>
 * <li>{@code fragmentStoresAndAtomics} &ndash; indicates whether storage buffers and images support stores and atomic operations in the fragment shader stage</li>
 * <li>{@code shaderTessellationAndGeometryPointSize} &ndash; 
 * indicates whether the {@code PointSize} built-in decoration is available in the tessellation control, tessellation evaluation, and geometry shader
 * stages</li>
 * <li>{@code shaderImageGatherExtended} &ndash; indicates whether the extended set of image gather instructions are available in shader code</li>
 * <li>{@code shaderStorageImageExtendedFormats} &ndash; indicates whether the extended storage image formats are available in shader code</li>
 * <li>{@code shaderStorageImageMultisample} &ndash; indicates whether multisampled storage images are supported</li>
 * <li>{@code shaderStorageImageReadWithoutFormat} &ndash; indicates whether storage images require a format qualifier to be specified when reading from storage images</li>
 * <li>{@code shaderStorageImageWriteWithoutFormat} &ndash; indicates whether storage images require a format qualifier to be specified when writing to storage images</li>
 * <li>{@code shaderUniformBufferArrayDynamicIndexing} &ndash; indicates whether arrays of uniform buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code</li>
 * <li>{@code shaderSampledImageArrayDynamicIndexing} &ndash; indicates whether arrays of samplers or sampled images <b>can</b> be indexed by dynamically uniform integer expressions in shader code</li>
 * <li>{@code shaderStorageBufferArrayDynamicIndexing} &ndash; indicates whether arrays of storage buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code</li>
 * <li>{@code shaderStorageImageArrayDynamicIndexing} &ndash; indicates whether arrays of storage images <b>can</b> be indexed by dynamically uniform integer expressions in shader code</li>
 * <li>{@code shaderClipDistance} &ndash; indicates whether clip distances are supported in shader code</li>
 * <li>{@code shaderCullDistance} &ndash; indicates whether cull distances are supported in shader code</li>
 * <li>{@code shaderFloat64} &ndash; indicates whether 64-bit floats (doubles) are supported in shader code</li>
 * <li>{@code shaderInt64} &ndash; indicates whether 64-bit integers (signed and unsigned) are supported in shader code</li>
 * <li>{@code shaderInt16} &ndash; indicates whether 16-bit integers (signed and unsigned) are supported in shader code</li>
 * <li>{@code shaderResourceResidency} &ndash; indicates whether image operations that return resource residency information are supported in shader code</li>
 * <li>{@code shaderResourceMinLod} &ndash; indicates whether image operations that specify the minimum resource level-of-detail (LOD) are supported in shader code</li>
 * <li>{@code sparseBinding} &ndash; indicates whether resource memory <b>can</b> be managed at opaque sparse block level instead of at the object level</li>
 * <li>{@code sparseResidencyBuffer} &ndash; indicates whether the device <b>can</b> access partially resident buffers</li>
 * <li>{@code sparseResidencyImage2D} &ndash; indicates whether the device <b>can</b> access partially resident 2D images with 1 sample per pixel</li>
 * <li>{@code sparseResidencyImage3D} &ndash; indicates whether the device <b>can</b> access partially resident 3D images</li>
 * <li>{@code sparseResidency2Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 2 samples per pixel</li>
 * <li>{@code sparseResidency4Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 4 samples per pixel</li>
 * <li>{@code sparseResidency8Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 8 samples per pixel</li>
 * <li>{@code sparseResidency16Samples} &ndash; indicates whether the physical device <b>can</b> access partially resident 2D images with 16 samples per pixel</li>
 * <li>{@code sparseResidencyAliased} &ndash; indicates whether the physical device <b>can</b> correctly access data aliased into multiple locations</li>
 * <li>{@code variableMultisampleRate} &ndash; 
 * indicates whether all pipelines that will be bound to a command buffer during a subpass with no attachments must have the same value for
 * {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples}</li>
 * <li>{@code inheritedQueries} &ndash; indicates whether a secondary command buffer may be executed while a query is active</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceFeatures {
    VkBool32 robustBufferAccess;
    VkBool32 fullDrawIndexUint32;
    VkBool32 imageCubeArray;
    VkBool32 independentBlend;
    VkBool32 geometryShader;
    VkBool32 tessellationShader;
    VkBool32 sampleRateShading;
    VkBool32 dualSrcBlend;
    VkBool32 logicOp;
    VkBool32 multiDrawIndirect;
    VkBool32 drawIndirectFirstInstance;
    VkBool32 depthClamp;
    VkBool32 depthBiasClamp;
    VkBool32 fillModeNonSolid;
    VkBool32 depthBounds;
    VkBool32 wideLines;
    VkBool32 largePoints;
    VkBool32 alphaToOne;
    VkBool32 multiViewport;
    VkBool32 samplerAnisotropy;
    VkBool32 textureCompressionETC2;
    VkBool32 textureCompressionASTC_LDR;
    VkBool32 textureCompressionBC;
    VkBool32 occlusionQueryPrecise;
    VkBool32 pipelineStatisticsQuery;
    VkBool32 vertexPipelineStoresAndAtomics;
    VkBool32 fragmentStoresAndAtomics;
    VkBool32 shaderTessellationAndGeometryPointSize;
    VkBool32 shaderImageGatherExtended;
    VkBool32 shaderStorageImageExtendedFormats;
    VkBool32 shaderStorageImageMultisample;
    VkBool32 shaderStorageImageReadWithoutFormat;
    VkBool32 shaderStorageImageWriteWithoutFormat;
    VkBool32 shaderUniformBufferArrayDynamicIndexing;
    VkBool32 shaderSampledImageArrayDynamicIndexing;
    VkBool32 shaderStorageBufferArrayDynamicIndexing;
    VkBool32 shaderStorageImageArrayDynamicIndexing;
    VkBool32 shaderClipDistance;
    VkBool32 shaderCullDistance;
    VkBool32 shaderFloat64;
    VkBool32 shaderInt64;
    VkBool32 shaderInt16;
    VkBool32 shaderResourceResidency;
    VkBool32 shaderResourceMinLod;
    VkBool32 sparseBinding;
    VkBool32 sparseResidencyBuffer;
    VkBool32 sparseResidencyImage2D;
    VkBool32 sparseResidencyImage3D;
    VkBool32 sparseResidency2Samples;
    VkBool32 sparseResidency4Samples;
    VkBool32 sparseResidency8Samples;
    VkBool32 sparseResidency16Samples;
    VkBool32 sparseResidencyAliased;
    VkBool32 variableMultisampleRate;
    VkBool32 inheritedQueries;
}</code></pre>
 */
public class VkPhysicalDeviceFeatures extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

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

	/** Sets the specified value to the {@code robustBufferAccess} field. */
	public VkPhysicalDeviceFeatures robustBufferAccess(int value) { nrobustBufferAccess(address(), value); return this; }
	/** Sets the specified value to the {@code fullDrawIndexUint32} field. */
	public VkPhysicalDeviceFeatures fullDrawIndexUint32(int value) { nfullDrawIndexUint32(address(), value); return this; }
	/** Sets the specified value to the {@code imageCubeArray} field. */
	public VkPhysicalDeviceFeatures imageCubeArray(int value) { nimageCubeArray(address(), value); return this; }
	/** Sets the specified value to the {@code independentBlend} field. */
	public VkPhysicalDeviceFeatures independentBlend(int value) { nindependentBlend(address(), value); return this; }
	/** Sets the specified value to the {@code geometryShader} field. */
	public VkPhysicalDeviceFeatures geometryShader(int value) { ngeometryShader(address(), value); return this; }
	/** Sets the specified value to the {@code tessellationShader} field. */
	public VkPhysicalDeviceFeatures tessellationShader(int value) { ntessellationShader(address(), value); return this; }
	/** Sets the specified value to the {@code sampleRateShading} field. */
	public VkPhysicalDeviceFeatures sampleRateShading(int value) { nsampleRateShading(address(), value); return this; }
	/** Sets the specified value to the {@code dualSrcBlend} field. */
	public VkPhysicalDeviceFeatures dualSrcBlend(int value) { ndualSrcBlend(address(), value); return this; }
	/** Sets the specified value to the {@code logicOp} field. */
	public VkPhysicalDeviceFeatures logicOp(int value) { nlogicOp(address(), value); return this; }
	/** Sets the specified value to the {@code multiDrawIndirect} field. */
	public VkPhysicalDeviceFeatures multiDrawIndirect(int value) { nmultiDrawIndirect(address(), value); return this; }
	/** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
	public VkPhysicalDeviceFeatures drawIndirectFirstInstance(int value) { ndrawIndirectFirstInstance(address(), value); return this; }
	/** Sets the specified value to the {@code depthClamp} field. */
	public VkPhysicalDeviceFeatures depthClamp(int value) { ndepthClamp(address(), value); return this; }
	/** Sets the specified value to the {@code depthBiasClamp} field. */
	public VkPhysicalDeviceFeatures depthBiasClamp(int value) { ndepthBiasClamp(address(), value); return this; }
	/** Sets the specified value to the {@code fillModeNonSolid} field. */
	public VkPhysicalDeviceFeatures fillModeNonSolid(int value) { nfillModeNonSolid(address(), value); return this; }
	/** Sets the specified value to the {@code depthBounds} field. */
	public VkPhysicalDeviceFeatures depthBounds(int value) { ndepthBounds(address(), value); return this; }
	/** Sets the specified value to the {@code wideLines} field. */
	public VkPhysicalDeviceFeatures wideLines(int value) { nwideLines(address(), value); return this; }
	/** Sets the specified value to the {@code largePoints} field. */
	public VkPhysicalDeviceFeatures largePoints(int value) { nlargePoints(address(), value); return this; }
	/** Sets the specified value to the {@code alphaToOne} field. */
	public VkPhysicalDeviceFeatures alphaToOne(int value) { nalphaToOne(address(), value); return this; }
	/** Sets the specified value to the {@code multiViewport} field. */
	public VkPhysicalDeviceFeatures multiViewport(int value) { nmultiViewport(address(), value); return this; }
	/** Sets the specified value to the {@code samplerAnisotropy} field. */
	public VkPhysicalDeviceFeatures samplerAnisotropy(int value) { nsamplerAnisotropy(address(), value); return this; }
	/** Sets the specified value to the {@code textureCompressionETC2} field. */
	public VkPhysicalDeviceFeatures textureCompressionETC2(int value) { ntextureCompressionETC2(address(), value); return this; }
	/** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
	public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(int value) { ntextureCompressionASTC_LDR(address(), value); return this; }
	/** Sets the specified value to the {@code textureCompressionBC} field. */
	public VkPhysicalDeviceFeatures textureCompressionBC(int value) { ntextureCompressionBC(address(), value); return this; }
	/** Sets the specified value to the {@code occlusionQueryPrecise} field. */
	public VkPhysicalDeviceFeatures occlusionQueryPrecise(int value) { nocclusionQueryPrecise(address(), value); return this; }
	/** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
	public VkPhysicalDeviceFeatures pipelineStatisticsQuery(int value) { npipelineStatisticsQuery(address(), value); return this; }
	/** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
	public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(int value) { nvertexPipelineStoresAndAtomics(address(), value); return this; }
	/** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
	public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(int value) { nfragmentStoresAndAtomics(address(), value); return this; }
	/** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
	public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(int value) { nshaderTessellationAndGeometryPointSize(address(), value); return this; }
	/** Sets the specified value to the {@code shaderImageGatherExtended} field. */
	public VkPhysicalDeviceFeatures shaderImageGatherExtended(int value) { nshaderImageGatherExtended(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
	public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(int value) { nshaderStorageImageExtendedFormats(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
	public VkPhysicalDeviceFeatures shaderStorageImageMultisample(int value) { nshaderStorageImageMultisample(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
	public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(int value) { nshaderStorageImageReadWithoutFormat(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
	public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(int value) { nshaderStorageImageWriteWithoutFormat(address(), value); return this; }
	/** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
	public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(int value) { nshaderUniformBufferArrayDynamicIndexing(address(), value); return this; }
	/** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
	public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(int value) { nshaderSampledImageArrayDynamicIndexing(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
	public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(int value) { nshaderStorageBufferArrayDynamicIndexing(address(), value); return this; }
	/** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
	public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(int value) { nshaderStorageImageArrayDynamicIndexing(address(), value); return this; }
	/** Sets the specified value to the {@code shaderClipDistance} field. */
	public VkPhysicalDeviceFeatures shaderClipDistance(int value) { nshaderClipDistance(address(), value); return this; }
	/** Sets the specified value to the {@code shaderCullDistance} field. */
	public VkPhysicalDeviceFeatures shaderCullDistance(int value) { nshaderCullDistance(address(), value); return this; }
	/** Sets the specified value to the {@code shaderFloat64} field. */
	public VkPhysicalDeviceFeatures shaderFloat64(int value) { nshaderFloat64(address(), value); return this; }
	/** Sets the specified value to the {@code shaderInt64} field. */
	public VkPhysicalDeviceFeatures shaderInt64(int value) { nshaderInt64(address(), value); return this; }
	/** Sets the specified value to the {@code shaderInt16} field. */
	public VkPhysicalDeviceFeatures shaderInt16(int value) { nshaderInt16(address(), value); return this; }
	/** Sets the specified value to the {@code shaderResourceResidency} field. */
	public VkPhysicalDeviceFeatures shaderResourceResidency(int value) { nshaderResourceResidency(address(), value); return this; }
	/** Sets the specified value to the {@code shaderResourceMinLod} field. */
	public VkPhysicalDeviceFeatures shaderResourceMinLod(int value) { nshaderResourceMinLod(address(), value); return this; }
	/** Sets the specified value to the {@code sparseBinding} field. */
	public VkPhysicalDeviceFeatures sparseBinding(int value) { nsparseBinding(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidencyBuffer} field. */
	public VkPhysicalDeviceFeatures sparseResidencyBuffer(int value) { nsparseResidencyBuffer(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidencyImage2D} field. */
	public VkPhysicalDeviceFeatures sparseResidencyImage2D(int value) { nsparseResidencyImage2D(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidencyImage3D} field. */
	public VkPhysicalDeviceFeatures sparseResidencyImage3D(int value) { nsparseResidencyImage3D(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidency2Samples} field. */
	public VkPhysicalDeviceFeatures sparseResidency2Samples(int value) { nsparseResidency2Samples(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidency4Samples} field. */
	public VkPhysicalDeviceFeatures sparseResidency4Samples(int value) { nsparseResidency4Samples(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidency8Samples} field. */
	public VkPhysicalDeviceFeatures sparseResidency8Samples(int value) { nsparseResidency8Samples(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidency16Samples} field. */
	public VkPhysicalDeviceFeatures sparseResidency16Samples(int value) { nsparseResidency16Samples(address(), value); return this; }
	/** Sets the specified value to the {@code sparseResidencyAliased} field. */
	public VkPhysicalDeviceFeatures sparseResidencyAliased(int value) { nsparseResidencyAliased(address(), value); return this; }
	/** Sets the specified value to the {@code variableMultisampleRate} field. */
	public VkPhysicalDeviceFeatures variableMultisampleRate(int value) { nvariableMultisampleRate(address(), value); return this; }
	/** Sets the specified value to the {@code inheritedQueries} field. */
	public VkPhysicalDeviceFeatures inheritedQueries(int value) { ninheritedQueries(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDeviceFeatures set(
		int robustBufferAccess,
		int fullDrawIndexUint32,
		int imageCubeArray,
		int independentBlend,
		int geometryShader,
		int tessellationShader,
		int sampleRateShading,
		int dualSrcBlend,
		int logicOp,
		int multiDrawIndirect,
		int drawIndirectFirstInstance,
		int depthClamp,
		int depthBiasClamp,
		int fillModeNonSolid,
		int depthBounds,
		int wideLines,
		int largePoints,
		int alphaToOne,
		int multiViewport,
		int samplerAnisotropy,
		int textureCompressionETC2,
		int textureCompressionASTC_LDR,
		int textureCompressionBC,
		int occlusionQueryPrecise,
		int pipelineStatisticsQuery,
		int vertexPipelineStoresAndAtomics,
		int fragmentStoresAndAtomics,
		int shaderTessellationAndGeometryPointSize,
		int shaderImageGatherExtended,
		int shaderStorageImageExtendedFormats,
		int shaderStorageImageMultisample,
		int shaderStorageImageReadWithoutFormat,
		int shaderStorageImageWriteWithoutFormat,
		int shaderUniformBufferArrayDynamicIndexing,
		int shaderSampledImageArrayDynamicIndexing,
		int shaderStorageBufferArrayDynamicIndexing,
		int shaderStorageImageArrayDynamicIndexing,
		int shaderClipDistance,
		int shaderCullDistance,
		int shaderFloat64,
		int shaderInt64,
		int shaderInt16,
		int shaderResourceResidency,
		int shaderResourceMinLod,
		int sparseBinding,
		int sparseResidencyBuffer,
		int sparseResidencyImage2D,
		int sparseResidencyImage3D,
		int sparseResidency2Samples,
		int sparseResidency4Samples,
		int sparseResidency8Samples,
		int sparseResidency16Samples,
		int sparseResidencyAliased,
		int variableMultisampleRate,
		int inheritedQueries
	) {
		robustBufferAccess(robustBufferAccess);
		fullDrawIndexUint32(fullDrawIndexUint32);
		imageCubeArray(imageCubeArray);
		independentBlend(independentBlend);
		geometryShader(geometryShader);
		tessellationShader(tessellationShader);
		sampleRateShading(sampleRateShading);
		dualSrcBlend(dualSrcBlend);
		logicOp(logicOp);
		multiDrawIndirect(multiDrawIndirect);
		drawIndirectFirstInstance(drawIndirectFirstInstance);
		depthClamp(depthClamp);
		depthBiasClamp(depthBiasClamp);
		fillModeNonSolid(fillModeNonSolid);
		depthBounds(depthBounds);
		wideLines(wideLines);
		largePoints(largePoints);
		alphaToOne(alphaToOne);
		multiViewport(multiViewport);
		samplerAnisotropy(samplerAnisotropy);
		textureCompressionETC2(textureCompressionETC2);
		textureCompressionASTC_LDR(textureCompressionASTC_LDR);
		textureCompressionBC(textureCompressionBC);
		occlusionQueryPrecise(occlusionQueryPrecise);
		pipelineStatisticsQuery(pipelineStatisticsQuery);
		vertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
		fragmentStoresAndAtomics(fragmentStoresAndAtomics);
		shaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
		shaderImageGatherExtended(shaderImageGatherExtended);
		shaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
		shaderStorageImageMultisample(shaderStorageImageMultisample);
		shaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
		shaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
		shaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
		shaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
		shaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
		shaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
		shaderClipDistance(shaderClipDistance);
		shaderCullDistance(shaderCullDistance);
		shaderFloat64(shaderFloat64);
		shaderInt64(shaderInt64);
		shaderInt16(shaderInt16);
		shaderResourceResidency(shaderResourceResidency);
		shaderResourceMinLod(shaderResourceMinLod);
		sparseBinding(sparseBinding);
		sparseResidencyBuffer(sparseResidencyBuffer);
		sparseResidencyImage2D(sparseResidencyImage2D);
		sparseResidencyImage3D(sparseResidencyImage3D);
		sparseResidency2Samples(sparseResidency2Samples);
		sparseResidency4Samples(sparseResidency4Samples);
		sparseResidency8Samples(sparseResidency8Samples);
		sparseResidency16Samples(sparseResidency16Samples);
		sparseResidencyAliased(sparseResidencyAliased);
		variableMultisampleRate(variableMultisampleRate);
		inheritedQueries(inheritedQueries);

		return this;
	}

	/** Unsafe version of {@link #set(VkPhysicalDeviceFeatures) set}. */
	public VkPhysicalDeviceFeatures nset(long struct) {
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
	public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceFeatures malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
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

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceFeatures mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceFeatures callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceFeatures mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceFeatures callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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

	/** Unsafe version of {@link #robustBufferAccess(int) robustBufferAccess}. */
	public static void nrobustBufferAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS, value); }
	/** Unsafe version of {@link #fullDrawIndexUint32(int) fullDrawIndexUint32}. */
	public static void nfullDrawIndexUint32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32, value); }
	/** Unsafe version of {@link #imageCubeArray(int) imageCubeArray}. */
	public static void nimageCubeArray(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY, value); }
	/** Unsafe version of {@link #independentBlend(int) independentBlend}. */
	public static void nindependentBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND, value); }
	/** Unsafe version of {@link #geometryShader(int) geometryShader}. */
	public static void ngeometryShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER, value); }
	/** Unsafe version of {@link #tessellationShader(int) tessellationShader}. */
	public static void ntessellationShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER, value); }
	/** Unsafe version of {@link #sampleRateShading(int) sampleRateShading}. */
	public static void nsampleRateShading(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING, value); }
	/** Unsafe version of {@link #dualSrcBlend(int) dualSrcBlend}. */
	public static void ndualSrcBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND, value); }
	/** Unsafe version of {@link #logicOp(int) logicOp}. */
	public static void nlogicOp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LOGICOP, value); }
	/** Unsafe version of {@link #multiDrawIndirect(int) multiDrawIndirect}. */
	public static void nmultiDrawIndirect(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT, value); }
	/** Unsafe version of {@link #drawIndirectFirstInstance(int) drawIndirectFirstInstance}. */
	public static void ndrawIndirectFirstInstance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE, value); }
	/** Unsafe version of {@link #depthClamp(int) depthClamp}. */
	public static void ndepthClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP, value); }
	/** Unsafe version of {@link #depthBiasClamp(int) depthBiasClamp}. */
	public static void ndepthBiasClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP, value); }
	/** Unsafe version of {@link #fillModeNonSolid(int) fillModeNonSolid}. */
	public static void nfillModeNonSolid(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID, value); }
	/** Unsafe version of {@link #depthBounds(int) depthBounds}. */
	public static void ndepthBounds(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS, value); }
	/** Unsafe version of {@link #wideLines(int) wideLines}. */
	public static void nwideLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.WIDELINES, value); }
	/** Unsafe version of {@link #largePoints(int) largePoints}. */
	public static void nlargePoints(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS, value); }
	/** Unsafe version of {@link #alphaToOne(int) alphaToOne}. */
	public static void nalphaToOne(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE, value); }
	/** Unsafe version of {@link #multiViewport(int) multiViewport}. */
	public static void nmultiViewport(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT, value); }
	/** Unsafe version of {@link #samplerAnisotropy(int) samplerAnisotropy}. */
	public static void nsamplerAnisotropy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY, value); }
	/** Unsafe version of {@link #textureCompressionETC2(int) textureCompressionETC2}. */
	public static void ntextureCompressionETC2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2, value); }
	/** Unsafe version of {@link #textureCompressionASTC_LDR(int) textureCompressionASTC_LDR}. */
	public static void ntextureCompressionASTC_LDR(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR, value); }
	/** Unsafe version of {@link #textureCompressionBC(int) textureCompressionBC}. */
	public static void ntextureCompressionBC(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC, value); }
	/** Unsafe version of {@link #occlusionQueryPrecise(int) occlusionQueryPrecise}. */
	public static void nocclusionQueryPrecise(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE, value); }
	/** Unsafe version of {@link #pipelineStatisticsQuery(int) pipelineStatisticsQuery}. */
	public static void npipelineStatisticsQuery(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY, value); }
	/** Unsafe version of {@link #vertexPipelineStoresAndAtomics(int) vertexPipelineStoresAndAtomics}. */
	public static void nvertexPipelineStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS, value); }
	/** Unsafe version of {@link #fragmentStoresAndAtomics(int) fragmentStoresAndAtomics}. */
	public static void nfragmentStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS, value); }
	/** Unsafe version of {@link #shaderTessellationAndGeometryPointSize(int) shaderTessellationAndGeometryPointSize}. */
	public static void nshaderTessellationAndGeometryPointSize(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, value); }
	/** Unsafe version of {@link #shaderImageGatherExtended(int) shaderImageGatherExtended}. */
	public static void nshaderImageGatherExtended(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED, value); }
	/** Unsafe version of {@link #shaderStorageImageExtendedFormats(int) shaderStorageImageExtendedFormats}. */
	public static void nshaderStorageImageExtendedFormats(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS, value); }
	/** Unsafe version of {@link #shaderStorageImageMultisample(int) shaderStorageImageMultisample}. */
	public static void nshaderStorageImageMultisample(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE, value); }
	/** Unsafe version of {@link #shaderStorageImageReadWithoutFormat(int) shaderStorageImageReadWithoutFormat}. */
	public static void nshaderStorageImageReadWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT, value); }
	/** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat(int) shaderStorageImageWriteWithoutFormat}. */
	public static void nshaderStorageImageWriteWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, value); }
	/** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing(int) shaderUniformBufferArrayDynamicIndexing}. */
	public static void nshaderUniformBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, value); }
	/** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing(int) shaderSampledImageArrayDynamicIndexing}. */
	public static void nshaderSampledImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, value); }
	/** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing(int) shaderStorageBufferArrayDynamicIndexing}. */
	public static void nshaderStorageBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, value); }
	/** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing(int) shaderStorageImageArrayDynamicIndexing}. */
	public static void nshaderStorageImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, value); }
	/** Unsafe version of {@link #shaderClipDistance(int) shaderClipDistance}. */
	public static void nshaderClipDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE, value); }
	/** Unsafe version of {@link #shaderCullDistance(int) shaderCullDistance}. */
	public static void nshaderCullDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE, value); }
	/** Unsafe version of {@link #shaderFloat64(int) shaderFloat64}. */
	public static void nshaderFloat64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64, value); }
	/** Unsafe version of {@link #shaderInt64(int) shaderInt64}. */
	public static void nshaderInt64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT64, value); }
	/** Unsafe version of {@link #shaderInt16(int) shaderInt16}. */
	public static void nshaderInt16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT16, value); }
	/** Unsafe version of {@link #shaderResourceResidency(int) shaderResourceResidency}. */
	public static void nshaderResourceResidency(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY, value); }
	/** Unsafe version of {@link #shaderResourceMinLod(int) shaderResourceMinLod}. */
	public static void nshaderResourceMinLod(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD, value); }
	/** Unsafe version of {@link #sparseBinding(int) sparseBinding}. */
	public static void nsparseBinding(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING, value); }
	/** Unsafe version of {@link #sparseResidencyBuffer(int) sparseResidencyBuffer}. */
	public static void nsparseResidencyBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER, value); }
	/** Unsafe version of {@link #sparseResidencyImage2D(int) sparseResidencyImage2D}. */
	public static void nsparseResidencyImage2D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D, value); }
	/** Unsafe version of {@link #sparseResidencyImage3D(int) sparseResidencyImage3D}. */
	public static void nsparseResidencyImage3D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D, value); }
	/** Unsafe version of {@link #sparseResidency2Samples(int) sparseResidency2Samples}. */
	public static void nsparseResidency2Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES, value); }
	/** Unsafe version of {@link #sparseResidency4Samples(int) sparseResidency4Samples}. */
	public static void nsparseResidency4Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES, value); }
	/** Unsafe version of {@link #sparseResidency8Samples(int) sparseResidency8Samples}. */
	public static void nsparseResidency8Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES, value); }
	/** Unsafe version of {@link #sparseResidency16Samples(int) sparseResidency16Samples}. */
	public static void nsparseResidency16Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES, value); }
	/** Unsafe version of {@link #sparseResidencyAliased(int) sparseResidencyAliased}. */
	public static void nsparseResidencyAliased(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED, value); }
	/** Unsafe version of {@link #variableMultisampleRate(int) variableMultisampleRate}. */
	public static void nvariableMultisampleRate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE, value); }
	/** Unsafe version of {@link #inheritedQueries(int) inheritedQueries}. */
	public static void ninheritedQueries(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES, value); }

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
			return new VkPhysicalDeviceFeatures(address, getContainer());
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

		/** Sets the specified value to the {@code robustBufferAccess} field. */
		public VkPhysicalDeviceFeatures.Buffer robustBufferAccess(int value) { VkPhysicalDeviceFeatures.nrobustBufferAccess(address(), value); return this; }
		/** Sets the specified value to the {@code fullDrawIndexUint32} field. */
		public VkPhysicalDeviceFeatures.Buffer fullDrawIndexUint32(int value) { VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address(), value); return this; }
		/** Sets the specified value to the {@code imageCubeArray} field. */
		public VkPhysicalDeviceFeatures.Buffer imageCubeArray(int value) { VkPhysicalDeviceFeatures.nimageCubeArray(address(), value); return this; }
		/** Sets the specified value to the {@code independentBlend} field. */
		public VkPhysicalDeviceFeatures.Buffer independentBlend(int value) { VkPhysicalDeviceFeatures.nindependentBlend(address(), value); return this; }
		/** Sets the specified value to the {@code geometryShader} field. */
		public VkPhysicalDeviceFeatures.Buffer geometryShader(int value) { VkPhysicalDeviceFeatures.ngeometryShader(address(), value); return this; }
		/** Sets the specified value to the {@code tessellationShader} field. */
		public VkPhysicalDeviceFeatures.Buffer tessellationShader(int value) { VkPhysicalDeviceFeatures.ntessellationShader(address(), value); return this; }
		/** Sets the specified value to the {@code sampleRateShading} field. */
		public VkPhysicalDeviceFeatures.Buffer sampleRateShading(int value) { VkPhysicalDeviceFeatures.nsampleRateShading(address(), value); return this; }
		/** Sets the specified value to the {@code dualSrcBlend} field. */
		public VkPhysicalDeviceFeatures.Buffer dualSrcBlend(int value) { VkPhysicalDeviceFeatures.ndualSrcBlend(address(), value); return this; }
		/** Sets the specified value to the {@code logicOp} field. */
		public VkPhysicalDeviceFeatures.Buffer logicOp(int value) { VkPhysicalDeviceFeatures.nlogicOp(address(), value); return this; }
		/** Sets the specified value to the {@code multiDrawIndirect} field. */
		public VkPhysicalDeviceFeatures.Buffer multiDrawIndirect(int value) { VkPhysicalDeviceFeatures.nmultiDrawIndirect(address(), value); return this; }
		/** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
		public VkPhysicalDeviceFeatures.Buffer drawIndirectFirstInstance(int value) { VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address(), value); return this; }
		/** Sets the specified value to the {@code depthClamp} field. */
		public VkPhysicalDeviceFeatures.Buffer depthClamp(int value) { VkPhysicalDeviceFeatures.ndepthClamp(address(), value); return this; }
		/** Sets the specified value to the {@code depthBiasClamp} field. */
		public VkPhysicalDeviceFeatures.Buffer depthBiasClamp(int value) { VkPhysicalDeviceFeatures.ndepthBiasClamp(address(), value); return this; }
		/** Sets the specified value to the {@code fillModeNonSolid} field. */
		public VkPhysicalDeviceFeatures.Buffer fillModeNonSolid(int value) { VkPhysicalDeviceFeatures.nfillModeNonSolid(address(), value); return this; }
		/** Sets the specified value to the {@code depthBounds} field. */
		public VkPhysicalDeviceFeatures.Buffer depthBounds(int value) { VkPhysicalDeviceFeatures.ndepthBounds(address(), value); return this; }
		/** Sets the specified value to the {@code wideLines} field. */
		public VkPhysicalDeviceFeatures.Buffer wideLines(int value) { VkPhysicalDeviceFeatures.nwideLines(address(), value); return this; }
		/** Sets the specified value to the {@code largePoints} field. */
		public VkPhysicalDeviceFeatures.Buffer largePoints(int value) { VkPhysicalDeviceFeatures.nlargePoints(address(), value); return this; }
		/** Sets the specified value to the {@code alphaToOne} field. */
		public VkPhysicalDeviceFeatures.Buffer alphaToOne(int value) { VkPhysicalDeviceFeatures.nalphaToOne(address(), value); return this; }
		/** Sets the specified value to the {@code multiViewport} field. */
		public VkPhysicalDeviceFeatures.Buffer multiViewport(int value) { VkPhysicalDeviceFeatures.nmultiViewport(address(), value); return this; }
		/** Sets the specified value to the {@code samplerAnisotropy} field. */
		public VkPhysicalDeviceFeatures.Buffer samplerAnisotropy(int value) { VkPhysicalDeviceFeatures.nsamplerAnisotropy(address(), value); return this; }
		/** Sets the specified value to the {@code textureCompressionETC2} field. */
		public VkPhysicalDeviceFeatures.Buffer textureCompressionETC2(int value) { VkPhysicalDeviceFeatures.ntextureCompressionETC2(address(), value); return this; }
		/** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
		public VkPhysicalDeviceFeatures.Buffer textureCompressionASTC_LDR(int value) { VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address(), value); return this; }
		/** Sets the specified value to the {@code textureCompressionBC} field. */
		public VkPhysicalDeviceFeatures.Buffer textureCompressionBC(int value) { VkPhysicalDeviceFeatures.ntextureCompressionBC(address(), value); return this; }
		/** Sets the specified value to the {@code occlusionQueryPrecise} field. */
		public VkPhysicalDeviceFeatures.Buffer occlusionQueryPrecise(int value) { VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
		public VkPhysicalDeviceFeatures.Buffer pipelineStatisticsQuery(int value) { VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address(), value); return this; }
		/** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
		public VkPhysicalDeviceFeatures.Buffer vertexPipelineStoresAndAtomics(int value) { VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address(), value); return this; }
		/** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
		public VkPhysicalDeviceFeatures.Buffer fragmentStoresAndAtomics(int value) { VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address(), value); return this; }
		/** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderTessellationAndGeometryPointSize(int value) { VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address(), value); return this; }
		/** Sets the specified value to the {@code shaderImageGatherExtended} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderImageGatherExtended(int value) { VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageImageExtendedFormats(int value) { VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageImageMultisample(int value) { VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageImageReadWithoutFormat(int value) { VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageImageWriteWithoutFormat(int value) { VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address(), value); return this; }
		/** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderUniformBufferArrayDynamicIndexing(int value) { VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address(), value); return this; }
		/** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderSampledImageArrayDynamicIndexing(int value) { VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageBufferArrayDynamicIndexing(int value) { VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address(), value); return this; }
		/** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderStorageImageArrayDynamicIndexing(int value) { VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address(), value); return this; }
		/** Sets the specified value to the {@code shaderClipDistance} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderClipDistance(int value) { VkPhysicalDeviceFeatures.nshaderClipDistance(address(), value); return this; }
		/** Sets the specified value to the {@code shaderCullDistance} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderCullDistance(int value) { VkPhysicalDeviceFeatures.nshaderCullDistance(address(), value); return this; }
		/** Sets the specified value to the {@code shaderFloat64} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderFloat64(int value) { VkPhysicalDeviceFeatures.nshaderFloat64(address(), value); return this; }
		/** Sets the specified value to the {@code shaderInt64} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderInt64(int value) { VkPhysicalDeviceFeatures.nshaderInt64(address(), value); return this; }
		/** Sets the specified value to the {@code shaderInt16} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderInt16(int value) { VkPhysicalDeviceFeatures.nshaderInt16(address(), value); return this; }
		/** Sets the specified value to the {@code shaderResourceResidency} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderResourceResidency(int value) { VkPhysicalDeviceFeatures.nshaderResourceResidency(address(), value); return this; }
		/** Sets the specified value to the {@code shaderResourceMinLod} field. */
		public VkPhysicalDeviceFeatures.Buffer shaderResourceMinLod(int value) { VkPhysicalDeviceFeatures.nshaderResourceMinLod(address(), value); return this; }
		/** Sets the specified value to the {@code sparseBinding} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseBinding(int value) { VkPhysicalDeviceFeatures.nsparseBinding(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidencyBuffer} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidencyBuffer(int value) { VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidencyImage2D} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage2D(int value) { VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidencyImage3D} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage3D(int value) { VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidency2Samples} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidency2Samples(int value) { VkPhysicalDeviceFeatures.nsparseResidency2Samples(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidency4Samples} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidency4Samples(int value) { VkPhysicalDeviceFeatures.nsparseResidency4Samples(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidency8Samples} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidency8Samples(int value) { VkPhysicalDeviceFeatures.nsparseResidency8Samples(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidency16Samples} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidency16Samples(int value) { VkPhysicalDeviceFeatures.nsparseResidency16Samples(address(), value); return this; }
		/** Sets the specified value to the {@code sparseResidencyAliased} field. */
		public VkPhysicalDeviceFeatures.Buffer sparseResidencyAliased(int value) { VkPhysicalDeviceFeatures.nsparseResidencyAliased(address(), value); return this; }
		/** Sets the specified value to the {@code variableMultisampleRate} field. */
		public VkPhysicalDeviceFeatures.Buffer variableMultisampleRate(int value) { VkPhysicalDeviceFeatures.nvariableMultisampleRate(address(), value); return this; }
		/** Sets the specified value to the {@code inheritedQueries} field. */
		public VkPhysicalDeviceFeatures.Buffer inheritedQueries(int value) { VkPhysicalDeviceFeatures.ninheritedQueries(address(), value); return this; }

	}

}