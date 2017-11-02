/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a target="_blank" href="https://facebook.github.io/yoga/">Yoga</a>.
 * 
 * <p>Yoga is an open-source, cross-platform layout library that implements Flexbox. Yoga’s focus is on creating an expressive layout library, not
 * implementing all of CSS. Therefore, there are no plans to include support for tables, floats, or similar CSS concepts. Yoga also does not support
 * styling properties that have no impact on layout, such as color or background properties.</p>
 * 
 * <h3>Yoga vs Flexbox</h3>
 * 
 * <p>Yoga aims to be compatible with Flexbox according to the w3 specification. However, Yoga was not developed to strictly adhere to the specification;
 * thus, there are aspects where Yoga differs.</p>
 * 
 * <h3>Default values</h3>
 * 
 * <p>Yoga has chosen to change the default values of some properties to better fit mobile layout use cases. The following CSS block describes the
 * differences in default values from the Flexbox w3 specification:</p>
 * 
 * <code><pre>
 * div {
 *   box-sizing: border-box;
 *   position: relative;
 * 
 *   display: flex;
 *   flex-direction: column;
 *   align-items: stretch;
 *   flex-shrink: 0;
 *   align-content: flex-start;
 * 
 *   border-width: 0px;
 *   margin: 0px;
 *   padding: 0px;
 *   min-width: 0px;
 * }</pre></code>
 * 
 * <h3>Right-to-Left</h3>
 * 
 * <p>We believe that Right-to-Left (RTL) should be a first class citizen when it comes to layout. Therefore, Yoga implements non-standard RTL support for
 * margin, padding, border, and position properties. This enables specifying these properties as start instead of left and end instead of right.</p>
 * 
 * <h3>Yoga-specific properties</h3>
 * 
 * <p>The goal of Yoga is to be a library which makes layout easy. Of course, implementing Flexbox, a common and well-liked system, helps meet this goal.
 * However, there are areas where we think Yoga can evolve beyond Flexbox and provide developers with tools not included in the Flexbox w3 specification.
 * Currently Yoga has added one such property, AspectRatio, to solve a common problem we saw in many UIs.</p>
 */
public class Yoga {

    public static final float YGUndefined = Float.NaN;

    /**
     * YGAlign
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGAlignAuto AlignAuto}</li>
     * <li>{@link #YGAlignFlexStart AlignFlexStart}</li>
     * <li>{@link #YGAlignCenter AlignCenter}</li>
     * <li>{@link #YGAlignFlexEnd AlignFlexEnd}</li>
     * <li>{@link #YGAlignStretch AlignStretch}</li>
     * <li>{@link #YGAlignBaseline AlignBaseline}</li>
     * <li>{@link #YGAlignSpaceBetween AlignSpaceBetween}</li>
     * <li>{@link #YGAlignSpaceAround AlignSpaceAround}</li>
     * </ul>
     */
    public static final int
        YGAlignAuto         = 0,
        YGAlignFlexStart    = 1,
        YGAlignCenter       = 2,
        YGAlignFlexEnd      = 3,
        YGAlignStretch      = 4,
        YGAlignBaseline     = 5,
        YGAlignSpaceBetween = 6,
        YGAlignSpaceAround  = 7;

    /**
     * YGDimension
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDimensionWidth DimensionWidth}</li>
     * <li>{@link #YGDimensionHeight DimensionHeight}</li>
     * </ul>
     */
    public static final int
        YGDimensionWidth  = 0,
        YGDimensionHeight = 1;

    /**
     * YGDirection
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDirectionInherit DirectionInherit}</li>
     * <li>{@link #YGDirectionLTR DirectionLTR}</li>
     * <li>{@link #YGDirectionRTL DirectionRTL}</li>
     * </ul>
     */
    public static final int
        YGDirectionInherit = 0,
        YGDirectionLTR     = 1,
        YGDirectionRTL     = 2;

    /**
     * YGDisplay
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDisplayFlex DisplayFlex}</li>
     * <li>{@link #YGDisplayNone DisplayNone}</li>
     * </ul>
     */
    public static final int
        YGDisplayFlex = 0,
        YGDisplayNone = 1;

    /**
     * YGEdge
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGEdgeLeft EdgeLeft}</li>
     * <li>{@link #YGEdgeTop EdgeTop}</li>
     * <li>{@link #YGEdgeRight EdgeRight}</li>
     * <li>{@link #YGEdgeBottom EdgeBottom}</li>
     * <li>{@link #YGEdgeStart EdgeStart}</li>
     * <li>{@link #YGEdgeEnd EdgeEnd}</li>
     * <li>{@link #YGEdgeHorizontal EdgeHorizontal}</li>
     * <li>{@link #YGEdgeVertical EdgeVertical}</li>
     * <li>{@link #YGEdgeAll EdgeAll}</li>
     * </ul>
     */
    public static final int
        YGEdgeLeft       = 0,
        YGEdgeTop        = 1,
        YGEdgeRight      = 2,
        YGEdgeBottom     = 3,
        YGEdgeStart      = 4,
        YGEdgeEnd        = 5,
        YGEdgeHorizontal = 6,
        YGEdgeVertical   = 7,
        YGEdgeAll        = 8;

    /** YGExperimentalFeature */
    public static final int YGExperimentalFeatureWebFlexBasis = 0;

    /**
     * YGFlexDirection
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGFlexDirectionColumn FlexDirectionColumn}</li>
     * <li>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</li>
     * <li>{@link #YGFlexDirectionRow FlexDirectionRow}</li>
     * <li>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</li>
     * </ul>
     */
    public static final int
        YGFlexDirectionColumn        = 0,
        YGFlexDirectionColumnReverse = 1,
        YGFlexDirectionRow           = 2,
        YGFlexDirectionRowReverse    = 3;

    /**
     * YGJustify
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGJustifyFlexStart JustifyFlexStart}</li>
     * <li>{@link #YGJustifyCenter JustifyCenter}</li>
     * <li>{@link #YGJustifyFlexEnd JustifyFlexEnd}</li>
     * <li>{@link #YGJustifySpaceBetween JustifySpaceBetween}</li>
     * <li>{@link #YGJustifySpaceAround JustifySpaceAround}</li>
     * </ul>
     */
    public static final int
        YGJustifyFlexStart    = 0,
        YGJustifyCenter       = 1,
        YGJustifyFlexEnd      = 2,
        YGJustifySpaceBetween = 3,
        YGJustifySpaceAround  = 4;

    /**
     * YGLogLevel
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGLogLevelError LogLevelError}</li>
     * <li>{@link #YGLogLevelWarn LogLevelWarn}</li>
     * <li>{@link #YGLogLevelInfo LogLevelInfo}</li>
     * <li>{@link #YGLogLevelDebug LogLevelDebug}</li>
     * <li>{@link #YGLogLevelVerbose LogLevelVerbose}</li>
     * <li>{@link #YGLogLevelFatal LogLevelFatal}</li>
     * </ul>
     */
    public static final int
        YGLogLevelError   = 0,
        YGLogLevelWarn    = 1,
        YGLogLevelInfo    = 2,
        YGLogLevelDebug   = 3,
        YGLogLevelVerbose = 4,
        YGLogLevelFatal   = 5;

    /**
     * YGMeasureMode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGMeasureModeUndefined MeasureModeUndefined}</li>
     * <li>{@link #YGMeasureModeExactly MeasureModeExactly}</li>
     * <li>{@link #YGMeasureModeAtMost MeasureModeAtMost}</li>
     * </ul>
     */
    public static final int
        YGMeasureModeUndefined = 0,
        YGMeasureModeExactly   = 1,
        YGMeasureModeAtMost    = 2;

    /**
     * YGNodeType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGNodeTypeDefault NodeTypeDefault}</li>
     * <li>{@link #YGNodeTypeText NodeTypeText}</li>
     * </ul>
     */
    public static final int
        YGNodeTypeDefault = 0,
        YGNodeTypeText    = 1;

    /**
     * YGOverflow
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGOverflowVisible OverflowVisible}</li>
     * <li>{@link #YGOverflowHidden OverflowHidden}</li>
     * <li>{@link #YGOverflowScroll OverflowScroll}</li>
     * </ul>
     */
    public static final int
        YGOverflowVisible = 0,
        YGOverflowHidden  = 1,
        YGOverflowScroll  = 2;

    /**
     * YGPositionType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGPositionTypeRelative PositionTypeRelative}</li>
     * <li>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</li>
     * </ul>
     */
    public static final int
        YGPositionTypeRelative = 0,
        YGPositionTypeAbsolute = 1;

    /**
     * YGPrintOptions
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGPrintOptionsLayout PrintOptionsLayout}</li>
     * <li>{@link #YGPrintOptionsStyle PrintOptionsStyle}</li>
     * <li>{@link #YGPrintOptionsChildren PrintOptionsChildren}</li>
     * </ul>
     */
    public static final int
        YGPrintOptionsLayout   = 1,
        YGPrintOptionsStyle    = 2,
        YGPrintOptionsChildren = 4;

    /**
     * YGUnit
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGUnitUndefined UnitUndefined}</li>
     * <li>{@link #YGUnitPoint UnitPoint}</li>
     * <li>{@link #YGUnitPercent UnitPercent}</li>
     * <li>{@link #YGUnitAuto UnitAuto}</li>
     * </ul>
     */
    public static final int
        YGUnitUndefined = 0,
        YGUnitPoint     = 1,
        YGUnitPercent   = 2,
        YGUnitAuto      = 3;

    /**
     * YGWrap
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGWrapNoWrap WrapNoWrap}</li>
     * <li>{@link #YGWrapWrap WrapWrap}</li>
     * <li>{@link #YGWrapReverse WrapReverse}</li>
     * </ul>
     */
    public static final int
        YGWrapNoWrap  = 0,
        YGWrapWrap    = 1,
        YGWrapReverse = 2;

    static { Library.loadSystem(System::load, System::loadLibrary, Yoga.class, Platform.mapLibraryNameBundled("lwjgl_yoga")); }

    protected Yoga() {
        throw new UnsupportedOperationException();
    }

    // --- [ YGNodeNew ] ---

    @NativeType("YGNodeRef")
    public static native long YGNodeNew();

    // --- [ YGNodeNewWithConfig ] ---

    public static native long nYGNodeNewWithConfig(long config);

    @NativeType("YGNodeRef")
    public static long YGNodeNewWithConfig(@NativeType("const YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGNodeNewWithConfig(config);
    }

    // --- [ YGNodeClone ] ---

    public static native long nYGNodeClone(long node);

    @NativeType("YGNodeRef")
    public static long YGNodeClone(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeClone(node);
    }

    // --- [ YGNodeFree ] ---

    public static native void nYGNodeFree(long node);

    public static void YGNodeFree(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFree(node);
    }

    // --- [ YGNodeFreeRecursive ] ---

    public static native void nYGNodeFreeRecursive(long node);

    public static void YGNodeFreeRecursive(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFreeRecursive(node);
    }

    // --- [ YGNodeReset ] ---

    public static native void nYGNodeReset(long node);

    public static void YGNodeReset(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeReset(node);
    }

    // --- [ YGNodeGetInstanceCount ] ---

    @NativeType("int32_t")
    public static native int YGNodeGetInstanceCount();

    // --- [ YGNodeInsertChild ] ---

    public static native void nYGNodeInsertChild(long node, long child, int index);

    public static void YGNodeInsertChild(@NativeType("const YGNodeRef") long node, @NativeType("const YGNodeRef") long child, @NativeType("uint32_t") int index) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeInsertChild(node, child, index);
    }

    // --- [ YGNodeRemoveChild ] ---

    public static native void nYGNodeRemoveChild(long node, long child);

    public static void YGNodeRemoveChild(@NativeType("const YGNodeRef") long node, @NativeType("const YGNodeRef") long child) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeRemoveChild(node, child);
    }

    // --- [ YGNodeRemoveAllChildren ] ---

    public static native void nYGNodeRemoveAllChildren(long node);

    public static void YGNodeRemoveAllChildren(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeRemoveAllChildren(node);
    }

    // --- [ YGNodeGetChild ] ---

    public static native long nYGNodeGetChild(long node, int index);

    @NativeType("YGNodeRef")
    public static long YGNodeGetChild(@NativeType("const YGNodeRef") long node, @NativeType("uint32_t") int index) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChild(node, index);
    }

    // --- [ YGNodeGetParent ] ---

    public static native long nYGNodeGetParent(long node);

    @NativeType("YGNodeRef")
    public static long YGNodeGetParent(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetParent(node);
    }

    // --- [ YGNodeGetChildCount ] ---

    public static native int nYGNodeGetChildCount(long node);

    @NativeType("uint32_t")
    public static int YGNodeGetChildCount(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChildCount(node);
    }

    // --- [ YGNodeCalculateLayout ] ---

    /** Unsafe version of: {@link #YGNodeCalculateLayout NodeCalculateLayout} */
    public static native void nYGNodeCalculateLayout(long node, float availableWidth, float availableHeight, int parentDirection);

    /**
     * @param node            
     * @param availableWidth  
     * @param availableHeight 
     * @param parentDirection one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table>
     */
    public static void YGNodeCalculateLayout(@NativeType("const YGNodeRef") long node, float availableWidth, float availableHeight, @NativeType("YGDirection") int parentDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeCalculateLayout(node, availableWidth, availableHeight, parentDirection);
    }

    // --- [ YGNodeMarkDirty ] ---

    /** Unsafe version of: {@link #YGNodeMarkDirty NodeMarkDirty} */
    public static native void nYGNodeMarkDirty(long node);

    /**
     * Marks a node as dirty.
     * 
     * <p>Only valid for nodes with a custom measure function set. YG knows when to mark all other nodes as dirty but because nodes with measure functions
     * depends on information not known to YG they must perform this dirty marking manually.</p>
     *
     * @param node 
     */
    public static void YGNodeMarkDirty(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeMarkDirty(node);
    }

    // --- [ YGNodeIsDirty ] ---

    public static native boolean nYGNodeIsDirty(long node);

    @NativeType("bool")
    public static boolean YGNodeIsDirty(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeIsDirty(node);
    }

    // --- [ YGNodePrint ] ---

    /** Unsafe version of: {@link #YGNodePrint NodePrint} */
    public static native void nYGNodePrint(long node, int options);

    /**
     * @param node    
     * @param options one of:<br><table><tr><td>{@link #YGPrintOptionsLayout PrintOptionsLayout}</td><td>{@link #YGPrintOptionsStyle PrintOptionsStyle}</td><td>{@link #YGPrintOptionsChildren PrintOptionsChildren}</td></tr></table>
     */
    public static void YGNodePrint(@NativeType("const YGNodeRef") long node, @NativeType("YGPrintOptions") int options) {
        if (CHECKS) {
            check(node);
        }
        nYGNodePrint(node, options);
    }

    // --- [ YGFloatIsUndefined ] ---

    @NativeType("bool")
    public static native boolean YGFloatIsUndefined(float value);

    // --- [ YGNodeCanUseCachedMeasurement ] ---

    /** Unsafe version of: {@link #YGNodeCanUseCachedMeasurement NodeCanUseCachedMeasurement} */
    public static native boolean nYGNodeCanUseCachedMeasurement(int widthMode, float width, int heightMode, float height, int lastWidthMode, float lastWidth, int lastHeightMode, float lastHeight, float lastComputedWidth, float lastComputedHeight, float marginRow, float marginColumn, long config);

    /**
     * @param widthMode          one of:<br><table><tr><td>{@link #YGMeasureModeUndefined MeasureModeUndefined}</td><td>{@link #YGMeasureModeExactly MeasureModeExactly}</td><td>{@link #YGMeasureModeAtMost MeasureModeAtMost}</td></tr></table>
     * @param width              
     * @param heightMode         
     * @param height             
     * @param lastWidthMode      
     * @param lastWidth          
     * @param lastHeightMode     
     * @param lastHeight         
     * @param lastComputedWidth  
     * @param lastComputedHeight 
     * @param marginRow          
     * @param marginColumn       
     * @param config             
     */
    @NativeType("bool")
    public static boolean YGNodeCanUseCachedMeasurement(@NativeType("YGMeasureMode") int widthMode, float width, @NativeType("YGMeasureMode") int heightMode, float height, @NativeType("YGMeasureMode") int lastWidthMode, float lastWidth, @NativeType("YGMeasureMode") int lastHeightMode, float lastHeight, float lastComputedWidth, float lastComputedHeight, float marginRow, float marginColumn, @NativeType("const YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGNodeCanUseCachedMeasurement(widthMode, width, heightMode, height, lastWidthMode, lastWidth, lastHeightMode, lastHeight, lastComputedWidth, lastComputedHeight, marginRow, marginColumn, config);
    }

    // --- [ YGNodeCopyStyle ] ---

    public static native void nYGNodeCopyStyle(long dstNode, long srcNode);

    public static void YGNodeCopyStyle(@NativeType("const YGNodeRef") long dstNode, @NativeType("const YGNodeRef") long srcNode) {
        if (CHECKS) {
            check(dstNode);
            check(srcNode);
        }
        nYGNodeCopyStyle(dstNode, srcNode);
    }

    // --- [ YGNodeSetContext ] ---

    public static native void nYGNodeSetContext(long node, long context);

    public static void YGNodeSetContext(@NativeType("const YGNodeRef") long node, @NativeType("void *") long context) {
        if (CHECKS) {
            check(node);
            check(context);
        }
        nYGNodeSetContext(node, context);
    }

    // --- [ YGNodeGetContext ] ---

    public static native long nYGNodeGetContext(long node);

    @NativeType("void *")
    public static long YGNodeGetContext(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetContext(node);
    }

    // --- [ YGNodeSetMeasureFunc ] ---

    public static native void nYGNodeSetMeasureFunc(long node, long measureFunc);

    public static void YGNodeSetMeasureFunc(@NativeType("const YGNodeRef") long node, @NativeType("YGMeasureFunc") YGMeasureFuncI measureFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetMeasureFunc(node, measureFunc.address());
    }

    // --- [ YGNodeGetMeasureFunc ] ---

    public static native long nYGNodeGetMeasureFunc(long node);

    public static YGMeasureFunc YGNodeGetMeasureFunc(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return YGMeasureFunc.create(nYGNodeGetMeasureFunc(node));
    }

    // --- [ YGNodeSetBaselineFunc ] ---

    public static native void nYGNodeSetBaselineFunc(long node, long baselineFunc);

    public static void YGNodeSetBaselineFunc(@NativeType("const YGNodeRef") long node, @NativeType("YGBaselineFunc") YGBaselineFuncI baselineFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetBaselineFunc(node, baselineFunc.address());
    }

    // --- [ YGNodeGetBaselineFunc ] ---

    public static native long nYGNodeGetBaselineFunc(long node);

    public static YGBaselineFunc YGNodeGetBaselineFunc(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return YGBaselineFunc.create(nYGNodeGetBaselineFunc(node));
    }

    // --- [ YGNodeSetPrintFunc ] ---

    public static native void nYGNodeSetPrintFunc(long node, long printFunc);

    public static void YGNodeSetPrintFunc(@NativeType("const YGNodeRef") long node, @NativeType("YGPrintFunc") YGPrintFuncI printFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetPrintFunc(node, printFunc.address());
    }

    // --- [ YGNodeGetPrintFunc ] ---

    public static native long nYGNodeGetPrintFunc(long node);

    public static YGPrintFunc YGNodeGetPrintFunc(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return YGPrintFunc.create(nYGNodeGetPrintFunc(node));
    }

    // --- [ YGNodeSetHasNewLayout ] ---

    public static native void nYGNodeSetHasNewLayout(long node, boolean hasNewLayout);

    public static void YGNodeSetHasNewLayout(@NativeType("const YGNodeRef") long node, @NativeType("bool") boolean hasNewLayout) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetHasNewLayout(node, hasNewLayout);
    }

    // --- [ YGNodeGetHasNewLayout ] ---

    public static native boolean nYGNodeGetHasNewLayout(long node);

    @NativeType("bool")
    public static boolean YGNodeGetHasNewLayout(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetHasNewLayout(node);
    }

    // --- [ YGNodeSetNodeType ] ---

    public static native void nYGNodeSetNodeType(long node, int nodeType);

    public static void YGNodeSetNodeType(@NativeType("const YGNodeRef") long node, @NativeType("YGNodeType") int nodeType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetNodeType(node, nodeType);
    }

    // --- [ YGNodeGetNodeType ] ---

    public static native int nYGNodeGetNodeType(long node);

    @NativeType("YGNodeType")
    public static int YGNodeGetNodeType(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetNodeType(node);
    }

    // --- [ YGNodeStyleSetDirection ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetDirection NodeStyleSetDirection} */
    public static native void nYGNodeStyleSetDirection(long node, int direction);

    /**
     * @param node      
     * @param direction one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table>
     */
    public static void YGNodeStyleSetDirection(@NativeType("const YGNodeRef") long node, @NativeType("YGDirection") int direction) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDirection(node, direction);
    }

    // --- [ YGNodeStyleGetDirection ] ---

    public static native int nYGNodeStyleGetDirection(long node);

    @NativeType("YGDirection")
    public static int YGNodeStyleGetDirection(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDirection(node);
    }

    // --- [ YGNodeStyleSetFlexDirection ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetFlexDirection NodeStyleSetFlexDirection} */
    public static native void nYGNodeStyleSetFlexDirection(long node, int flexDirection);

    /**
     * @param node          
     * @param flexDirection one of:<br><table><tr><td>{@link #YGFlexDirectionColumn FlexDirectionColumn}</td><td>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</td><td>{@link #YGFlexDirectionRow FlexDirectionRow}</td></tr><tr><td>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</td></tr></table>
     */
    public static void YGNodeStyleSetFlexDirection(@NativeType("const YGNodeRef") long node, @NativeType("YGFlexDirection") int flexDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexDirection(node, flexDirection);
    }

    // --- [ YGNodeStyleGetFlexDirection ] ---

    public static native int nYGNodeStyleGetFlexDirection(long node);

    @NativeType("YGFlexDirection")
    public static int YGNodeStyleGetFlexDirection(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexDirection(node);
    }

    // --- [ YGNodeStyleSetJustifyContent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetJustifyContent NodeStyleSetJustifyContent} */
    public static native void nYGNodeStyleSetJustifyContent(long node, int justifyContent);

    /**
     * @param node           
     * @param justifyContent one of:<br><table><tr><td>{@link #YGJustifyFlexStart JustifyFlexStart}</td><td>{@link #YGJustifyCenter JustifyCenter}</td><td>{@link #YGJustifyFlexEnd JustifyFlexEnd}</td><td>{@link #YGJustifySpaceBetween JustifySpaceBetween}</td><td>{@link #YGJustifySpaceAround JustifySpaceAround}</td></tr></table>
     */
    public static void YGNodeStyleSetJustifyContent(@NativeType("const YGNodeRef") long node, @NativeType("YGJustify") int justifyContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetJustifyContent(node, justifyContent);
    }

    // --- [ YGNodeStyleGetJustifyContent ] ---

    public static native int nYGNodeStyleGetJustifyContent(long node);

    @NativeType("YGJustify")
    public static int YGNodeStyleGetJustifyContent(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetJustifyContent(node);
    }

    // --- [ YGNodeStyleSetAlignContent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignContent NodeStyleSetAlignContent} */
    public static native void nYGNodeStyleSetAlignContent(long node, int alignContent);

    /**
     * @param node         
     * @param alignContent one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
     */
    public static void YGNodeStyleSetAlignContent(@NativeType("const YGNodeRef") long node, @NativeType("YGAlign") int alignContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignContent(node, alignContent);
    }

    // --- [ YGNodeStyleGetAlignContent ] ---

    public static native int nYGNodeStyleGetAlignContent(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignContent(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignContent(node);
    }

    // --- [ YGNodeStyleSetAlignItems ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignItems NodeStyleSetAlignItems} */
    public static native void nYGNodeStyleSetAlignItems(long node, int alignItems);

    /**
     * @param node       
     * @param alignItems one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
     */
    public static void YGNodeStyleSetAlignItems(@NativeType("const YGNodeRef") long node, @NativeType("YGAlign") int alignItems) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignItems(node, alignItems);
    }

    // --- [ YGNodeStyleGetAlignItems ] ---

    public static native int nYGNodeStyleGetAlignItems(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignItems(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignItems(node);
    }

    // --- [ YGNodeStyleSetAlignSelf ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignSelf NodeStyleSetAlignSelf} */
    public static native void nYGNodeStyleSetAlignSelf(long node, int alignSelf);

    /**
     * @param node      
     * @param alignSelf one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
     */
    public static void YGNodeStyleSetAlignSelf(@NativeType("const YGNodeRef") long node, @NativeType("YGAlign") int alignSelf) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignSelf(node, alignSelf);
    }

    // --- [ YGNodeStyleGetAlignSelf ] ---

    public static native int nYGNodeStyleGetAlignSelf(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignSelf(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignSelf(node);
    }

    // --- [ YGNodeStyleSetPositionType ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPositionType NodeStyleSetPositionType} */
    public static native void nYGNodeStyleSetPositionType(long node, int positionType);

    /**
     * @param node         
     * @param positionType one of:<br><table><tr><td>{@link #YGPositionTypeRelative PositionTypeRelative}</td><td>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</td></tr></table>
     */
    public static void YGNodeStyleSetPositionType(@NativeType("const YGNodeRef") long node, @NativeType("YGPositionType") int positionType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionType(node, positionType);
    }

    // --- [ YGNodeStyleGetPositionType ] ---

    public static native int nYGNodeStyleGetPositionType(long node);

    @NativeType("YGPositionType")
    public static int YGNodeStyleGetPositionType(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetPositionType(node);
    }

    // --- [ YGNodeStyleSetFlexWrap ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetFlexWrap NodeStyleSetFlexWrap} */
    public static native void nYGNodeStyleSetFlexWrap(long node, int flexWrap);

    /**
     * @param node     
     * @param flexWrap one of:<br><table><tr><td>{@link #YGWrapNoWrap WrapNoWrap}</td><td>{@link #YGWrapWrap WrapWrap}</td><td>{@link #YGWrapReverse WrapReverse}</td></tr></table>
     */
    public static void YGNodeStyleSetFlexWrap(@NativeType("const YGNodeRef") long node, @NativeType("YGWrap") int flexWrap) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexWrap(node, flexWrap);
    }

    // --- [ YGNodeStyleGetFlexWrap ] ---

    public static native int nYGNodeStyleGetFlexWrap(long node);

    @NativeType("YGWrap")
    public static int YGNodeStyleGetFlexWrap(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexWrap(node);
    }

    // --- [ YGNodeStyleSetOverflow ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetOverflow NodeStyleSetOverflow} */
    public static native void nYGNodeStyleSetOverflow(long node, int overflow);

    /**
     * @param node     
     * @param overflow one of:<br><table><tr><td>{@link #YGOverflowVisible OverflowVisible}</td><td>{@link #YGOverflowHidden OverflowHidden}</td><td>{@link #YGOverflowScroll OverflowScroll}</td></tr></table>
     */
    public static void YGNodeStyleSetOverflow(@NativeType("const YGNodeRef") long node, @NativeType("YGOverflow") int overflow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetOverflow(node, overflow);
    }

    // --- [ YGNodeStyleGetOverflow ] ---

    public static native int nYGNodeStyleGetOverflow(long node);

    @NativeType("YGOverflow")
    public static int YGNodeStyleGetOverflow(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetOverflow(node);
    }

    // --- [ YGNodeStyleSetDisplay ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetDisplay NodeStyleSetDisplay} */
    public static native void nYGNodeStyleSetDisplay(long node, int display);

    /**
     * @param node    
     * @param display one of:<br><table><tr><td>{@link #YGDisplayFlex DisplayFlex}</td><td>{@link #YGDisplayNone DisplayNone}</td></tr></table>
     */
    public static void YGNodeStyleSetDisplay(@NativeType("const YGNodeRef") long node, @NativeType("YGDisplay") int display) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDisplay(node, display);
    }

    // --- [ YGNodeStyleGetDisplay ] ---

    public static native int nYGNodeStyleGetDisplay(long node);

    @NativeType("YGDisplay")
    public static int YGNodeStyleGetDisplay(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDisplay(node);
    }

    // --- [ YGNodeStyleSetFlex ] ---

    public static native void nYGNodeStyleSetFlex(long node, float flex);

    public static void YGNodeStyleSetFlex(@NativeType("const YGNodeRef") long node, float flex) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlex(node, flex);
    }

    // --- [ YGNodeStyleGetFlex ] ---

    public static native float nYGNodeStyleGetFlex(long node);

    public static float YGNodeStyleGetFlex(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlex(node);
    }

    // --- [ YGNodeStyleSetFlexGrow ] ---

    public static native void nYGNodeStyleSetFlexGrow(long node, float flexGrow);

    public static void YGNodeStyleSetFlexGrow(@NativeType("const YGNodeRef") long node, float flexGrow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexGrow(node, flexGrow);
    }

    // --- [ YGNodeStyleGetFlexGrow ] ---

    public static native float nYGNodeStyleGetFlexGrow(long node);

    public static float YGNodeStyleGetFlexGrow(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexGrow(node);
    }

    // --- [ YGNodeStyleSetFlexShrink ] ---

    public static native void nYGNodeStyleSetFlexShrink(long node, float flexShrink);

    public static void YGNodeStyleSetFlexShrink(@NativeType("const YGNodeRef") long node, float flexShrink) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexShrink(node, flexShrink);
    }

    // --- [ YGNodeStyleGetFlexShrink ] ---

    public static native float nYGNodeStyleGetFlexShrink(long node);

    public static float YGNodeStyleGetFlexShrink(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexShrink(node);
    }

    // --- [ YGNodeStyleSetFlexBasis ] ---

    public static native void nYGNodeStyleSetFlexBasis(long node, float flexBasis);

    public static void YGNodeStyleSetFlexBasis(@NativeType("const YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasis(node, flexBasis);
    }

    // --- [ YGNodeStyleSetFlexBasisPercent ] ---

    public static native void nYGNodeStyleSetFlexBasisPercent(long node, float flexBasis);

    public static void YGNodeStyleSetFlexBasisPercent(@NativeType("const YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisPercent(node, flexBasis);
    }

    // --- [ YGNodeStyleGetFlexBasis ] ---

    public static native void nYGNodeStyleGetFlexBasis(long node, long __result);

    public static YGValue YGNodeStyleGetFlexBasis(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetFlexBasis(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetFlexBasisAuto ] ---

    public static native void nYGNodeStyleSetFlexBasisAuto(long node);

    public static void YGNodeStyleSetFlexBasisAuto(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisAuto(node);
    }

    // --- [ YGNodeStyleSetPosition ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPosition NodeStyleSetPosition} */
    public static native void nYGNodeStyleSetPosition(long node, int edge, float position);

    /**
     * @param node     
     * @param edge     one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param position 
     */
    public static void YGNodeStyleSetPosition(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPosition(node, edge, position);
    }

    // --- [ YGNodeStyleSetPositionPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPositionPercent NodeStyleSetPositionPercent} */
    public static native void nYGNodeStyleSetPositionPercent(long node, int edge, float position);

    /**
     * @param node     
     * @param edge     one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param position 
     */
    public static void YGNodeStyleSetPositionPercent(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionPercent(node, edge, position);
    }

    // --- [ YGNodeStyleGetPosition ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetPosition NodeStyleGetPosition} */
    public static native void nYGNodeStyleGetPosition(long node, int edge, long __result);

    /**
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static YGValue YGNodeStyleGetPosition(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPosition(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMargin ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMargin NodeStyleSetMargin} */
    public static native void nYGNodeStyleSetMargin(long node, int edge, float margin);

    /**
     * @param node   
     * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param margin 
     */
    public static void YGNodeStyleSetMargin(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMargin(node, edge, margin);
    }

    // --- [ YGNodeStyleSetMarginPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMarginPercent NodeStyleSetMarginPercent} */
    public static native void nYGNodeStyleSetMarginPercent(long node, int edge, float margin);

    /**
     * @param node   
     * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param margin 
     */
    public static void YGNodeStyleSetMarginPercent(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginPercent(node, edge, margin);
    }

    // --- [ YGNodeStyleGetMargin ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetMargin NodeStyleGetMargin} */
    public static native void nYGNodeStyleGetMargin(long node, int edge, long __result);

    /**
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static YGValue YGNodeStyleGetMargin(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMargin(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMarginAuto ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMarginAuto NodeStyleSetMarginAuto} */
    public static native void nYGNodeStyleSetMarginAuto(long node, int edge);

    /**
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static void YGNodeStyleSetMarginAuto(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginAuto(node, edge);
    }

    // --- [ YGNodeStyleSetPadding ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPadding NodeStyleSetPadding} */
    public static native void nYGNodeStyleSetPadding(long node, int edge, float padding);

    /**
     * @param node    
     * @param edge    one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param padding 
     */
    public static void YGNodeStyleSetPadding(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPadding(node, edge, padding);
    }

    // --- [ YGNodeStyleSetPaddingPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPaddingPercent NodeStyleSetPaddingPercent} */
    public static native void nYGNodeStyleSetPaddingPercent(long node, int edge, float padding);

    /**
     * @param node    
     * @param edge    one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param padding 
     */
    public static void YGNodeStyleSetPaddingPercent(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPaddingPercent(node, edge, padding);
    }

    // --- [ YGNodeStyleGetPadding ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetPadding NodeStyleGetPadding} */
    public static native void nYGNodeStyleGetPadding(long node, int edge, long __result);

    /**
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static YGValue YGNodeStyleGetPadding(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPadding(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetBorder ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetBorder NodeStyleSetBorder} */
    public static native void nYGNodeStyleSetBorder(long node, int edge, float border);

    /**
     * @param node   
     * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     * @param border 
     */
    public static void YGNodeStyleSetBorder(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge, float border) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetBorder(node, edge, border);
    }

    // --- [ YGNodeStyleGetBorder ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetBorder NodeStyleGetBorder} */
    public static native float nYGNodeStyleGetBorder(long node, int edge);

    /**
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeStyleGetBorder(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetBorder(node, edge);
    }

    // --- [ YGNodeStyleSetWidth ] ---

    public static native void nYGNodeStyleSetWidth(long node, float width);

    public static void YGNodeStyleSetWidth(@NativeType("const YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidth(node, width);
    }

    // --- [ YGNodeStyleSetWidthPercent ] ---

    public static native void nYGNodeStyleSetWidthPercent(long node, float width);

    public static void YGNodeStyleSetWidthPercent(@NativeType("const YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthPercent(node, width);
    }

    // --- [ YGNodeStyleGetWidth ] ---

    public static native void nYGNodeStyleGetWidth(long node, long __result);

    public static YGValue YGNodeStyleGetWidth(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetWidthAuto ] ---

    public static native void nYGNodeStyleSetWidthAuto(long node);

    public static void YGNodeStyleSetWidthAuto(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthAuto(node);
    }

    // --- [ YGNodeStyleSetHeight ] ---

    public static native void nYGNodeStyleSetHeight(long node, float height);

    public static void YGNodeStyleSetHeight(@NativeType("const YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeight(node, height);
    }

    // --- [ YGNodeStyleSetHeightPercent ] ---

    public static native void nYGNodeStyleSetHeightPercent(long node, float height);

    public static void YGNodeStyleSetHeightPercent(@NativeType("const YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightPercent(node, height);
    }

    // --- [ YGNodeStyleGetHeight ] ---

    public static native void nYGNodeStyleGetHeight(long node, long __result);

    public static YGValue YGNodeStyleGetHeight(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetHeightAuto ] ---

    public static native void nYGNodeStyleSetHeightAuto(long node);

    public static void YGNodeStyleSetHeightAuto(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightAuto(node);
    }

    // --- [ YGNodeStyleSetMinWidth ] ---

    public static native void nYGNodeStyleSetMinWidth(long node, float minWidth);

    public static void YGNodeStyleSetMinWidth(@NativeType("const YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidth(node, minWidth);
    }

    // --- [ YGNodeStyleSetMinWidthPercent ] ---

    public static native void nYGNodeStyleSetMinWidthPercent(long node, float minWidth);

    public static void YGNodeStyleSetMinWidthPercent(@NativeType("const YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidthPercent(node, minWidth);
    }

    // --- [ YGNodeStyleGetMinWidth ] ---

    public static native void nYGNodeStyleGetMinWidth(long node, long __result);

    public static YGValue YGNodeStyleGetMinWidth(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMinHeight ] ---

    public static native void nYGNodeStyleSetMinHeight(long node, float minHeight);

    public static void YGNodeStyleSetMinHeight(@NativeType("const YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeight(node, minHeight);
    }

    // --- [ YGNodeStyleSetMinHeightPercent ] ---

    public static native void nYGNodeStyleSetMinHeightPercent(long node, float minHeight);

    public static void YGNodeStyleSetMinHeightPercent(@NativeType("const YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeightPercent(node, minHeight);
    }

    // --- [ YGNodeStyleGetMinHeight ] ---

    public static native void nYGNodeStyleGetMinHeight(long node, long __result);

    public static YGValue YGNodeStyleGetMinHeight(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxWidth ] ---

    public static native void nYGNodeStyleSetMaxWidth(long node, float maxWidth);

    public static void YGNodeStyleSetMaxWidth(@NativeType("const YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidth(node, maxWidth);
    }

    // --- [ YGNodeStyleSetMaxWidthPercent ] ---

    public static native void nYGNodeStyleSetMaxWidthPercent(long node, float maxWidth);

    public static void YGNodeStyleSetMaxWidthPercent(@NativeType("const YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidthPercent(node, maxWidth);
    }

    // --- [ YGNodeStyleGetMaxWidth ] ---

    public static native void nYGNodeStyleGetMaxWidth(long node, long __result);

    public static YGValue YGNodeStyleGetMaxWidth(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxHeight ] ---

    public static native void nYGNodeStyleSetMaxHeight(long node, float maxHeight);

    public static void YGNodeStyleSetMaxHeight(@NativeType("const YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeight(node, maxHeight);
    }

    // --- [ YGNodeStyleSetMaxHeightPercent ] ---

    public static native void nYGNodeStyleSetMaxHeightPercent(long node, float maxHeight);

    public static void YGNodeStyleSetMaxHeightPercent(@NativeType("const YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeightPercent(node, maxHeight);
    }

    // --- [ YGNodeStyleGetMaxHeight ] ---

    public static native void nYGNodeStyleGetMaxHeight(long node, long __result);

    public static YGValue YGNodeStyleGetMaxHeight(@NativeType("const YGNodeRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetAspectRatio ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAspectRatio NodeStyleSetAspectRatio} */
    public static native void nYGNodeStyleSetAspectRatio(long node, float aspectRatio);

    /**
     * Aspect ratio controls the size of the undefined dimension of a node.
     * 
     * <p>Aspect ratio is encoded as a floating point value width/height. e.g. A value of 2 leads to a node with a width twice the size of its height while a
     * value of 0.5 gives the opposite effect.</p>
     * 
     * <ul>
     * <li>On a node with a set width/height aspect ratio controls the size of the unset dimension</li>
     * <li>On a node with a set flex basis aspect ratio controls the size of the node in the cross axis if unset</li>
     * <li>On a node with a measure function aspect ratio works as though the measure function measures the flex basis</li>
     * <li>On a node with flex grow/shrink aspect ratio controls the size of the node in the cross axis if unset</li>
     * <li>Aspect ratio takes min/max dimensions into account</li>
     * </ul>
     *
     * @param node        
     * @param aspectRatio 
     */
    public static void YGNodeStyleSetAspectRatio(@NativeType("const YGNodeRef") long node, float aspectRatio) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAspectRatio(node, aspectRatio);
    }

    // --- [ YGNodeStyleGetAspectRatio ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetAspectRatio NodeStyleGetAspectRatio} */
    public static native float nYGNodeStyleGetAspectRatio(long node);

    /**
     * Aspect ratio controls the size of the undefined dimension of a node.
     * 
     * <p>Aspect ratio is encoded as a floating point value width/height. e.g. A value of 2 leads to a node with a width twice the size of its height while a
     * value of 0.5 gives the opposite effect.</p>
     * 
     * <ul>
     * <li>On a node with a set width/height aspect ratio controls the size of the unset dimension</li>
     * <li>On a node with a set flex basis aspect ratio controls the size of the node in the cross axis if unset</li>
     * <li>On a node with a measure function aspect ratio works as though the measure function measures the flex basis</li>
     * <li>On a node with flex grow/shrink aspect ratio controls the size of the node in the cross axis if unset</li>
     * <li>Aspect ratio takes min/max dimensions into account</li>
     * </ul>
     *
     * @param node 
     */
    public static float YGNodeStyleGetAspectRatio(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAspectRatio(node);
    }

    // --- [ YGNodeLayoutGetLeft ] ---

    public static native float nYGNodeLayoutGetLeft(long node);

    public static float YGNodeLayoutGetLeft(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetLeft(node);
    }

    // --- [ YGNodeLayoutGetTop ] ---

    public static native float nYGNodeLayoutGetTop(long node);

    public static float YGNodeLayoutGetTop(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetTop(node);
    }

    // --- [ YGNodeLayoutGetRight ] ---

    public static native float nYGNodeLayoutGetRight(long node);

    public static float YGNodeLayoutGetRight(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetRight(node);
    }

    // --- [ YGNodeLayoutGetBottom ] ---

    public static native float nYGNodeLayoutGetBottom(long node);

    public static float YGNodeLayoutGetBottom(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBottom(node);
    }

    // --- [ YGNodeLayoutGetWidth ] ---

    public static native float nYGNodeLayoutGetWidth(long node);

    public static float YGNodeLayoutGetWidth(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetWidth(node);
    }

    // --- [ YGNodeLayoutGetHeight ] ---

    public static native float nYGNodeLayoutGetHeight(long node);

    public static float YGNodeLayoutGetHeight(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHeight(node);
    }

    // --- [ YGNodeLayoutGetDirection ] ---

    public static native int nYGNodeLayoutGetDirection(long node);

    @NativeType("YGDirection")
    public static int YGNodeLayoutGetDirection(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetDirection(node);
    }

    // --- [ YGNodeLayoutGetHadOverflow ] ---

    public static native boolean nYGNodeLayoutGetHadOverflow(long node);

    @NativeType("bool")
    public static boolean YGNodeLayoutGetHadOverflow(@NativeType("const YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHadOverflow(node);
    }

    // --- [ YGNodeLayoutGetMargin ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetMargin NodeLayoutGetMargin} */
    public static native float nYGNodeLayoutGetMargin(long node, int edge);

    /**
     * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
     * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
     *
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetMargin(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetMargin(node, edge);
    }

    // --- [ YGNodeLayoutGetBorder ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetBorder NodeLayoutGetBorder} */
    public static native float nYGNodeLayoutGetBorder(long node, int edge);

    /**
     * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
     * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
     *
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetBorder(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBorder(node, edge);
    }

    // --- [ YGNodeLayoutGetPadding ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetPadding NodeLayoutGetPadding} */
    public static native float nYGNodeLayoutGetPadding(long node, int edge);

    /**
     * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
     * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
     *
     * @param node 
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetPadding(@NativeType("const YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetPadding(node, edge);
    }

    // --- [ YGConfigSetLogger ] ---

    public static native void nYGConfigSetLogger(long config, long logger);

    public static void YGConfigSetLogger(@NativeType("const YGConfigRef") long config, @NativeType("YGLogger") YGLoggerI logger) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetLogger(config, logger.address());
    }

    // --- [ YGLog ] ---

    /** Unsafe version of: {@link #YGLog Log} */
    public static native void nYGLog(long node, int level, long message);

    /**
     * @param node    
     * @param level   one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td><td>{@link #YGLogLevelFatal LogLevelFatal}</td></tr></table>
     * @param message 
     */
    public static void YGLog(@NativeType("const YGNodeRef") long node, @NativeType("YGLogLevel") int level, @NativeType("const char *") ByteBuffer message) {
        if (CHECKS) {
            check(node);
            checkNT1(message);
        }
        nYGLog(node, level, memAddress(message));
    }

    /**
     * @param node    
     * @param level   one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td><td>{@link #YGLogLevelFatal LogLevelFatal}</td></tr></table>
     * @param message 
     */
    public static void YGLog(@NativeType("const YGNodeRef") long node, @NativeType("YGLogLevel") int level, @NativeType("const char *") CharSequence message) {
        if (CHECKS) {
            check(node);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer messageEncoded = stack.UTF8(message);
            nYGLog(node, level, memAddress(messageEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ YGLogWithConfig ] ---

    public static native void nYGLogWithConfig(long config, int level, long message);

    public static void YGLogWithConfig(@NativeType("const YGConfigRef") long config, @NativeType("YGLogLevel") int level, @NativeType("const char *") ByteBuffer message) {
        if (CHECKS) {
            check(config);
            checkNT1(message);
        }
        nYGLogWithConfig(config, level, memAddress(message));
    }

    public static void YGLogWithConfig(@NativeType("const YGConfigRef") long config, @NativeType("YGLogLevel") int level, @NativeType("const char *") CharSequence message) {
        if (CHECKS) {
            check(config);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer messageEncoded = stack.UTF8(message);
            nYGLogWithConfig(config, level, memAddress(messageEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ YGAssert ] ---

    public static native void nYGAssert(boolean condition, long message);

    public static void YGAssert(@NativeType("bool") boolean condition, @NativeType("const char *") ByteBuffer message) {
        if (CHECKS) {
            checkNT1(message);
        }
        nYGAssert(condition, memAddress(message));
    }

    public static void YGAssert(@NativeType("bool") boolean condition, @NativeType("const char *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer messageEncoded = stack.UTF8(message);
            nYGAssert(condition, memAddress(messageEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ YGAssertWithNode ] ---

    public static native void nYGAssertWithNode(long node, boolean condition, long message);

    public static void YGAssertWithNode(@NativeType("const YGNodeRef") long node, @NativeType("bool") boolean condition, @NativeType("const char *") ByteBuffer message) {
        if (CHECKS) {
            check(node);
            checkNT1(message);
        }
        nYGAssertWithNode(node, condition, memAddress(message));
    }

    public static void YGAssertWithNode(@NativeType("const YGNodeRef") long node, @NativeType("bool") boolean condition, @NativeType("const char *") CharSequence message) {
        if (CHECKS) {
            check(node);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer messageEncoded = stack.UTF8(message);
            nYGAssertWithNode(node, condition, memAddress(messageEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ YGAssertWithConfig ] ---

    public static native void nYGAssertWithConfig(long config, boolean condition, long message);

    public static void YGAssertWithConfig(@NativeType("const YGConfigRef") long config, @NativeType("bool") boolean condition, @NativeType("const char *") ByteBuffer message) {
        if (CHECKS) {
            check(config);
            checkNT1(message);
        }
        nYGAssertWithConfig(config, condition, memAddress(message));
    }

    public static void YGAssertWithConfig(@NativeType("const YGConfigRef") long config, @NativeType("bool") boolean condition, @NativeType("const char *") CharSequence message) {
        if (CHECKS) {
            check(config);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer messageEncoded = stack.UTF8(message);
            nYGAssertWithConfig(config, condition, memAddress(messageEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ YGConfigNew ] ---

    @NativeType("YGConfigRef")
    public static native long YGConfigNew();

    // --- [ YGConfigFree ] ---

    public static native void nYGConfigFree(long config);

    public static void YGConfigFree(@NativeType("const YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigFree(config);
    }

    // --- [ YGConfigCopy ] ---

    public static native void nYGConfigCopy(long dest, long src);

    public static void YGConfigCopy(@NativeType("const YGConfigRef") long dest, @NativeType("const YGConfigRef") long src) {
        if (CHECKS) {
            check(dest);
            check(src);
        }
        nYGConfigCopy(dest, src);
    }

    // --- [ YGConfigGetInstanceCount ] ---

    @NativeType("int32_t")
    public static native int YGConfigGetInstanceCount();

    // --- [ YGConfigSetPointScaleFactor ] ---

    /** Unsafe version of: {@link #YGConfigSetPointScaleFactor ConfigSetPointScaleFactor} */
    public static native void nYGConfigSetPointScaleFactor(long config, float pixelsInPoint);

    /**
     * Set this to number of pixels in 1 point to round calculation results. If you want to avoid rounding set {@code PointScaleFactor} to 0.
     *
     * @param config        
     * @param pixelsInPoint 
     */
    public static void YGConfigSetPointScaleFactor(@NativeType("const YGConfigRef") long config, float pixelsInPoint) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetPointScaleFactor(config, pixelsInPoint);
    }

    // --- [ YGConfigSetUseLegacyStretchBehaviour ] ---

    /** Unsafe version of: {@link #YGConfigSetUseLegacyStretchBehaviour ConfigSetUseLegacyStretchBehaviour} */
    public static native void nYGConfigSetUseLegacyStretchBehaviour(long config, boolean useLegacyStretchBehaviour);

    /**
     * Yoga previously had an error where containers would take the maximum space possible instead of the minimum like they are supposed to. In practice this
     * resulted in implicit behaviour similar to align-self: stretch; Because this was such a long-standing bug we must allow legacy users to switch back to
     * this behaviour.
     *
     * @param config                    
     * @param useLegacyStretchBehaviour 
     */
    public static void YGConfigSetUseLegacyStretchBehaviour(@NativeType("const YGConfigRef") long config, @NativeType("bool") boolean useLegacyStretchBehaviour) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetUseLegacyStretchBehaviour(config, useLegacyStretchBehaviour);
    }

    // --- [ YGConfigSetExperimentalFeatureEnabled ] ---

    /** Unsafe version of: {@link #YGConfigSetExperimentalFeatureEnabled ConfigSetExperimentalFeatureEnabled} */
    public static native void nYGConfigSetExperimentalFeatureEnabled(long config, int feature, boolean enabled);

    /**
     * @param config  
     * @param feature must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
     * @param enabled 
     */
    public static void YGConfigSetExperimentalFeatureEnabled(@NativeType("const YGConfigRef") long config, @NativeType("YGExperimentalFeature") int feature, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetExperimentalFeatureEnabled(config, feature, enabled);
    }

    // --- [ YGConfigIsExperimentalFeatureEnabled ] ---

    /** Unsafe version of: {@link #YGConfigIsExperimentalFeatureEnabled ConfigIsExperimentalFeatureEnabled} */
    public static native boolean nYGConfigIsExperimentalFeatureEnabled(long config, int feature);

    /**
     * @param config  
     * @param feature must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean YGConfigIsExperimentalFeatureEnabled(@NativeType("const YGConfigRef") long config, @NativeType("YGExperimentalFeature") int feature) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigIsExperimentalFeatureEnabled(config, feature);
    }

    // --- [ YGConfigSetUseWebDefaults ] ---

    /** Unsafe version of: {@link #YGConfigSetUseWebDefaults ConfigSetUseWebDefaults} */
    public static native void nYGConfigSetUseWebDefaults(long config, boolean enabled);

    /**
     * Using the web defaults is the prefered configuration for new projects. Usage of non web defaults should be considered as legacy.
     *
     * @param config  
     * @param enabled 
     */
    public static void YGConfigSetUseWebDefaults(@NativeType("const YGConfigRef") long config, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetUseWebDefaults(config, enabled);
    }

    // --- [ YGConfigGetUseWebDefaults ] ---

    public static native boolean nYGConfigGetUseWebDefaults(long config);

    @NativeType("bool")
    public static boolean YGConfigGetUseWebDefaults(@NativeType("const YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetUseWebDefaults(config);
    }

    // --- [ YGConfigSetNodeClonedFunc ] ---

    public static native void nYGConfigSetNodeClonedFunc(long config, long callback);

    public static void YGConfigSetNodeClonedFunc(@NativeType("const YGConfigRef") long config, @NativeType("const YGNodeClonedFunc") YGNodeClonedFuncI callback) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetNodeClonedFunc(config, callback.address());
    }

    // --- [ YGConfigGetDefault ] ---

    @NativeType("YGConfigRef")
    public static native long YGConfigGetDefault();

    // --- [ YGConfigSetContext ] ---

    public static native void nYGConfigSetContext(long config, long context);

    public static void YGConfigSetContext(@NativeType("const YGConfigRef") long config, @NativeType("void *") long context) {
        if (CHECKS) {
            check(config);
            check(context);
        }
        nYGConfigSetContext(config, context);
    }

    // --- [ YGConfigGetContext ] ---

    public static native long nYGConfigGetContext(long config);

    @NativeType("void *")
    public static long YGConfigGetContext(@NativeType("const YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetContext(config);
    }

    // --- [ YGSetMemoryFuncs ] ---

    public static native void nYGSetMemoryFuncs(long ygmalloc, long yccalloc, long ygrealloc, long ygfree);

    public static void YGSetMemoryFuncs(@NativeType("YGMalloc") YGMallocI ygmalloc, @NativeType("YGCalloc") YGMallocI yccalloc, @NativeType("YGRealloc") YGReallocI ygrealloc, @NativeType("YGFree") YGFreeI ygfree) {
        nYGSetMemoryFuncs(ygmalloc.address(), yccalloc.address(), ygrealloc.address(), ygfree.address());
    }

    // --- [ YGAlignToString ] ---

    /** Unsafe version of: {@link #YGAlignToString AlignToString} */
    public static native long nYGAlignToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table> */
    @NativeType("const char *")
    public static String YGAlignToString(@NativeType("YGAlign") int value) {
        long __result = nYGAlignToString(value);
        return memASCII(__result);
    }

    // --- [ YGDimensionToString ] ---

    /** Unsafe version of: {@link #YGDimensionToString DimensionToString} */
    public static native long nYGDimensionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDimensionWidth DimensionWidth}</td><td>{@link #YGDimensionHeight DimensionHeight}</td></tr></table> */
    @NativeType("const char *")
    public static String YGDimensionToString(@NativeType("YGDimension") int value) {
        long __result = nYGDimensionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDirectionToString ] ---

    /** Unsafe version of: {@link #YGDirectionToString DirectionToString} */
    public static native long nYGDirectionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table> */
    @NativeType("const char *")
    public static String YGDirectionToString(@NativeType("YGDirection") int value) {
        long __result = nYGDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDisplayToString ] ---

    /** Unsafe version of: {@link #YGDisplayToString DisplayToString} */
    public static native long nYGDisplayToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDisplayFlex DisplayFlex}</td><td>{@link #YGDisplayNone DisplayNone}</td></tr></table> */
    @NativeType("const char *")
    public static String YGDisplayToString(@NativeType("YGDisplay") int value) {
        long __result = nYGDisplayToString(value);
        return memASCII(__result);
    }

    // --- [ YGEdgeToString ] ---

    /** Unsafe version of: {@link #YGEdgeToString EdgeToString} */
    public static native long nYGEdgeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    @NativeType("const char *")
    public static String YGEdgeToString(@NativeType("YGEdge") int value) {
        long __result = nYGEdgeToString(value);
        return memASCII(__result);
    }

    // --- [ YGExperimentalFeatureToString ] ---

    /** Unsafe version of: {@link #YGExperimentalFeatureToString ExperimentalFeatureToString} */
    public static native long nYGExperimentalFeatureToString(int value);

    /** @param value must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table> */
    @NativeType("const char *")
    public static String YGExperimentalFeatureToString(@NativeType("YGExperimentalFeature") int value) {
        long __result = nYGExperimentalFeatureToString(value);
        return memASCII(__result);
    }

    // --- [ YGFlexDirectionToString ] ---

    /** Unsafe version of: {@link #YGFlexDirectionToString FlexDirectionToString} */
    public static native long nYGFlexDirectionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGFlexDirectionColumn FlexDirectionColumn}</td><td>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</td><td>{@link #YGFlexDirectionRow FlexDirectionRow}</td></tr><tr><td>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</td></tr></table> */
    @NativeType("const char *")
    public static String YGFlexDirectionToString(@NativeType("YGFlexDirection") int value) {
        long __result = nYGFlexDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGJustifyToString ] ---

    /** Unsafe version of: {@link #YGJustifyToString JustifyToString} */
    public static native long nYGJustifyToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGJustifyFlexStart JustifyFlexStart}</td><td>{@link #YGJustifyCenter JustifyCenter}</td><td>{@link #YGJustifyFlexEnd JustifyFlexEnd}</td><td>{@link #YGJustifySpaceBetween JustifySpaceBetween}</td><td>{@link #YGJustifySpaceAround JustifySpaceAround}</td></tr></table> */
    @NativeType("const char *")
    public static String YGJustifyToString(@NativeType("YGJustify") int value) {
        long __result = nYGJustifyToString(value);
        return memASCII(__result);
    }

    // --- [ YGLogLevelToString ] ---

    /** Unsafe version of: {@link #YGLogLevelToString LogLevelToString} */
    public static native long nYGLogLevelToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td><td>{@link #YGLogLevelFatal LogLevelFatal}</td></tr></table> */
    @NativeType("const char *")
    public static String YGLogLevelToString(@NativeType("YGLogLevel") int value) {
        long __result = nYGLogLevelToString(value);
        return memASCII(__result);
    }

    // --- [ YGMeasureModeToString ] ---

    /** Unsafe version of: {@link #YGMeasureModeToString MeasureModeToString} */
    public static native long nYGMeasureModeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGMeasureModeUndefined MeasureModeUndefined}</td><td>{@link #YGMeasureModeExactly MeasureModeExactly}</td><td>{@link #YGMeasureModeAtMost MeasureModeAtMost}</td></tr></table> */
    @NativeType("const char *")
    public static String YGMeasureModeToString(@NativeType("YGMeasureMode") int value) {
        long __result = nYGMeasureModeToString(value);
        return memASCII(__result);
    }

    // --- [ YGNodeTypeToString ] ---

    /** Unsafe version of: {@link #YGNodeTypeToString NodeTypeToString} */
    public static native long nYGNodeTypeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGNodeTypeDefault NodeTypeDefault}</td><td>{@link #YGNodeTypeText NodeTypeText}</td></tr></table> */
    @NativeType("const char *")
    public static String YGNodeTypeToString(@NativeType("YGNodeType") int value) {
        long __result = nYGNodeTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGOverflowToString ] ---

    /** Unsafe version of: {@link #YGOverflowToString OverflowToString} */
    public static native long nYGOverflowToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGOverflowVisible OverflowVisible}</td><td>{@link #YGOverflowHidden OverflowHidden}</td><td>{@link #YGOverflowScroll OverflowScroll}</td></tr></table> */
    @NativeType("const char *")
    public static String YGOverflowToString(@NativeType("YGOverflow") int value) {
        long __result = nYGOverflowToString(value);
        return memASCII(__result);
    }

    // --- [ YGPositionTypeToString ] ---

    /** Unsafe version of: {@link #YGPositionTypeToString PositionTypeToString} */
    public static native long nYGPositionTypeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGPositionTypeRelative PositionTypeRelative}</td><td>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</td></tr></table> */
    @NativeType("const char *")
    public static String YGPositionTypeToString(@NativeType("YGPositionType") int value) {
        long __result = nYGPositionTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGPrintOptionsToString ] ---

    /** Unsafe version of: {@link #YGPrintOptionsToString PrintOptionsToString} */
    public static native long nYGPrintOptionsToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGPrintOptionsLayout PrintOptionsLayout}</td><td>{@link #YGPrintOptionsStyle PrintOptionsStyle}</td><td>{@link #YGPrintOptionsChildren PrintOptionsChildren}</td></tr></table> */
    @NativeType("const char *")
    public static String YGPrintOptionsToString(@NativeType("YGPrintOptions") int value) {
        long __result = nYGPrintOptionsToString(value);
        return memASCII(__result);
    }

    // --- [ YGUnitToString ] ---

    /** Unsafe version of: {@link #YGUnitToString UnitToString} */
    public static native long nYGUnitToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGUnitUndefined UnitUndefined}</td><td>{@link #YGUnitPoint UnitPoint}</td><td>{@link #YGUnitPercent UnitPercent}</td><td>{@link #YGUnitAuto UnitAuto}</td></tr></table> */
    @NativeType("const char *")
    public static String YGUnitToString(@NativeType("YGUnit") int value) {
        long __result = nYGUnitToString(value);
        return memASCII(__result);
    }

    // --- [ YGWrapToString ] ---

    /** Unsafe version of: {@link #YGWrapToString WrapToString} */
    public static native long nYGWrapToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGWrapNoWrap WrapNoWrap}</td><td>{@link #YGWrapWrap WrapWrap}</td><td>{@link #YGWrapReverse WrapReverse}</td></tr></table> */
    @NativeType("const char *")
    public static String YGWrapToString(@NativeType("YGWrap") int value) {
        long __result = nYGWrapToString(value);
        return memASCII(__result);
    }

}